package edu.westga.cs3211.vcs_activity.test.donut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Donut;

class DonutConstructorTest {

	@Test
	void testSuccessfulConstructor() {
		Donut donut = new Donut(50, true);
		assertEquals(50, donut.getCalories());
		assertEquals(true, donut.isSprinkles());
	}
	
	@Test
	void testCaloriesLessThan0() {
		assertThrows(IllegalArgumentException.class, () -> new Donut(-1, true));
	}
	
	
	

}
