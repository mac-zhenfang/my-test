package common;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;

public class TestGSBHA {
	static Options options = new Options();
	static {
		Option backup = OptionBuilder.withDescription(" to backup").create(
				"backup");

		Option redo = OptionBuilder.withDescription(" to redo").create("redo");

		Option remove = OptionBuilder.withDescription(" to remove").create(
				"remove");

		Option start = OptionBuilder.withDescription(" to start").create(
				"start");

		Option init = OptionBuilder.withDescription(" to init").create("init");

		Option stop = OptionBuilder.withDescription(" to stop").create("stop");

		Option status = OptionBuilder.withDescription(" to stop").create(
				"status");

		options.addOption(backup);
		options.addOption(redo);
		options.addOption(remove);
		options.addOption(start);
		options.addOption(stop);
		options.addOption(status);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		//System.out.println(" >>> TEST GSB HA <<<");
		CommandLineParser parser = new PosixParser();

		CommandLine cmd = parser.parse(options, args);

		if (cmd.hasOption("start")) {
			System.out.println("SUCCESS");
		} else if (cmd.hasOption("init")) {
			System.out.println("SUCCESS");
		} else if (cmd.hasOption("remove")) {
			System.out.println("SUCCESS");
		} else if (cmd.hasOption("backup")) {
			System.out.println("SUCCESS");
		} else if (cmd.hasOption("redo")) {
			System.out.println("SUCCESS");
		} else if (cmd.hasOption("status")) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}

		System.exit(0);

	}

}
