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
		result = EuclidsAlgorithm.findGreatesCommonDivisor(544, 119);
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

	@DisplayName("Euclid's Algorithm test efficiently.")
	@Test
	void testEuclidsAlgorithEfficiently() {
		int result = EuclidsAlgorithm.calculateGreatesCommonDivisor(10, 2);
		assertEquals(2, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisor(10, 10);
		assertEquals(10, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisor(544, 119);
		assertEquals(17, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisor(20, 15);
		assertEquals(5, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisor(12, 8);
		assertEquals(4, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisor(2166, 6099);
		assertEquals(57, result);
	}
	
	@DisplayName("Extended Euclid's Algorithm.")
	@Test
	void testExtendedEuclidsAlgorithEfficiently() {
		int result = EuclidsAlgorithm.calculateGreatesCommonDivisorExtended(10, 2);
		assertEquals(2, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisorExtended(10, 10);
		assertEquals(10, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisorExtended(544, 119);
		assertEquals(17, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisorExtended(20, 15);
		assertEquals(5, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisorExtended(12, 8);
		assertEquals(4, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisorExtended(2166, 6099);
		assertEquals(57, result);
		result = EuclidsAlgorithm.calculateGreatesCommonDivisorExtended(1769, 551);
		assertEquals(29, result);
	}
}
