import java.util.*;
import java.util.stream.*;

class test {
	public static void main(String... args) {
		Random rnd = new Random();
		//IntStream is1 = IntStream.generate(() -> (int) (Math.random() * 100));
		IntStream is1 = rnd.ints();
		IntStream is2 = IntStream.iterate(1, s -> s + 2);

		is1.limit(5).forEach(System.out::println);
		is2.limit(5).forEach(System.out::println);
	}
}
