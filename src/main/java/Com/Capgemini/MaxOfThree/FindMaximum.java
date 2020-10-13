package Com.Capgemini.MaxOfThree;

public class FindMaximum {

	public static Integer testMax(Integer intX, Integer intY, Integer intZ) {
		Integer max = intX;
		if (intY.compareTo(max) > 0) {
			max = intY;
		}
		if (intZ.compareTo(max) > 0) {
			max = intZ;
		}
		return max;
	}

	public static Float testMax(Float floatX, Float floatY, Float floatZ) {
		Float max = floatX;
		if (floatY.compareTo(max) > 0) {
			max = floatY;
		}
		if (floatZ.compareTo(max) > 0) {
			max = floatZ;
		}
		return max;
	}
	
	public static String testMax(String stringX, String stringY, String stringZ) {
		String max = stringX;
		if (stringY.compareTo(max) > 0) {
			max = stringY;
		}
		if (stringZ.compareTo(max) > 0) {
			max = stringZ;
		}
		return max;
	}

	public static void main(String[] args) {

		System.out.println(testMax(1, 2, 3));
		System.out.println(testMax(1.1f,1.2f,1.3f));
		System.out.println(testMax("Apple","Peach","Banana"));
	}
}
