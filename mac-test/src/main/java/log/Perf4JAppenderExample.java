package log;

import org.apache.log4j.Logger;

public class Perf4JAppenderExample {
	public static void main (String[] args) throws Exception {
        // note that the log4j framework will automatically load the log4j.xml
        // file if it is in a root directory on the classpath

        Logger rootLogger = Logger.getRootLogger();

        for (int i = 0; i < 2; i++) {
            // By default the Log4JStopWatch uses the Logger named org.perf4j.TimingLogger
            StopWatch stopWatch = new Log4JStopWatch();

            // for demo purposes just sleep
            Thread.sleep((long) (Math.random() * 1000L));

            rootLogger.info("Normal logging messages only go to the console");

            // Calling lap() stops timing for the previous block, sends the
            // message to the log4j Logger, and starts timing the next block.
            stopWatch.lap("firstBlock");

            Thread.sleep((long) (Math.random() * 2000L));

            stopWatch.stop("secondBlock");
        }

    }
}
