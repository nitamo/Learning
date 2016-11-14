import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

class test5_2c {
	public static void main(String... args) {
		Stream<String> names = Stream.of("John", "Paul", "George", "John",
				"Paul", "John", "Ringo", "Ringo", "Ringo"); 
		
		Map<Long, List<String>> out = names.collect(collectingAndThen(groupingBy(name -> name, Collectors.counting()), test5_2c::transformMap));
		System.out.println( out);
	}

	public static Map<Long, List<String>> transformMap(Map<String, Long> input) {
		return input.entrySet().stream()
					.collect(groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, toList())));
	}
}
