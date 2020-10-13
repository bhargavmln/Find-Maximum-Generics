package Com.Capgemini.MaxOfThree;

public class FindMaximum<T extends Comparable<T>> {

	T valueX, valueY, valueZ;

	public FindMaximum(T x, T y, T z) {
		this.valueX = x;
		this.valueY = y;
		this.valueZ = z;
	}

	public T testMax() {
		return FindMaximum.testMax(valueX, valueY, valueZ);
	}

	public static <T extends Comparable<T>> T testMax(T valueX, T valueY, T valueZ) {
		T max = valueX;
		if (valueY.compareTo(max) > 0) {
			max = valueY;
		}
		if (valueZ.compareTo(max) > 0) {
			max = valueZ;
		}
		return max;
	}

	public static void main(String[] args) {

		System.out.println(new FindMaximum<Integer>(1, 2, 3).testMax());
		System.out.println(new FindMaximum<Float>(1.1f, 2.2f, 3.3f).testMax());
		System.out.println(new FindMaximum<String>("Apple", "Peach", "Banana").testMax());
	}
}
