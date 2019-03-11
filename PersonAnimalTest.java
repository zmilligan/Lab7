import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for the Person and Animal classes and their comparators.
 *
 * @author Zandi Millligan
 * @version 2019-03-11
 */
public class PersonAnimalTest
{
	@Test
	public void SickPersonTest()
	{
		SickPerson s1 = new SickPerson("Steve Rogers", 30, 2);
		Assert.assertEquals("SickPerson name incorrect.", "Steve Rogers", s1.getName());
		Assert.assertEquals("SickPerson age incorrect.", 30, s1.getAge(), 0.0001);
		Assert.assertEquals("SickPerson toString incorrect.", "Steve Rogers, a 30-year old. Severity level 2", s1.toString());
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
		SickPerson s2 = new SickPerson("Phil Coulson", 45, 10);
		SickPerson s3 = new SickPerson("Tony Stark", 38, 6);
		SickPerson s4 = new SickPerson("Pietro Maximoff", 22, 10);
		Assert.assertEquals("First SickPerson compareTo test incorrect.", -1, s2.compareTo(s3), 0.0001);
		Assert.assertEquals("Second SickPerson compareTo test incorrect.", 1, s3.compareTo(s2), 0.0001);
		Assert.assertEquals("Third SickPerson compareTo test incorrect.", 0, s4.compareTo(s2), 0.0001);
	}
	
	@Test
	public void CompareHealthyPersonTest()
	{
		HealthyPerson h2 = new HealthyPerson("Bruce Banner", 39, "anger management issues follow-up");
		HealthyPerson h3 = new HealthyPerson("Clint Barton", 34, "quarterly physical");
		HealthyPerson h4 = new HealthyPerson("Bruce Banner", 39, "quarterly physical");
		Assert.assertEquals("First HealthyPerson compareTo test incorrect.", -1, h2.compareTo(h3), 0.0001);
		Assert.assertEquals("Second HealthyPerson compareTo test incorrect.", 1, h3.compareTo(h2), 0.0001);
		Assert.assertEquals("Third HealthyPerson compareTo test incorrect.", 0, h4.compareTo(h2), 0.0001);
	}
	
	@Test
	public void CompareDifferentTypesTest()
	{
		SickPerson s5 = new SickPerson("Wanda Maximoff", 22, 4);
		HealthyPerson h5 = new HealthyPerson("Natasha Romanoff", 32, "quarterly physical");
		Assert.assertEquals("HealthyPerson different types compareTo incorrect.", 0, s5.compareTo(h5), 0.0001);
		Assert.assertEquals("SickPerson different types compareTo incorrect.", 0, h5.compareTo(s5), 0.0001);
	}
	
	@Test
	public void AnimalTest()
	{
		Animal a1 = new Animal("cat", 2);
		Assert.assertEquals("Animal breed incorrect.", "cat", a1.getBreed());
		Assert.assertEquals("Animal age incorrect.", 2, a1.getAge(), 0.0001);
		Assert.assertEquals("Animal toString incorrect.", "A 2-year old cat.", a1.toString());
	}
	
	@Test
	public void CompareAnimalTest()
	{
		Animal a2 = new Animal("Flerken", 10);
		Animal a3 = new Animal("dog", 5);
		Animal a4 = new Animal("cat", 10);
		Assert.assertEquals("First Animal compareTo test incorrect.", -5, a2.compareTo(a3), 0.0001);
		Assert.assertEquals("Second Animal compareTo test incorrect.", 5, a3.compareTo(a2), 0.0001);
		Assert.assertEquals("Third Animal compareTo test incorrect.", 0, a4.compareTo(a2), 0.0001);
	}
}
