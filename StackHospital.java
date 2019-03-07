/**
 * Class representing a Hospital that orders its patients in the following way:
 * Patients are ordered via a Stack. That is, the most recent patient admitted is the first to be treated.
 * If more patients are added before the first patient is treated, the first patient will have to wait.
 * This is known as LIFO, or last-in-first-out ordering. Most businesses would not operate in this way - always
 * prioritizing the most recent customer over those who have already waited for a long time.
 * 
 * @author Stephen
 * @version 2019-03-07
 */
public class StackHospital<PatientType> extends Hospital<PatientType>
{	
	/**
	 * Initializes the Patient Stack.
	 */
	public StackHospital()
	{
		//TODO finish constructor
	}
	
	public void addPatient(PatientType patient)
	{
		//TODO: finish method
	}
	
	public PatientType nextPatient()
	{
		//TODO: finish method
		return null;
	}
	public PatientType treatNextPatient()
	{
		//TODO: finish method
		return null;
	}
	public int numPatients()
	{
		//TODO: finish method
		return 0;
	}
	public String hospitalType()
	{
		//TODO: finish method
		return null;
	}
	public String allPatientInfo()
	{
		//TODO: finish method
		return null;
	}
}
