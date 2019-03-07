import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for the Person classes and their comparators.
 *
 * @author Zandi Millligan
 * @version 2019-03-07
 */
public class PersonTest
{
	@Test
	public void SickPersonTest()
	{
		SickPerson s1 = new SickPerson("Steve Rogers", 28, 2);
		Assert.assertEquals("SickPerson name incorrect.", "Steve Rogers", s1.getName());
		Assert.assertEquals("SickPerson age incorrect.", 28, s1.getAge(), 0.0001);
		Assert.assertEquals("SickPerson toString incorrect.", "Steve Rogers, a 28-year old. Severity level 2", s1.toString());
	}
	
	@Test
	public void HealthyPersonTest()
	{
		HealthyPerson h1 = new HealthyPerson("Thor Odinson", 1247, "Experiencing modern earthly medicinal practices");
		Assert.assertEquals("HealthyPerson name incorrect.", "Thor Odinson", h1.getName());
		Assert.assertEquals("HealthyPerson age incorrect.", 1247, h1.getAge(), 0.0001);
		Assert.assertEquals("HealthyPerson toString incorrect.", 
				"Thor Odinson, a 1247-year old. In for Experiencing modern earthly medicinal practices", h1.toString());
	}
	
	@Test
	public void CompareSickPersonTest()
	{
		
	}
	
	@Test
	public void CompareHealthyPersonTest()
	{
		
	}
	
	@Test
	public void CompareDifferentTypesTest()
	{
		
	}
}
