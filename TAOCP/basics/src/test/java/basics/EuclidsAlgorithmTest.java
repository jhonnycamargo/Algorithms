package basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EuclidsAlgorithmTest {

	@DisplayName("Euclid's Algorithm test")
	@Test
	void testEuclidsAlgorith() {
		EuclidsAlgorithm algorithm = new EuclidsAlgorithm();
		int result = algorithm.findGreatesCommonDivisor(10, 2);
		assertEquals(2, result);
		result = algorithm.findGreatesCommonDivisor(2, 10);
		assertEquals(2, result);
		result = algorithm.findGreatesCommonDivisor(10, 10);
		assertEquals(10, result);
		result = algorithm.findGreatesCommonDivisor(119, 544);
		assertEquals(17, result);
		result = algorithm.findGreatesCommonDivisor(119, 544);
		assertEquals(17, result);
	}

	@Test
	void whenNegativeIntegersExpectIllegalArgumentException() {
		EuclidsAlgorithm algorithm = new EuclidsAlgorithm();

		assertThrows(IllegalArgumentException.class, () -> {
			algorithm.findGreatesCommonDivisor(-1, 0);
		});
	}
}
