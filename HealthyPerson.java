/**
 * Specific type of Person admitted to a Hospital. A healthy person.
 * @author Zandi
 * @version 2019-03-07
 */
public class HealthyPerson extends Person
{
	/*
	 * The HealthyPerson's reason for visiting the Hospital (e.g. a yearly checkup).
	 */
	private String reason;
	
	/**
	 * Stores information about the HealthyPerson.
	 * 
	 * @param name The HealthyPerson's name.
	 * @param age The HealthyPerson's age, in years.
	 * @param reason The HealthyPerson's reason for visiting the Hospital (e.g. a yearly checkup).
	 */
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
	}

	/**
	 * Implementation method for Person's compareTo method(). Does the actual legwork of comparison tocompare a HealthyPerson (self) vs. another Person (o).
Parameters:Returns:* @param o The other Person to compare self to.
	 * @return If o is not of type HealthyPerson, return 0. Else, return (ignoring case):
	 * (1) self's name comes "before" o's name: negative number
	 * (2) self's name comes "after" p's name: positive number
	 * (3) names are equivalent: 0i.e. the natural ordering of the name strings, ignoring case
	 * Orders alphabetically.
	 */
	@Override
	protected int compareToImpl(Person p) {
		// TODO finish compareTo method
		return 0;
	}
	
	/**
	 * Gives some information about the HealthyPerson.
	 * 
	 * @return The String "%s In for %s" with replacements of the super's toString and the HealthyPerson's reason.
	 */
	@Override
	public String toString()
	{
		return String.format("%s In for %s", super.toString(), reason);
	}
}
