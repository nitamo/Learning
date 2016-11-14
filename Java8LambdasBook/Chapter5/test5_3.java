import java.util.stream.*;
import java.util.*;

class test5_3 {
	public static final long NUM = 42;
	public static Map<Long, Long> map = new HashMap<>();

	public static void main(String... args) {

		for(long i = 0; i <= NUM; i++)
			map.computeIfAbsent(i, test5_3::fib);

		map.entrySet().stream().forEach(System.out::println);
	}

	public static long fib(long n) {

		if(n == 0) return 0;
		else if(n == 1) return 1;
		else {
			return map.computeIfAbsent(n - 2, test5_3::fib) + map.computeIfAbsent(n - 1, test5_3::fib);
		}
	}
}
