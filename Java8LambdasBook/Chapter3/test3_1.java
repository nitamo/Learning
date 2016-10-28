import java.util.*;
import java.util.stream.*;

class test3_1 {
	public static void main(String... args) {
		Stream<Integer> stream = Arrays.asList(1, 2, 3).stream();
		int i = stream.reduce(0, (x, y) -> x += y);
		System.out.println( i);
	}
}
