package edu.westga.cs3211.vcs_activity.test.car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Car;

class TestEquals {

	@Test
	void testEqualsValid() {
		Car car = new Car(100, "Red");
		Car other = new Car(100, "Red");
		assertEquals(true, car.equals(other));
	}
	
	@Test
	void testOnlySpeedEqual() {
		Car car = new Car(100, "Yellow");
		Car other = new Car(100, "Red");
		assertEquals(false, car.equals(other));
	}
	
	@Test
	void testOnlyColorEqual() {
		Car car = new Car(50, "Red");
		Car other = new Car(100, "Red");
		assertEquals(false, car.equals(other));
	}
	
	@Test
	void testNothingEqual() {
		Car car = new Car(50, "Yellow");
		Car other = new Car(100, "Red");
		assertEquals(false, car.equals(other));
	}
	

}
