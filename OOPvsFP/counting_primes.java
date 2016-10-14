import java.util.stream.IntStream;
import java.time.*;

class counting_primes {
	public static void main(String... args) {
		LocalTime startTime = LocalTime.now();
		System.out.println(countPrimes(Integer.parseInt(args[0])));
		LocalTime stopTime = LocalTime.now();
		System.out.println(Duration.between(startTime, stopTime));
	}

	static long countPrimes(int upTo) {
		return IntStream.range(1, upTo)
			.filter(counting_primes::isPrime)
			.count();
	}

	static boolean isPrime(int number) {
		return IntStream.range(2, number)
			.allMatch(x -> (number % x) != 0);
	}
}
