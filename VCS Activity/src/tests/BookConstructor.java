import static org.junit.jupiter.api.Assertions.*;
import model.Book;
import org.junit.jupiter.api.Test;

public class BookConstructor {

	@Test
	void testValidInputs() {
		Book book = new Book("Title", "Author");
		assertEquals("Title", book.getTitle());
		assertEquals("Author", book.getAuthor());
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
