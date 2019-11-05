package edu.westga.cs3211.vcs_activity.test.car;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.westga.cs3211.vcs_activity.model.Car;

/**
 * @author Thomas Morgenstern
 */
class TestCarConstructor {

	@Test
	void testConstruction() {
		Car car = new Car(50, "red");
		assertEquals(50, car.getSpeed());
		assertEquals("red", car.getColor());
	}
	
	@Test
	void testInvalidSpeedThrowsAtBoundary() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Car(-1, "red");
		});
	}
	
	@Test
	void testInvalidSpeedThrowsAtExtreme() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Car(-100, "red");
		});
	}
	
	@Test
	void testNullColorThrows() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Car(10, null);
		});
	}
	
	@Test
	void testEmptyColorThrows() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Car(10, "");
		});
	}

}
