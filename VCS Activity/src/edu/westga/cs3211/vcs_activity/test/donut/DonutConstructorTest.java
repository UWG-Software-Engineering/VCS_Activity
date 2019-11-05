package edu.westga.cs3211.vcs_activity.test.donut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Donut;
import edu.westga.cs3211.vcs_activity.model.Student;

class DonutConstructorTest {

	@Test
	void testSuccessfulConstructor() {
		Donut donut = new Donut(0, true);
	}
	
	@Test
	void testCaloriesLessThan0() {
		assertThrows(IllegalArgumentException.class, () -> new Donut(-1, true));
	}
	
	@Test
	void testNameNull() {
		assertThrows(IllegalArgumentException.class, () -> new Student(null, 90));
	}
	@Test
	void testNameNull() {
		assertThrows(IllegalArgumentException.class, () -> new Student(null, 90));
	}
	@Test
	void testNameNull() {
		assertThrows(IllegalArgumentException.class, () -> new Student(null, 90));
	}

}
