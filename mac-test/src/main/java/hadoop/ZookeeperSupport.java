package hadoop;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

public class ZookeeperSupport {
	public static final Log LOG = LogFactory.getLog(ZookeeperSupport.class);
	protected ZooKeeper zookeeper;
	private final static int SESSION_TIME_OUT = 6000;
	private final static String NAMENODE_PATH = "/hadoop/namenodes";

	public ZookeeperSupport(String zkAddress) {
		this(zkAddress, SESSION_TIME_OUT);
	}

	public ZookeeperSupport(String connStr, int sessionTimeOut) {
		try {
			zookeeper = new ZooKeeper(connStr, sessionTimeOut, new Watcher() {
				@Override
				public void process(WatchedEvent event) {
					LOG.info("zookeeper event:" + event);
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(
					"Connection with Zookeeper can not be established.", e);
		}

	}

	public void addNameNodeAddress(String address) {
		try {
			if (zookeeper.exists(NAMENODE_PATH, false) == null) {
				zookeeper.create(NAMENODE_PATH, null, null, CreateMode.PERSISTENT);
			}
			if(zookeeper.exists(NAMENODE_PATH+"/"+address, false) == null){
				zookeeper.create(NAMENODE_PATH+"/"+address, null, null, CreateMode.EPHEMERAL_SEQUENTIAL);
			}
		} catch (KeeperException e) {
			LOG.error(e);
		} catch (InterruptedException e) {
			LOG.error(e);
		}
		
	}

	public boolean addNameNodeChildrenChangeWatcher(Watcher watcher) {
		boolean success = false;
		try {
			Stat stat = zookeeper.exists(NAMENODE_PATH, watcher);
			if (null != stat) {
				success = true;
			}
		} catch (KeeperException e) {
			LOG.error(e);
		} catch (InterruptedException e) {
			LOG.error(e);
		}
		return success;
	}

	public String getNameNodeAddress() {
		return getNameNodeAddresses().get(0);
	}

	public List<String> getNameNodeAddresses() {
		List<String> returnPaths = new ArrayList<String>();
		try {
			List<String> paths = zookeeper.getChildren(NAMENODE_PATH, false);
			for (String path : paths) {
				String fixedPath = path.substring(path.indexOf(NAMENODE_PATH)
						+ NAMENODE_PATH.length());
				returnPaths.add(fixedPath);
			}

		} catch (Exception e) {
			LOG.error(e);
		}
		return returnPaths;
	}
}