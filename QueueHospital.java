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
	/**
	 * Initializes the Patient Queue.
	 */
	public QueueHospital()
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