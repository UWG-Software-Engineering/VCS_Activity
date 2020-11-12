import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookEqualsTest {

	private Book testBook;
	@Setup
	public void setUp() {
		this.testBook = new Book("Test Title", "That Author");
	}
	
	@Test
	public void testEqualsOnNull() {
		assertFalse(this.testBook.equals(null));
	}
	
	@Test
	public void testEqualsOnIdenticalObject() {
		assertTrue(this.testBook.equals(new Book("Test Title", "That Author")));
	}
	
	@Test
	public void testEqualsOnNonidenticalObject() {
		assertFalse(this.testBook.equals(new Book("The different title", "The different author")));
	}
	
	@Test
	public void testEqualsOnDifferentObjects() {
		String value = new String("Data");
		assertFalse(this.testBook.equals(value));
	}

}
