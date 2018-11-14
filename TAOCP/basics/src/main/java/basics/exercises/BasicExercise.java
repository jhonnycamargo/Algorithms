package basics.exercises;

public final class BasicExercise {

	private BasicExercise() {
		super();
	}

	public static int[] rearangeFour(int a, int b, int c, int d) {
		int temp = a;
		a = b;
		b = c;
		c = d;
		d = temp;

		return new int[] { a, b, c, d };
	}

}
