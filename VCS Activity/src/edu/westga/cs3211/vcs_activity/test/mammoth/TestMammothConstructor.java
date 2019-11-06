package edu.westga.cs3211.vcs_activity.test.mammoth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Mammoth;

class TestMammothConstructor {

	/**
	 * @author Nicolas Sacandy
	 */
	@Test
	void testSuccessfulCreation() {
		Mammoth newMammoth = new Mammoth(10,true);
		Assertions.assertAll("Correct Fields",
				() -> Assertions.assertEquals(newMammoth.getTusks(),10),
				() -> Assertions.assertEquals(newMammoth.getFrozen(),true)
				);
	}
		
	@Test
	void testTooManyTusks() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Mammoth(102,true);});
	}
	
	@Test
	void testUpperBoundTusks() {
		Assertions.assertDoesNotThrow(() -> (new Mammoth(100,true)));
	}
	
	@Test
	void testTooFewTusks() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {new Mammoth(-3,true);});
	}
	
	@Test
	void TestLowerBound() {
		Assertions.assertDoesNotThrow(() -> (new Mammoth(0,true)));
	}
	
}
