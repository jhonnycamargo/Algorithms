package basics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ConstructProofTest {

	@Test
	void testProofPn() {
		assertTrue(ConstructProof.proofPn(1));
		assertTrue(ConstructProof.proofPn(2));
		assertTrue(ConstructProof.proofPn(3));
		assertTrue(ConstructProof.proofPn(4));
		assertTrue(ConstructProof.proofPn(5));
	}
}
