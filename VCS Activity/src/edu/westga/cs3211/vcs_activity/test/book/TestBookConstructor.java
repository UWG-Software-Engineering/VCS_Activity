package edu.westga.cs3211.vcs_activity.test.book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Book;
import edu.westga.cs3211.vcs_activity.model.Car;

class TestBookConstructor {

	@Test
	void testValidConstruction() {
		Book book = new Book("Title", 50);
		assertEquals("Title", book.getTitle());
		assertEquals(50, book.getPageCount());
	}
	
	@Test
	void testEmptyTitleThrows() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book("", 50);
		});
	}
	
	@Test
	void testInvalidPageCountAtBoundary() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book("Title", 0);
		});
	}
	
	@Test
	void testInvalidPageCountAtExtreme() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book("Title", -100);
		});
	}
	
	@Test
	void testNullTitle() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book(null, 50);
		});
	}

}
