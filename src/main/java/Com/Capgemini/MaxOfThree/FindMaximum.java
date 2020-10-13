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
		printMax(x, y, z, max);
		return max;
	}

	private static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println("The maximum of the three numbers " + x + ", " + y + " and " + z + " is:\n" + max);

	}

	public static void main(String[] args) {
		
		testMax(1, 2, 3);
		
	}
}
