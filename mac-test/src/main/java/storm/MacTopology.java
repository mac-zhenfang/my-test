package storm;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import backtype.storm.Config;
import backtype.storm.StormSubmitter;
import backtype.storm.drpc.LinearDRPCTopologyBuilder;
import backtype.storm.generated.StormTopology;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.IBasicBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

/**
 * This topology demonstrates Storm's stream groupings and multilang
 * capabilities.
 */
public class MacTopology {
	public static class SplitSentence extends BaseBasicBolt {
		final String SEPERATOR = ",";

		@Override
		public void prepare(Map stormConf, TopologyContext context) {
			System.out.println(" ====== Start spllit ======");
		}

		@Override
		public void cleanup() {
		}

		@Override
		public void execute(Tuple tuple, BasicOutputCollector collector) {
			String words = tuple.getString(0);
			String[] wordsArr = words.split(SEPERATOR);
			for (String word : wordsArr) {
				collector.emit(new Values(word));
			}
		}

		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			declarer.declare(new Fields("word"));
		}
	}

	public static class WordCount extends BaseBasicBolt {
		Map<String, Integer> counts = new HashMap<String, Integer>();

		@Override
		public void execute(Tuple tuple, BasicOutputCollector collector) {
			String word = tuple.getString(0);
			Integer count = counts.get(word);
			if (count == null)
				count = 0;
			count++;
			counts.put(word, count);
			collector.emit(new Values(word, count));
		}

		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			declarer.declare(new Fields("word", "count"));
		}
	}

	public static class PrinterBolt extends BaseBasicBolt {

		@Override
		public void execute(Tuple tuple, BasicOutputCollector collector) {
			System.out.println(" word : " + tuple.getStringByField("word")
					+ " count: " + tuple.getStringByField("count"));
		}

		@Override
		public void declareOutputFields(OutputFieldsDeclarer ofd) {
		}

	}

	public static class ExclaimBolt implements IBasicBolt {

		public void prepare(Map conf, TopologyContext context) {
		}

		public void execute(Tuple tuple, BasicOutputCollector collector) {
			String input = tuple.getString(1);
			collector.emit(new Values(tuple.getValue(0), input + "!"));
		}

		public void cleanup() {
		}

		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			declarer.declare(new Fields("id", "result"));
		}

		@Override
		public Map<String, Object> getComponentConfiguration() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	public static StormTopology createBasisTopology() {
		TopologyBuilder builder = new TopologyBuilder();

		builder.setSpout("spout", new RandomSentenceSpout(), 1);

		builder.setBolt("split", new SplitSentence(), 8).shuffleGrouping(
				"spout");
		builder.setBolt("count", new WordCount(), 12).fieldsGrouping("split",
				new Fields("word"));
		builder.setBolt("print", new PrinterBolt(), 1);
		
		return builder.createTopology();
	}

	public static StormTopology createDRPCTopology() {
		LinearDRPCTopologyBuilder builder = new LinearDRPCTopologyBuilder(
				"mac-test-drpc");
		builder.addBolt(new ExclaimBolt(), 3);
		return builder.createRemoteTopology();
	}

	public static void main(String[] args) throws Exception {
		File directory = new File("");
		String path = directory.getAbsolutePath();
		String jarName = "WordCountTopology";

		execJar("storm.starter.WordCountTopology", jarName);

		System.setProperty("storm.jar", path + "/" + jarName + ".jar");

		// StormTopology topology = createBasisTopology();
		StormTopology topology = createDRPCTopology();
		Config conf = new Config();
		conf.setDebug(true);

		// if(args!=null && args.length > 0) {
		conf.setNumWorkers(3);
		conf.put(Config.NIMBUS_HOST, "127.0.0.1");
		conf.put(Config.NIMBUS_THRIFT_PORT, 6627);
		StormSubmitter.submitTopology("drpc-word-ExclaimBolt", conf, topology);
		// }
	}

	public static void execJar(String clz, String jarName) throws Exception {

		String[] clzFolders = clz.split("\\.");
		String clzName = clzFolders[2].concat(".class");

		URL classRes = Class.forName(clz).getResource(clzName);
		System.out.println(classRes.getAuthority());
		String folderClz = clz.replaceAll("\\.", "\\/");
		File directory = new File("");
		String path = directory.getAbsolutePath() + "/"
				+ folderClz.substring(0, folderClz.lastIndexOf("/"));
		String rmPath = "rm -rf " + path;
		String mkdirPath = "mkdir -p " + path;
		System.out.println(" mkdir  path " + mkdirPath);
		Runtime.getRuntime().exec(rmPath);
		Runtime.getRuntime().exec(mkdirPath);
		folderClz = folderClz.concat(".class");

		clz = clz.concat(".class");
		System.out.println("folderClz " + folderClz);

		System.out.println("path " + path);

		String cpCmd = "cp -f " + classRes.getPath() + " "
				+ directory.getAbsolutePath() + "/" + folderClz;
		System.out.println("cp cmd  " + cpCmd);
		Runtime.getRuntime().exec(cpCmd);

		Process process = Runtime.getRuntime().exec(
				"jar cvf " + jarName + ".jar " + folderClz);
		InputStream errIs = process.getErrorStream();
		String as = new String();
		errIs.read(as.getBytes());
		InputStream outIs = process.getInputStream();
		outIs.read(as.getBytes());
		System.out.println(as);
	}
}