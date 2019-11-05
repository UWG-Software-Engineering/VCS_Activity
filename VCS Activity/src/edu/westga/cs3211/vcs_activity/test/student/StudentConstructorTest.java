package edu.westga.cs3211.vcs_activity.test.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Student;

class StudentConstructorTest {

	@Test
	void testNameNull() {
		assertThrows(IllegalArgumentException.class, () -> new Student(null, 90));
	}
	
	@Test
	void testGradeNegative() {
		assertThrows(IllegalArgumentException.class, () -> new Student("Foo", -1));
	}
	
	@Test
	void testGradeZero() {
		Student student = new Student("Foo", 0);
		assertEquals("Foo", student.getName());
		assertEquals(0, student.getGrade());
	}
	
	@Test
	void testGradeInRange() {
		Student student = new Student("Foo", 90);
		assertEquals("Foo", student.getName());
		assertEquals(90, student.getGrade());
	}
	
	@Test
	void testGrade100() {
		Student student = new Student("Foo", 100);
		assertEquals("Foo", student.getName());
		assertEquals(100, student.getGrade());
	}
	
	@Test
	void testGradePositive() {
		assertThrows(IllegalArgumentException.class, () -> new Student("Foo", 101));
	}

}
