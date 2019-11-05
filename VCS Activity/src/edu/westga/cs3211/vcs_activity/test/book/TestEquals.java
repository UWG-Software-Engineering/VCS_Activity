package edu.westga.cs3211.vcs_activity.test.book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Book;

class TestEquals {

	@Test
	void testIsEqual() {
		Book book1 = new Book("Sherlock Holmes", 250);
		Book book2 = new Book("Sherlock Holmes", 250);
		
		assertEquals(true, book1.equals(book2));
	}
	
	@Test
	void testIsNotEqual() {
		Book book1 = new Book("Sherlock Holmes", 250);
		Book book2 = new Book("Sherlock Holmes", 700);
		
		assertEquals(false, book1.equals(book2));
	}

}
