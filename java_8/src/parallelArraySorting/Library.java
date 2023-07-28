package parallelArraySorting;

import java.util.*;

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;

	}

	public String getAuthor() {
		return author;
	}

}

public class Library {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Java: The Complete Reference", "Herbert Schildt"));
		books.add(new Book("Clean Code", "Robert C. Martin"));
		books.add(new Book("Effective Java", "Joshua Bloch"));
		books.add(new Book("Head First Java", "Kathy Sierra and Bert Bates"));
		books.add(new Book("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"));

		String input = "Java"; // Input to search

		// Parallel sort the books based on their title
		books.parallelStream().sorted(Comparator.comparing(Book::getTitle))
				.forEach(book -> System.out.println(book.getTitle() + "by " + book.getAuthor()));

		// Search for books matching the input string
		boolean found = books.parallelStream().anyMatch(book -> book.getTitle().contains(input));
		if (found) {
			System.err.println("Book found with the title containing: " + input);
		} else {
			System.err.println(" No Book found with the title containing: " + input);
		}

	}

}
