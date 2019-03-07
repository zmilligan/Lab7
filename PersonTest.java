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
		SickPerson s2 = new SickPerson("Phil Coulson", 30, 10);
		SickPerson s3 = new SickPerson("Tony Stark", 34, 6);
		SickPerson s4 = new SickPerson("Pietro Maximoff", 22, 10);
		Assert.assertEquals("First SickPerson compareTo test incorrect.", -1, s2.compareTo(s3), 0.0001);
		Assert.assertEquals("Second SickPerson compareTo test incorrect.", 1, s3.compareTo(s2), 0.0001);
		Assert.assertEquals("Third SickPerson compareTo test incorrect.", 0, s4.compareTo(s2), 0.0001);
	}
	
	@Test
	public void CompareHealthyPersonTest()
	{
		HealthyPerson h2 = new HealthyPerson("Bruce Banner", 32, "anger management issues follow-up");
		HealthyPerson h3 = new HealthyPerson("Clint Barton", 34, "quarterly physical");
		HealthyPerson h4 = new HealthyPerson("Bruce Banner", 30, "quarterly physical");
		Assert.assertEquals("First HealthyPerson compareTo test incorrect.", -1, h2.compareTo(h3), 0.0001);
		Assert.assertEquals("Second HealthyPerson compareTo test incorrect.", 1, h3.compareTo(h2), 0.0001);
		Assert.assertEquals("Third HealthyPerson compareTo test incorrect.", 0, h4.compareTo(h2), 0.0001);
	}
	
	@Test
	public void CompareDifferentTypesTest()
	{
		
	}
}
