import java.util.*;
import java.util.stream.*;

class test3_7 {
	public static long countLowerCaseLetters(String string) {
		long i = string.chars()
			 .map(it -> (char)it)
		 	 .filter(it -> Character.isLowerCase(it))
		 	 .count();
		return i;
	}

	public static void main(String... args) {
		List<String> list = Arrays.asList("String", "Character", "Long");
		//List<String> list = Arrays.asList();

		Optional<String> result = list.stream()
					.max(Comparator.comparing(test3_7::countLowerCaseLetters));
		result.ifPresent(System.out::println);
	}
}	
