package basics;

public final class ConstructProof {

	private ConstructProof() {
		super();
	}

	/**
	 * Given a positive integer n, this algorithm will output a proof that P(n) is
	 * true.
	 * a) "P(1) is true, since 1 = 1pow(2)."
	 * b) "If all of P(1),..., P(n) are true, then, in particular, P(n) is true, so Eq. (2)
	 * holds; adding 2n + 1 to both sides we obtain
	 * 1 + 3 + • • • + (2n - 1) + 2n + 1) = n2 + 2n + 1 = (n + 1)2,
	 * which proves that P(n + 1) is also true."
	 * @param n
	 * @return
	 */
	public static final boolean proofPn(int n) {
		for (int k = 1; k <= n; k++) {
			if ((2 * k - 1) == Math.pow(k, 2) && (k + (2 * k + 1)) != Math.pow((k + 1), 2)) {
				return false;
			}
		}

		return true;
	}
}
