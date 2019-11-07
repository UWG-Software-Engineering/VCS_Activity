package edu.westga.cs3211.vcs_activity.test.mammoth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.vcs_activity.model.Mammoth;

class TestMammothToString {

	@Test
	void testToString() {
		Mammoth mam = new Mammoth(3, false);
		
		assertEquals("Number of tusk: 3 and is Frozen false", mam.toString());
		
	}

}
