package Com.Capgemini.MaxOfThree;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaximum_AtFirstPosition_ShouldReturnMaximum() {
		
		Integer maxI = FindMaximum.testMax(3, 1, 2);
		Assert.assertEquals((Integer) 3, maxI);

		Float maxF = FindMaximum.testMax(9.1f, 2.5f, 0.6f);
		Assert.assertEquals((Float) 9.1f, maxF);
		
		String maxS = FindMaximum.testMax("Peach", "Banana", "Apple");
		Assert.assertEquals("Peach", maxS);
	}

	@Test
	public void givenMaximum_AtSecondPosition_ShouldReturnMaximum() {
		
		Integer maxI = FindMaximum.testMax(3, 4, 2);
		Assert.assertEquals((Integer) 4, maxI);

		Float maxF = FindMaximum.testMax(1.1f, 2.5f, 0.6f);
		Assert.assertEquals((Float) 2.5f, maxF);
		
		String maxS = FindMaximum.testMax("Apple","Peach", "Banana");
		Assert.assertEquals("Peach", maxS);
	}

	@Test
	public void givenMaximum_AtThirdPosition_ShouldReturnMaximum() {
		
		Integer maxI = FindMaximum.testMax(3, 4, 5);
		Assert.assertEquals((Integer) 5, maxI);

		Float maxF = FindMaximum.testMax(1.1f, 2.5f, 10.6f);
		Assert.assertEquals((Float) 10.6f, maxF);
		
		String maxS = FindMaximum.testMax("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", maxS);
	}
}
