package basics;

public final class EuclidsAlgorithm {

	private EuclidsAlgorithm() {
		super();
	}

	/**
	 * Given two positive integers m and n, find their greatest common divisor, that
	 * is, the largest positive integer that evenly divides both m and n.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int findGreatesCommonDivisor(int m, int n) {
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
