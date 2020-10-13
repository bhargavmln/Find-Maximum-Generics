package Com.Capgemini.MaxOfThree;

public class FindMaximum {

	public static Integer testMax(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static Float testMax(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {

		System.out.println(testMax(1, 2, 3));
		System.out.println(testMax(1.1f,1.2f,1.3f));
		
	}
}
