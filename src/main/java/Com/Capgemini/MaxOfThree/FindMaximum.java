package Com.Capgemini.MaxOfThree;

public class FindMaximum {

	public static <E extends Comparable<E>> E testMax(E valueX, E valueY, E valueZ) {
		E max = valueX;
		if (valueY.compareTo(max) > 0) {
			max = valueY;
		}
		if (valueZ.compareTo(max) > 0) {
			max = valueZ;
		}
		return max;
	}

	public static void main(String[] args) {

		System.out.println(testMax(1, 2, 3));
		System.out.println(testMax(1.1f,1.2f,1.3f));
		System.out.println(testMax("Apple","Peach","Banana"));
	}
}
