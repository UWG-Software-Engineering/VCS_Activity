package edu.westga.cs3211.vcs_activity.test.donut;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Donut;

public class DonutEqualsTest {

	@Test
	void testCaloriesLessThan0() {
		assertThrows(IllegalArgumentException.class, () -> new Donut(1, true).equals(null));
	}
	
	@Test
	void testSameDonut() {
		Donut aDonut = new Donut(3, true);
		assertTrue(aDonut.equals(aDonut));
	}
	
	@Test
	void testDifferentDonutSameParameters() {
		Donut aDonut = new Donut(3, true);
		Donut bDonut = new Donut(3, true);
		assertTrue(aDonut.equals(bDonut));
	}
	
	@Test
	void testDifferentCaloriesSameSprinkles() {
		Donut aDonut = new Donut(3, true);
		Donut bDonut = new Donut(2, true);
		assertFalse(aDonut.equals(bDonut));
	}
	
	@Test
	void testDifferentSprinklesSameCalories() {
		Donut aDonut = new Donut(3, true);
		Donut bDonut = new Donut(3, false);
		assertFalse(aDonut.equals(bDonut));
	}
	
	@Test
	void testDifferentDonuts() {
		Donut aDonut = new Donut(3, true);
		Donut bDonut = new Donut(2, false);
		assertFalse(aDonut.equals(bDonut));
	}
}
