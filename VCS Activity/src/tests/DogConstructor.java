import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogConstructor {

	@Test
	void testAgeLessThanOne() {
		assertThrows(IllegalArgumentException.class, () -> new Dog("Sally",0.5));
	}

}
