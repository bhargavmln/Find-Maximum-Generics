package Com.Capgemini.MaxOfThree;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaximum_AtFirstPosition_ShouldReturnMaximum() {
		
		Integer maxI = new FindMaximum<Integer>(3, 1, 2).testMax();
		Assert.assertEquals((Integer) 3, maxI);

		Float maxF = new FindMaximum<Float>(9.1f, 2.5f, 0.6f).testMax();
		Assert.assertEquals((Float) 9.1f, maxF);
		
		String maxS = new FindMaximum<String>("Peach", "Banana", "Apple").testMax();
		Assert.assertEquals("Peach", maxS);
	}

	@Test
	public void givenMaximum_AtSecondPosition_ShouldReturnMaximum() {
		
		Integer maxI = new FindMaximum<Integer>(3, 4, 2).testMax();
		Assert.assertEquals((Integer) 4, maxI);

		Float maxF = new FindMaximum<Float>(1.1f, 2.5f, 0.6f).testMax();
		Assert.assertEquals((Float) 2.5f, maxF);
		
		String maxS = new FindMaximum<String>("Apple", "Peach", "Banana").testMax();
		Assert.assertEquals("Peach", maxS);
	}

	@Test
	public void givenMaximum_AtThirdPosition_ShouldReturnMaximum() {
		
		Integer maxI = new FindMaximum<Integer>(3, 4, 5).testMax();
		Assert.assertEquals((Integer) 5, maxI);

		Float maxF = new FindMaximum<Float>(1.1f, 2.5f, 10.6f).testMax();
		Assert.assertEquals((Float) 10.6f, maxF);
		
		String maxS = new FindMaximum<String>("Apple", "Banana", "Peach").testMax();
		Assert.assertEquals("Peach", maxS);
	}
}
