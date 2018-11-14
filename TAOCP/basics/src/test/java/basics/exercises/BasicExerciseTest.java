package basics.exercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BasicExerciseTest {

	@Test
	void testRearangeFour() {
		int a = 1, b = 2, c = 3, d = 4;
		final int[] expected = new int[] { b, c, d, a };
		int[] actual = BasicExercise.rearangeFour(a, b, c, d);

		assertArrayEquals(expected, actual);
	}

}
