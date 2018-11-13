package basics;

public class EuclidsAlgorithm {

	public int findGreatesCommonDivisor(int m, int n) {
		if (m <= 0 || n <= 0) {
			throw new IllegalArgumentException("Arguments must be positive integer values.");
		}

		int result = 0;
		int r = 0;
		if (m < n) {
			result = m;
			m = n;
			n = result;
		}
		do {
			result = n;
			r = m % n;
			m = n;
			n = r;
		} while (r != 0);

		return result;
	}

}
