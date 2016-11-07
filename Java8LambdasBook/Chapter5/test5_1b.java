import java.util.*;
import java.util.stream.*;

class test5_1b {
	public static void main(String... args) {
		Stream<Integer> stream = Arrays.asList(1, 2, 3).stream();
		//int i = stream.reduce(0, (x, y) -> y++);
		//System.out.println( i);
		long l = stream.reduce(0L, test5_1b::inc, Long::sum);
		System.out.println( l);
	}

	public static <T> long inc(long acc, T x) {
		//System.out.println("acc=" + acc + ", x=" + x);
		return ++acc;
	}
}
