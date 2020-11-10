import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentConstructor {

	@Test
	void testNull() {
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> {
					Student student = new Student(null, null);	
				});
	}

}
