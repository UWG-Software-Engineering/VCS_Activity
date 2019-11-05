package edu.westga.cs3211.vcs_activity.test.car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Car;

class TestToString {

	@Test
	void testToString() {
		Car car = new Car(25, "Blue");
		assertEquals("A Blue car that goes 25 mph.", car.toString());
	}

}
