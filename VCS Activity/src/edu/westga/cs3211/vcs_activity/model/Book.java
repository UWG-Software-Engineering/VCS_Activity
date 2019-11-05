package edu.westga.cs3211.vcs_activity.model;
/**
 * 
 * @author Justin Cintron, Jake Pefinis
 *
 */
public class Book {

	int pageCount;
	String title;
	
	/**
	 * Instantiates a new book.
	 * 
	 * @precondition title != "" && pageCount > 0
	 * @postcondition getTitle() == title && getPageCount() == pageCount
	 *
	 * @param title the title
	 * @param pageCount the page count
	 */
	public Book(String title, int pageCount) {
		
		if (title == "") {
			throw new IllegalArgumentException("Title cannot be empty");
		}
		
		if (title == null) {
			throw new IllegalArgumentException("Title cannot be null");
		}
		
		if (pageCount <= 0) {
			throw new IllegalArgumentException("pageCount must be greater than 0");
		}
		
		this.title = title;
		this.pageCount = pageCount;
	}
	
	public boolean equals(Book other) {
		boolean isEqual = true;
		
		if (!this.title.equals(other.title)) {
			isEqual = false;
		}
		if (this.pageCount != other.pageCount) {
			isEqual = false;
		}
		
		return isEqual;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString(int pageCount) {
		String pageFormated = "Page : " + pageCount;
		return pageFormated;
	}
}

