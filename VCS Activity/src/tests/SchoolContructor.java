import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.School

class SchoolContructor {

	@Test 
	void testNullTName() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> {
					School school = new School(null, "Atlanta")	;
				});
	}
	
	@Test 
	void testNullLocation() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> {
					School school = new School("UWG", null)	;	
				});
	}
	
	@Test
	void testGetName() {
		School school = new School("UWG", "Atlanta");
		assertEquals("UWG", school.getName());
	}

}
