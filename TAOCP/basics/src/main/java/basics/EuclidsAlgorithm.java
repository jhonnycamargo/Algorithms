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

	/**
	 * Given two positive integers m and n, find their greatest common divisor, that
	 * is, the largest positive integer that evenly divides both m and n in an
	 * efficient manner.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int calculateGreatesCommonDivisor(int m, int n) {
		while (n != 0) {
			int tmp = n;
			n = m % n;
			m = tmp;
		}

		return m;
	}

	/**
	 * Given two positive integers m and n, we compute their greatest common divisor
	 * d and two integers a and b, such that am + bn = d.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int calculateGreatesCommonDivisorExtended(int m, int n) {
		// Initialize.
		int b = 1;
		int a1 = b;
		int a = 0;
		int b1 = a;
		int c = m;
		int d = n;

		// Divide.
		int q = c / d;
		int r = c % d;

		while (r != 0) {
			c = d;
			d = r;
			int t = a1;
			a1 = a;
			a = t - q * a;
			t = b1;
			b1 = b;
			b = t - q * b;

			q = c / d;
			r = c % d;
		}

		return a * m + b * n;
	}

}
