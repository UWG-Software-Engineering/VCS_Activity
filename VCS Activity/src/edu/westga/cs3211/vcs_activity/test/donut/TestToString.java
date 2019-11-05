package edu.westga.cs3211.vcs_activity.test.donut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Donut;

class TestToString {

	@Test
	void testWithSprinkles() {
		var donut = new Donut(600, true);
		var result = donut.toString();
		assertEquals("Donut has sprinkles and is 600 claories", result);
	}
	
	@Test
	void testWithoutSprinkles() {
		var donut = new Donut(600, false);
		var result = donut.toString();
		assertEquals("Donut has no sprinkles and is 600 claories", result);
	}
	
	@Test
	void testNumberOfCaloriesIsParameter() {
		var donut = new Donut(600, false);
		var result = donut.toString();
		assertEquals("Donut has no sprinkles and is 600 claories", result);
	}

}
