package edu.westga.cs3211.vcs_activity.test.ice_cream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Ice_Cream;

public class TestGetFlavor {
	
	@Test
	void testGetIceCream() {
		Ice_Cream iceCream = new Ice_Cream("Chocolate", true);
		assertEquals("Chocolate", iceCream.getFlavor());
	}
	

}
