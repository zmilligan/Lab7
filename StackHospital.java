import java.util.Stack;

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
	/*
	 * The Patient stack
	 */
	private Stack<PatientType> patients;
	
	/**
	 * Initializes the Patient Stack.
	 */
	public StackHospital()
	{
		patients = new Stack<PatientType>();
	}
	
	public void addPatient(PatientType patient)
	{
		patients.push(patient);
	}
	
	public PatientType nextPatient()
	{
		return patients.peek();
	}
	public PatientType treatNextPatient()
	{
		return patients.pop();
	}
	public int numPatients()
	{
		return patients.size();
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
