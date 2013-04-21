/**
 * 
 */
package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mac
 * 
 */
public class TestMRCluster {

	private static MRCluster cluster;

	@Before
	public void setup() throws Exception {
		if (null == cluster) {
			System.setProperty("test.system.hdrc.deployed.hadoopconfdir",
					"/var/hadoop-0.21.0/conf");
			Configuration conf = new Configuration();
//			conf.set("test.system.hdrc.hadoophome", "/var/hadoop-0.21.0");
//			conf.set("test.system.hdrc.hadoopconfdir",
//					"/var/hadoop-0.21.0/conf");
//			conf.set("test.system.hdrc.deployed.scripts.dir",
//					"/var/hadoop-0.21.0/bin");
//			conf.set("mapreduce.jobtracker.address", "localhost:9001");
//			conf.set("mapreduce.tasktracker.report.address", "localhost:9002");
			cluster = MRCluster.createCluster(conf);
			cluster.setUp();
		}
	}

	@Test
	public void testJobSubmission() throws Exception {
		Configuration conf = new Configuration(cluster.getConf());
		SleepJob job = new SleepJob();
		job.setConf(conf);
		Job rJob = job.createJob(1, 1, 100, 100, 100, 100);
		rJob = cluster.getJTClient().submitAndVerifyJob(rJob);
		cluster.getJTClient().verifyJobHistory(rJob.getJobID());
	}
}
