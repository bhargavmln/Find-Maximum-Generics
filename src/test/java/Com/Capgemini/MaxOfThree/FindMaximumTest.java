package Com.Capgemini.MaxOfThree;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaximum_AtFirstPosition_ShouldReturnMaximum() {
		
		Integer[] arrayI = {6,5,4,3,2,1};
		Integer maxI = new FindMaximum<Integer>(arrayI).testMax();
		Assert.assertEquals((Integer) 6, maxI);

		Float[] arrayF = {12.1f,2.2f,9.9f,5.5f,6.6f};
		Float maxF = new FindMaximum<Float>(arrayF).testMax();
		Assert.assertEquals((Float) 12.1f, maxF);
		
		String[] arrayS = {"Peach", "Banana", "Apple", "Ant"};
		String maxS = new FindMaximum<String>(arrayS).testMax();
		Assert.assertEquals("Peach", maxS);
	}

	@Test
	public void givenMaximum_AtThirdPosition_ShouldReturnMaximum() {
		
		Integer[] arrayI = {6,5,9,2,1,0};
		Integer maxI = new FindMaximum<Integer>(arrayI).testMax();
		Assert.assertEquals((Integer) 9, maxI);

		Float[] arrayF = {1.1f,2.2f,9.9f,5.5f,6.6f};
		Float maxF = new FindMaximum<Float>(arrayF).testMax();
		Assert.assertEquals((Float) 9.9f, maxF);
		
		String[] arrayS = {"Ant", "Cat", "Peach", "Banana", "Apple", "Ant"};
		String maxS = new FindMaximum<String>(arrayS).testMax();
		Assert.assertEquals("Peach", maxS);
	}

	@Test
	public void givenMaximum_AtSixthPosition_ShouldReturnMaximum() {
		
		Integer[] arrayI = {6,5,4,9,2,10};
		Integer maxI = new FindMaximum<Integer>(arrayI).testMax();
		Assert.assertEquals((Integer) 10, maxI);

		Float[] arrayF = {1.1f,2.2f,4.9f,5.5f,6.6f};
		Float maxF = new FindMaximum<Float>(arrayF).testMax();
		Assert.assertEquals((Float) 6.6f, maxF);
		
		String[] arrayS = {"Cat", "Banana", "Apple", "Ant", "Bat","Peach"};
		String maxS = new FindMaximum<String>(arrayS).testMax();
		Assert.assertEquals("Peach", maxS);
	}
}
