/**
 * 
 */
package storm;

import org.junit.Test;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.generated.StormTopology;

/**
 * @author zhefang
 *
 */
public class TestStorm {
	
	@Test
	public void testLocalStorm() throws Exception {
		LocalCluster cluster = new LocalCluster();
		Config config = new Config();
		StormTopology simple = MacTopology.createBasisTopology();
		cluster.submitTopology("word_count", config, simple);
		Thread.currentThread().sleep(10000);
		cluster.shutdown();
	}
}
