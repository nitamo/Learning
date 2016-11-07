import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import static java.util.stream.Collectors.maxBy;
import static java.util.Comparator.comparing;

class test5_2a {
	public static void main(String... args) {
		Stream<String> names = Stream.of("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
		
		//names.collect(maxBy(comparing(String::length))).ifPresent(System.out::println);

		String str = names.reduce("", (acc, s) -> 
			acc.length() < s.length() ? s : acc
		);
		System.out.println( str);
	}
}
