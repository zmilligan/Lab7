import java.util.PriorityQueue;

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
	/*
	 * The patient priority queue
	 * I haven't decided yet what type of list would be the best to do, so this is subject to change.
	 */
	private PriorityQueue<PatientType> patients;
	
	/**
	 * Initializes the Patient PriorityQueue.
	 */
	public PriorityQueueHospital()
	{
		//The type of list will need to be updated if changed, but I wanted to have something.
		patients = new PriorityQueue<PatientType>();
	}
	
	public void addPatient(PatientType patient)
	{
		patients.add(patient);
		//Collections.sort(patients);
	}
	
	public PatientType nextPatient()
	{
		return patients.peek();
	}
	
	public PatientType treatNextPatient()
	{
		return patients.poll();
	}
	
	public int numPatients()
	{
		return patients.size();
	}
	
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	
	public String allPatientInfo()
	{
		String info = "";
		for (PatientType p : patients)
		{
			info += p.toString();
		}
		return info;
	}
}