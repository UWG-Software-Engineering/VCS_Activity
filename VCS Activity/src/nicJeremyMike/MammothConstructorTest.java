package nicJeremyMike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MammothConstructorTest {

	@Test
	void testSuccessfulCreation() {
		Assertions.assertDoesNotThrow(() -> (new Mammoth(5,true)));
	}
	
	@Test
	void testTooManyTusks() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Mammoth(102,true);});
	}
	
	@Test
	void testTooFewTusks() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {new Mammoth(-3,true);});
	}

}
