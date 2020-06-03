package quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class JunitTest {

	@Test
	public void test() {
		
		int result = 10 + 20;
		assertEquals(20, result, 10);
	}
}
