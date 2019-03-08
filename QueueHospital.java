import java.util.LinkedList;
import java.util.Queue;

/**
 * Class representing a Hospital that orders its patients in the following way:
 * Patients are ordered via a Queue. That is, the first patient admitted is the first to be treated. If more patients
 * are added before the first patient is treated, they must wait for their turn. This is known as FIFO, or
 * first-in-first-out ordering and is the standard model for lines at businesses (or any organized line of people).
 * 
 * @author Stephen
 * @version 2019-03-07
 */
public class QueueHospital<PatientType> extends Hospital<PatientType>
{	
	/*
	 * The patient queue
	 */
	private Queue<PatientType> patients;
	
	/**
	 * Initializes the Patient Queue.
	 */
	public QueueHospital()
	{
		patients = new LinkedList<PatientType>();
	}
	
	public void addPatient(PatientType patient)
	{
		patients.add(patient);
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
		return "QueueHospital";
	}
	
	public String allPatientInfo()
	{
		String info = "";
		for(PatientType p : patients)
		{
			info += p.toString();
		}
		return info;
	}
}