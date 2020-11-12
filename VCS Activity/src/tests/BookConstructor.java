import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookConstructor {

	@Test
	void testValidInputs() {
		
	}
	
	@Test 
	void testNullTitle() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> {
					Book book = new Book(null, "Author");	
				});
	}
	
	@Test 
	void testNullAuthor() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> {
					Book book = new Book("Title", null);	
				});
	}
	
	@Test
	void testEmptyTitle() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> {
					Book book = new Book("", "Author");	
				});
	}
	
	@Test
	void testEmptyAuthor() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> {
					Book book = new Book("Title", "");	
				});
	}

}
