import java.util.stream.*;

class two_streams_test {
	synchronized static void printMe(String name) {
		//try { Thread.sleep(250); }
		//catch (Exception e) {}
		System.out.print(name);
	}

	public static void main(String... args) { 
		Stream<Character> st1 = Stream
			.iterate('a', it -> { 
				try { Thread.sleep(250); }
				catch (Exception e) {}
				return (char)(it + 1); })
			.peek(it -> printMe("Stream 1: "))
			.limit(26);
		
		Stream<Character> st2 = Stream
			.iterate('z', it -> { 
				try { Thread.sleep(250); }
				catch (Exception e) {}
				return (char)(it - 1); })
			.peek(it -> printMe("Stream 2: "))
			.limit(26);

		Stream.concat(st1, st2)
			.parallel()
			.forEach(System.out::println);
	}
}
