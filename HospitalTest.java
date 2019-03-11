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
	
	@Test
	public void QueueHospitalTest()
	{
		QueueHospital<HealthyPerson> qh1 = new QueueHospital<HealthyPerson>();
		HealthyPerson h1 = new HealthyPerson("Zandi", 21, "checkup");
		HealthyPerson h2 = new HealthyPerson("Megan", 19, "checkup");
		
		qh1.addPatient(h1);
		Assert.assertEquals("QueueHospital check incorrect.", h1, qh1.nextPatient());
		qh1.addPatient(h2);
		Assert.assertEquals("QueueHospital check incorrect.", h1, qh1.nextPatient());
		
		Assert.assertEquals("QueueHospital allPatientInfo incorrect.", h1.toString() + h2.toString(), qh1.allPatientInfo());
		Assert.assertEquals("QueueHospital toString incorrect.", "A QueueHospital-type hospital with 2 patients.", qh1.toString());
		
		Assert.assertEquals("StackHospital treatNextPatient incorrect.", h1, qh1.treatNextPatient());
		Assert.assertEquals("StackHospital treatNextPatient incorrect.", h2, qh1.treatNextPatient());
	}
}
