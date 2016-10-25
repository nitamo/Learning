import java.util.stream.*;
import java.util.*;
class test {
	public static void main(String... args) {
		Stream<String> str = Stream.of("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
//		System.out.println(str.count());
		System.out.println(str.max(Comparator.comparing(String::length)));
	}
}
