import java.time.*;
import java.util.*;

class test {
	static List<String> list = new ArrayList<>();

	public static void main(String... args) throws InterruptedException {
		LocalTime lt1 = LocalTime.now();

		for(int i = 0; i < 1_000_000; i++) {
			list.add(new String(""));
		}

		LocalTime lt2 = LocalTime.now();
		System.out.println(Duration.between(lt1, lt2));

		while(true) {
			list.size();
			Thread.sleep(10_000);
		}
	}
}
