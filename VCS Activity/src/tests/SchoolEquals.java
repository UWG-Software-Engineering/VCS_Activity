import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SchoolEquals {

	@Test
	void testNameMatchesLocationDoesNot() {
		School school1 = new School("UWG", "Newnan");
		School school2 = new School("UWG", "Carrollton");
		assertEquals(false, school1.equals(school2));
	}
	
	@Test
	void testLocationMatchesNameDoesNot() {
		School school1 = new School("UGA", "Carrollton");
		School school2 = new School("UWG", "Carrollton");
		assertEquals(false, school1.equals(school2));
	}
	
	@Test
	void testSchoolsMatch() {
		School school1 = new School("UWG", "Carrollton");
		School school2 = new School("UWG", "Carrollton");
		assertEquals(true, school1.equals(school2));
	}

}
