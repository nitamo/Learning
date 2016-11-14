import java.util.concurrent.*;
import java.util.stream.*;

class Manager {
	int count;

	public void increaseCount() {
		System.out.print( ++count + " ");
	}
}

public class test {
	final static ExecutorService service = Executors.newFixedThreadPool(20);
	
	public static void main(String... args) { 

		try {
			final Manager manager = new Manager();

			IntStream.range(0, 10)
				.forEach(it -> service.submit(manager::increaseCount));
		}
		finally {
			if(null != service) service.shutdown();
		}
	}
}
