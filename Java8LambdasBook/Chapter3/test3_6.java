import java.util.*;
import java.util.stream.*;

class test3_6 {
	public static void main(String... args) {
		long i = "String".chars()
				 .map(it -> (char)it)
				 .filter(it -> Character.isLowerCase(it))
				 .count();

		System.out.println( i );
	}
}
