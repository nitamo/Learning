import java.util.*;

class test {
	public static void main(String... args) { 
		List<Book> booksList = new ArrayList<>();

		booksList.add(new Book(5, "War and Peace"));
		booksList.add(new Book(1, "Crime and Punishment"));
		booksList.add(new Book(10, "Pride and Prejustice"));

		System.out.println("Before sorting");
		printBooks(booksList);
		Collections.sort(booksList);
		System.out.println("\nAfter sorting using Collections.sort");
		printBooks(booksList);
		Collections.sort(booksList,
			Comparator.comparingInt(Book::getId));
		System.out.println("\nAfter sorting using nitty Comparator");
		printBooks(booksList);

		System.out.println("\nTesting sorting order: direct, backwards");
		reverseComparatorTest(true);
		reverseComparatorTest(false);
	}

	public static void printBooks(List<? extends Book> booksList) {
		for(Book b : booksList)
			System.out.println(b);
	}

	public static void reverseComparatorTest(boolean direct) {
		Comparator<Integer> direComp = (o1, o2) -> o1 - o2;
		Comparator<Integer> backComp = (o1, o2) -> o2 - o1;

		List<Integer> list = Arrays.asList(5, 4, 7, 1);

		Comparator<Integer> comp = direct ? direComp : backComp;

		Collections.sort(list, comp);
		System.out.println(Arrays.toString(list.toArray()));
	}
}
