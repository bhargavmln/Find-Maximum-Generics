package Com.Capgemini.MaxOfThree;

import java.util.Arrays;

public class FindMaximum<E extends Comparable<E>> {

	E[] elementArray;

	public FindMaximum(E[] elementArray) {
		this.elementArray = elementArray;
	}

	public E testMax() {
		return FindMaximum.testMax(elementArray);
	}

	public static <E extends Comparable<E>> E testMax(E[] elementArray) {
		E max = elementArray[0];
		for (E element : elementArray)
			if (element.compareTo(max) > 0) {
				max = element;
			}
		printMax(elementArray, max);
		return max;
	}
	
	public static<E> void printMax(E[] elementArray, E max) {
		System.out.println("Max of " + Arrays.toString(elementArray) + " is " + max );
	}

	public static void main(String[] args) {

		Integer[] arrayI = {1,2,3,4,5,6};
		System.out.println(new FindMaximum<Integer>(arrayI).testMax());
	}
}
