package edu.westga.cs3211.vcs_activity.test.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Student;

class StudentToStringTest {

	@Test
	void testValidInfo() {
		Student student = new Student("csuser", 100);
		
		String result = student.toString();
		String expected = "Student:csuser grade:100";
		
		assertEquals(expected, result);
	}
}
