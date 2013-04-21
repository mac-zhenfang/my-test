/**
 * 
 */
package image;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author trumanl@hz.webex.com
 * @since Oct 13, 2011
 * @version 1.0
 */
public class TestIm4J {

	/**
	 * @param args
	 * @throws IM4JavaException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException,
			InterruptedException, IM4JavaException {

		// ThreadPoolExecutor es = new ThreadPoolExecutor(1, 1, 0L,
		// TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10),
		// new BkServerThreadFactory("thumb"),
		// new ThreadPoolExecutor.CallerRunsPolicy());
		ExecutorService es = Executors.newFixedThreadPool(1);
		final AtomicInteger ai = new AtomicInteger(0);
		for (int i = 0; i < 100; i++) {
			es.execute(new Runnable() {

				@Override
				public void run() {
					try {
						System.out.println(" !#@!#!@#! --- start  --- "
								+ ai.get());

						// Process proc = Runtime.getRuntime().exec(
						// "convert /home/mac/image/thumnail20M.jpg 10*10 /home/mac/image/test/1"
						// + ai.incrementAndGet() + ".jpg");
						// Process proc =
						// Runtime.getRuntime().exec("ls /home/mac/image");
						JMagickImageConvert.resizeImage(
								"/home/mac/image/thumnail20M.jpg",
								"/home/mac/image/test/1" + ai.incrementAndGet()
										+ ".jpg", 128, 128);
						// proc.waitFor();
						// proc.wait(1000000);
						System.out.println(" !!! --- compelete --- " + ai.get());
						// Thread.sleep(1000);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IM4JavaException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});

			// JMagickImageConvert.resizeImage("E:/Working documents/thumbnail/Test/Coverage_ThumbNail.png",
			// "E:/Working documents/thumbnail/Test/result" + i+".jpg", 128,
			// 128);

		}

	}

}

class BkServerThreadFactory implements ThreadFactory {

	final ThreadGroup group;
	final AtomicInteger threadNumber = new AtomicInteger();
	final String namePrefix;
	final private boolean isDaemon;

	/**
	 * poolName is workerName, each worker will have a thread pool.
	 * 
	 * @param poolName
	 */
	public BkServerThreadFactory(String poolName) {
		this(poolName, false);
	}

	public BkServerThreadFactory(String poolName, boolean isDaemon) {
		this.isDaemon = isDaemon;
		SecurityManager s = System.getSecurityManager();
		group = (s != null) ? s.getThreadGroup() : Thread.currentThread()
				.getThreadGroup();
		namePrefix = poolName + "-T-";
	}

	public Thread newThread(Runnable r) {
		Thread t = new Thread(group, r, namePrefix
				+ threadNumber.getAndIncrement(), 0);
		t.setDaemon(isDaemon);
		if (t.getPriority() != Thread.NORM_PRIORITY)
			t.setPriority(Thread.NORM_PRIORITY);
		return t;
	}

}
