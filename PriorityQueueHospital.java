/**
 * Class representing a Hospital that orders its patients in the following way:
 * Patients are ordered via a PriorityQueue. That is, the first patient admitted is the first to be treated.
 * However, if patients have some natural ordering, then this is used to give a priority to patients.
 * For example, the SickPerson has a severity level and implements the comparable interface to allow SickPersons
 * to naturally order themselves. In a sorted list, the Person with the highest severity level would be the first
 * element. Similarly, the Person with the highest severity level would be the first one treated at the Hospital.
 * Patients are treated in sorted order by their natural ordering. If a natural ordering is not defined, patients
 * are treated in FIFO order.
 * 
 * @author Stephen
 * @version 2019-03-07
 */
public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
{	
	/**
	 * Initializes the Patient PriorityQueue.
	 */
	public PriorityQueueHospital()
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