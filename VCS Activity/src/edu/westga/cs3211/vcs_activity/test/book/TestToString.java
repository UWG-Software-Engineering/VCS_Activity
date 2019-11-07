package edu.westga.cs3211.vcs_activity.test.book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Book;

/**
 * 
 * @author Justin Cintron
 * 
 */

class TestToString {

    @Test
    void test() {
        var book = new Book("A Dog's Tale", 55);
        var result = book.toString();
        System.out.println(result);
        assertEquals("A Dog's Tale has 55 number of pages.", result);
    }

}
