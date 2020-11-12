import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestDeskConstructor {

	@Test
	public void testNullWoodType() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Desk desk = new Desk(null, 5);
		})
	}

}
