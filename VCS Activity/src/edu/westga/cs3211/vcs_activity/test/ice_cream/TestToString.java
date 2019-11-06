package edu.westga.cs3211.vcs_activity.test.ice_cream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Ice_Cream;

class TestToString {

	@Test
	void testToStringNoNuts() {
		Ice_Cream ice_cream = new Ice_Cream("Chocolate", false);
		assertEquals("Chocolate ice cream ", ice_cream.toString());
	}
	
	@Test
	void testToStringHasNuts() {
		Ice_Cream ice_cream = new Ice_Cream("Chocolate", true);
		assertEquals("Chocolate ice cream with nuts!", ice_cream.toString());
	}

}
