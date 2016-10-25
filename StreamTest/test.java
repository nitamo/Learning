import java.util.*;
import java.util.stream.*;

class test {
	public static void main(String... args) {
		//Stream generation and filtering
		Random rnd = new Random();
		//IntStream is1 = IntStream.generate(() -> (int) (Math.random() * 100));
		IntStream is1 = rnd.ints();
		IntStream is2 = IntStream.iterate(1, s -> s + 2);

		is1.limit(5).forEach(System.out::println);
		is2.limit(5).forEach(System.out::println);

		//Map collection testing
		Stream<String> sstr = Stream.of("Alpha", "Beta", "Gamma", "Delta");
		Map<String, Integer> omap1 = sstr.collect(
			Collectors.toMap(s -> s, String::length));
		System.out.println(omap1);

		Stream<String> sstr2 = Stream.of("Alpha", "Beta", "Gamma", "Delta");
		Map<Integer, String> omap2 = sstr2.collect(
			Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + "," + s2, TreeMap::new));
		System.out.println(omap2);
	}
}
