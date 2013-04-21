/**
 * 
 */
package hadoop;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.DatanodeID;
import org.apache.hadoop.hdfs.protocol.LocatedBlock;
import org.apache.hadoop.hdfs.server.protocol.DatanodeCommand;
import org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;
import org.apache.hadoop.hdfs.server.protocol.NamespaceInfo;
import org.apache.hadoop.hdfs.server.protocol.UpgradeCommand;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.net.NetUtils;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * this is a proxy of the RPC namenode, the usage is to: 1. Get the config from
 * Zookeeper. 2. Init the real RPC NameNode 3. Get Notification from Zookeeper
 * and refresh the RPC 4. Lock RPC until another NameNode get connected.
 * 
 * @date 2010-12-28
 * @since: Hadoop-Hdfs
 * @author mac
 */
public class NameNodeZookeeperProxy implements DatanodeProtocol, Watcher {
	public static final Log LOG = LogFactory
			.getLog(NameNodeZookeeperProxy.class);
	public static final int DEFAULT_PORT = 8020;
	private DatanodeProtocol namenode;
	private final ReentrantReadWriteLock nameNodeFailoverLock = new ReentrantReadWriteLock();
	private final ZookeeperSupport zookeeperSupport;
	private final Configuration conf;

	public NameNodeZookeeperProxy(final Configuration conf) throws IOException {
		this.conf = conf;
		zookeeperSupport = new ZookeeperSupport(
				conf.get("hadoop.zookeeperAddress"));

		zookeeperSupport.addNameNodeChildrenChangeWatcher(this);
		initNameNode(conf);
	}

	private void initNameNode(final Configuration conf) {
		String address = null;
		try {
			nameNodeFailoverLock.writeLock().lock();
			/**
			 * The case is if we use active-standby mode. 
			 * 1. There is only one NameNode 
			 * 2. The another NameNode doesn't startup. Then the datanode need to wait until the another datanode startup.
			 * */
			while (address == null) {
				try {
					address = this.zookeeperSupport.getNameNodeAddress();

					// FIXME URI filesystemURI = FileSystem.getDefaultUri(conf);
					// String address = filesystemURI.getAuthority();
					InetSocketAddress isAddress = NetUtils.createSocketAddr(
							address, DEFAULT_PORT);
					namenode = (DatanodeProtocol) RPC.waitForProxy(
							DatanodeProtocol.class, DatanodeProtocol.versionID,
							isAddress, conf);
				} catch (Exception e) {
					LOG.error(e);
				}
			}
		} catch (Exception e) {
			LOG.error(e);
		} finally {
			nameNodeFailoverLock.writeLock().unlock();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.ipc.VersionedProtocol#getProtocolVersion(java.lang.
	 * String, long)
	 */
	@Override
	public long getProtocolVersion(String protocol, long clientVersion)
			throws IOException {
		ifLockCheck();
		return namenode.getProtocolVersion(protocol, clientVersion);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#registerDatanode
	 * (org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration)
	 */
	@Override
	public DatanodeRegistration registerDatanode(
			DatanodeRegistration registration) throws IOException {
		ifLockCheck();
		return namenode.registerDatanode(registration);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#sendHeartbeat
	 * (org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration, long, long,
	 * long, int, int)
	 */
	@Override
	public DatanodeCommand[] sendHeartbeat(DatanodeRegistration registration,
			long capacity, long dfsUsed, long remaining, int xmitsInProgress,
			int xceiverCount) throws IOException {
		ifLockCheck();
		return namenode.sendHeartbeat(registration, capacity, dfsUsed,
				remaining, xmitsInProgress, xceiverCount);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#blockReport(org
	 * .apache.hadoop.hdfs.server.protocol.DatanodeRegistration, long[])
	 */
	@Override
	public DatanodeCommand blockReport(DatanodeRegistration registration,
			long[] blocks) throws IOException {
		ifLockCheck();
		return namenode.blockReport(registration, blocks);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#blockReceived
	 * (org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration,
	 * org.apache.hadoop.hdfs.protocol.Block[], java.lang.String[])
	 */
	@Override
	public void blockReceived(DatanodeRegistration registration,
			Block[] blocks, String[] delHints) throws IOException {
		ifLockCheck();
		namenode.blockReceived(registration, blocks, delHints);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#errorReport(org
	 * .apache.hadoop.hdfs.server.protocol.DatanodeRegistration, int,
	 * java.lang.String)
	 */
	@Override
	public void errorReport(DatanodeRegistration registration, int errorCode,
			String msg) throws IOException {
		namenode.errorReport(registration, errorCode, msg);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#versionRequest()
	 */
	@Override
	public NamespaceInfo versionRequest() throws IOException {
		ifLockCheck();
		return namenode.versionRequest();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#processUpgradeCommand
	 * (org.apache.hadoop.hdfs.server.protocol.UpgradeCommand)
	 */
	@Override
	public UpgradeCommand processUpgradeCommand(UpgradeCommand comm)
			throws IOException {
		ifLockCheck();
		return namenode.processUpgradeCommand(comm);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#reportBadBlocks
	 * (org.apache.hadoop.hdfs.protocol.LocatedBlock[])
	 */
	@Override
	public void reportBadBlocks(LocatedBlock[] blocks) throws IOException {
		ifLockCheck();
		namenode.reportBadBlocks(blocks);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol#
	 * commitBlockSynchronization(org.apache.hadoop.hdfs.protocol.Block, long,
	 * long, boolean, boolean, org.apache.hadoop.hdfs.protocol.DatanodeID[])
	 */
	@Override
	public void commitBlockSynchronization(Block block,
			long newgenerationstamp, long newlength, boolean closeFile,
			boolean deleteblock, DatanodeID[] newtargets) throws IOException {
		ifLockCheck();
		namenode.commitBlockSynchronization(block, newgenerationstamp,
				newlength, closeFile, deleteblock, newtargets);

	}

	private void ifLockCheck() {
		nameNodeFailoverLock.readLock().lock();
	}

	@Override
	public void process(WatchedEvent event) {
		// if the namenode changes, to lock the process and reinit the address
		if (event.getType().compareTo(
				Watcher.Event.EventType.NodeChildrenChanged) == 0) {

			this.initNameNode(this.conf);
		}

		zookeeperSupport.addNameNodeChildrenChangeWatcher(this);
	}
}