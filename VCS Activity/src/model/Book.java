
public class Book {
	private String title;
	private String author;
	
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
}
