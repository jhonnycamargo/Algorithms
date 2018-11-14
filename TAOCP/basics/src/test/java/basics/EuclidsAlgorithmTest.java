package basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EuclidsAlgorithmTest {

	@DisplayName("Euclid's Algorithm test")
	@Test
	void testEuclidsAlgorith() {
		int result = EuclidsAlgorithm.findGreatesCommonDivisor(10, 2);
		assertEquals(2, result);
		result = EuclidsAlgorithm.findGreatesCommonDivisor(2, 10);
		assertEquals(2, result);
		result = EuclidsAlgorithm.findGreatesCommonDivisor(10, 10);
		assertEquals(10, result);
		result = EuclidsAlgorithm.findGreatesCommonDivisor(119, 544);
		assertEquals(17, result);
		result = EuclidsAlgorithm.findGreatesCommonDivisor(119, 544);
		assertEquals(17, result);
	}

	@Test
	void whenNegativeIntegersExpectIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			EuclidsAlgorithm.findGreatesCommonDivisor(-1, 0);
		});
	}
}
