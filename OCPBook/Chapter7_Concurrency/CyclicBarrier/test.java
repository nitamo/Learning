import java.util.concurrent.*;

class Manager {
	void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			System.out.println("Started working");
			c1.await();
			System.out.println("Going on...");
			c2.await();
			System.out.println("Finished working");
		}
		catch(InterruptedException | BrokenBarrierException e) { }
	}
}

public class test {
	public static void main(String... args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		CyclicBarrier cb1 = new CyclicBarrier(3, () -> System.out.println("First barrier"));
		CyclicBarrier cb2 = new CyclicBarrier(3, () -> System.out.println("Second barrier"));

		Manager man = new Manager();

		try {
			for(int i = 0; i < 6; i++)
				executor.submit(() -> man.performTask(cb1, cb2));
			}
		finally {
			if(null != executor)
				executor.shutdown();
		}
	}
}
