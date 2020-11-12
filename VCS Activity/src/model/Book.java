/**
 * Represents the Book class
 * @author Anna McSwain, Amelia Reynolds, and Cody Vollrath
 *
 */
public class Book {
	private String title;
	private String author;
	
	/**
	 * Creates a book object
	 * @param title the title of the book
	 * @param author the author of the book
	 */
	public Book(String title, String author) {
		if(title == null)
		{
			throw new IllegalArgumentException("The title cannot be null");
		}
		if(author == null) {
			throw new IllegalArgumentException("The author cannot be null");
		}
		if(title.isEmpty()) {
			throw new IllegalArgumentException("The title cannot be empty");
		}
		if(author.isEmpty()) {
			throw new IllegalArugmentException("The author cannot be empty");
		}
		this.title = title;
		this.author = author;
	}
	
	/**
	 * Gets the title of the book
	 * @return the book title
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Gets the author of the book
	 * @return the author of the book
	 */
	public String getAuthor() {
		return this.author;
	}
	/**
	 * Checks the equality of a book object
	 * @param obj an object.
	 * @return a boolean indiciation if the object is equal to this instance
	 */
	@override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book book = (Book)obj;
			boolean isTitleEqual = this.title.equals(book.title);
			boolean isAuthorEqual = this.title.equals(book.author);
			boolean areTheyBothEqual = isTitleEqual && isAuthorEqual;
			return areTheyBothEqual;
		}
		return false;
	}
}
