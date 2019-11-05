package edu.westga.cs3211.vcs_activity.model;
/**
 * 
 * @author Justin Cintron
 *
 */
public class Book {

	int pageCount;
	String title;
	
	public String toString(int pageCount) {
		String pageFormated = "Page : " + pageCount;
		return pageFormated;
	}
}

