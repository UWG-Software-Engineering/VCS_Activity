package nicJeremyMike;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MammothConstructorTest {

	@Test
	void testSuccessfulCreation() {
		Assertions.assertDoesNotThrow(() -> (new Mammoth(5,true)));
	}
	
	@Test
	void testTooManyTusks() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> (new Mammoth(5,true)));
	}
	
	@Test
	void testTooFewTusks() {
		Assertions.assertDoesNotThrow(() -> (new Mammoth(5,true)));
	}

}
