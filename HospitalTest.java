import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 7
 *
 * Test class for the Person classes and their comparators.
 *
 * @author Zandi Millligan
 * @version 2019-03-11
 */
public class HospitalTest
{
	@Test
	public void StackHospitalTest()
	{
		StackHospital<SickPerson> sh1 = new StackHospital<SickPerson>();
		SickPerson s1 = new SickPerson("Zandi", 21, 5);
		SickPerson s2 = new SickPerson("Megan", 19, 2);
		
		sh1.addPatient(s1);
		Assert.assertEquals("StackHospital check incorrect.", s1, sh1.nextPatient());
		sh1.addPatient(s2);
		Assert.assertEquals("StackHospital check incorrect.", s2, sh1.nextPatient());
		
		Assert.assertEquals("StackHospital allPatientInfo incorrect.", s1.toString() + s2.toString(), sh1.allPatientInfo());
		Assert.assertEquals("StackHospital toString incorrect.", "A StackHospital-type hospital with 2 patients.", sh1.toString());
		
		Assert.assertEquals("StackHospital treatNextPatient incorrect.", s2, sh1.treatNextPatient());
		Assert.assertEquals("StackHospital treatNextPatient incorrect.", s1, sh1.treatNextPatient());
	}
}
