package Com.Capgemini.MaxOfThree;



import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
		Integer max = FindMaximum.testMax(3, 1, 2);
		Assert.assertEquals((Integer)3, max);
	}
	
	@Test
	public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
		Integer max = FindMaximum.testMax(3, 4, 2);
		Assert.assertEquals((Integer)4, max);
	}
	
	@Test
	public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
		Integer max = FindMaximum.testMax(3, 4, 5);
		Assert.assertEquals((Integer)5, max);
	}
}
