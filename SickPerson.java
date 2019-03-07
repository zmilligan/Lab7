/**
 * Specific type of Person admitted to a Hospital. A sick person.
 * 
 * @author Zandi
 * @version 2019-03-07
 */
public class SickPerson extends Person {

	/*
	 * The severity of the illness in the SickPerson. The higher the value, the more severe the illness.
	 */
	private int severity;
	
	/**
	 * Stores information about the HealthyPerson.
	 *  
	 * @param name The SickPerson's name.
	 * @param age The SickPerson's age, in years.
	 * @param severity The severity of the illness in the SickPerson. The higher the value, the more severe the illness.
	 */
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}

	/**
	 * Implementation method for Person's compareTo method(). Does the actual legwork of comparison to
	 * compare a SickPerson (self) vs. another Person (o).
	 * @param o The other Person to compare self to.
	 * @return If o is not of type SickPerson, return 0. Else, return (ignoring case):
	 * (1) self's severity is greater than o's severity: negative number
	 * (2) self's severity is less than o's severity: positive number
	 * (3) severity are equivalent: 0 
	 * Orders by decreasing severity.
	 */
	@Override
	protected int compareToImpl(Person p)
	{
		if(!this.getClass().getName().equals(p.getClass().getName()))
		{
			return 0;
		}
		SickPerson sp = (SickPerson) p;
		if(this.severity > sp.severity)
		{
			return -1;
		}
		if(this.severity < sp.severity)
		{
			return 1;
		}
		return 0;
	}
	
	/**
	 * Gives some information about the SickPerson.
	 * 
	 * @return The String  with replacements of the super's toString and the SickPerson severity.
	 */
	@Override
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), severity);
	}
}
