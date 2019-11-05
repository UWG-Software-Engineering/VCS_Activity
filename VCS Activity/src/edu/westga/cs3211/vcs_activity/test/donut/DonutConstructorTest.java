package edu.westga.cs3211.vcs_activity.test.donut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Donut;
import edu.westga.cs3211.vcs_activity.model.Student;

class DonutConstructorTest {

	@Test
	void testSuccessfulConstructor() {
	}
	
	@Test
	void testCaloriesLessThan0() {
		assertThrows(IllegalArgumentException.class, () -> new Donut(-1, true));
	}
	
	@Test
	void testSprinklesTrue() {
	}
	@Test
	void testSprinklesFalse() {
	}
	

}
