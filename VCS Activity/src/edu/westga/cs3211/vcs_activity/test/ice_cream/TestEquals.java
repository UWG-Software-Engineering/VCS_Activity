/**
 * 
 */
package edu.westga.cs3211.vcs_activity.test.ice_cream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Ice_Cream;

/**
 * @author Nlight160
 *
 */
class TestEquals {

	@Test
	void testSameIceCreamsShouldEqual() {
		Ice_Cream iceCream1 = new Ice_Cream("Banana", true);
		Ice_Cream iceCream2 = new Ice_Cream("Banana", true);
		
		assertTrue(iceCream1.equals(iceCream2));
	}
	
	@Test
	void testSameFlavorWithoutNutsShouldNotEqual() {
		Ice_Cream iceCream1 = new Ice_Cream("Banana", true);
		Ice_Cream iceCream2 = new Ice_Cream("Banana", false);
		
		assertFalse(iceCream1.equals(iceCream2));
	}
	
	@Test
	void testDifferentFlavorWithSameNutsShouldNotEqual() {
		Ice_Cream iceCream1 = new Ice_Cream("Lingonberry", true);
		Ice_Cream iceCream2 = new Ice_Cream("Banana", true);
		
		assertFalse(iceCream1.equals(iceCream2));
	}
	
	@Test
	void testDifferntFlavorAndDifferentNutsShouldNotEqual() {
		Ice_Cream iceCream1 = new Ice_Cream("Lingonberry", true);
		Ice_Cream iceCream2 = new Ice_Cream("Banana", false);
		
		assertFalse(iceCream1.equals(iceCream2));
	}

}
