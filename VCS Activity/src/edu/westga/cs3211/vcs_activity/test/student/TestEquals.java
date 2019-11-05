package edu.westga.cs3211.vcs_activity.test.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Student;

/**
 * Tests Student::equals() method.
 * 
 * @author Thomas Whaley
 *
 */
public class TestEquals {

	@Test
	public void testSameComparison() {
		Student testStudent = new Student();
		Student otherTestStudent = new Student();
		
		assertEquals(true, testStudent.equals(otherTestStudent));
	}
	
	@Test
	public void testFailingSameComparison() {
		Student testStudent = new Student();
		Student otherTestStudent = new Student();
		
		assertEquals(false, testStudent.equals(otherTestStudent));
	}

	@Test
	public void testFailingDifferentComparison() {
		Student testStudent = new Student();
		
		assertEquals(false, testStudent.equals(null));
	}
}
