import java.util.stream.*;
import java.util.*;
class test {
	public static void main(String... args) {
		Stream<String> str = Stream.of("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
//		System.out.println(str.count());
		System.out.println(str.max(Comparator.comparing(String::length)));
		System.out.println(fib(42L));
	}

	static long fib(long n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fib(n-2) + fib(n-1);
	}
}
