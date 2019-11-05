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
		Student testStudent = new Student("Luke", 90);
		Student otherTestStudent = new Student("Luke", 90);
		
		assertEquals(true, testStudent.equals(otherTestStudent));
	}
	
	@Test
	public void testFailingSameComparison() {
		Student testStudent = new Student("Luke", 90);
		Student otherTestStudent = new Student("Ross", 90);
		
		assertEquals(false, testStudent.equals(otherTestStudent));
	}

	@Test
	public void testFailingDifferentComparison() {
		Student testStudent = new Student("Luke", 90);
		
		assertEquals(false, testStudent.equals(null));
	}
}
