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
		System.out.println("After sorting using Collections.sort");
		printBooks(booksList);
		Collections.sort(booksList,
			Comparator.comparingInt(Book::getId));
		System.out.println("After sorting using nitty Comparator");
		printBooks(booksList);
	}

	public static void printBooks(List<? extends Book> booksList) {
		for(Book b : booksList)
			System.out.println(b);
	}
}
