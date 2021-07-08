
/**
 * @author Muhammet Fikret ATAR 1801042693 This Class has all the details of
 *         Branches of automation system
 */
public class Branches {

	private String name;
	/**
	 * Default Constructor of Administrator Class
	 */
	public Branches() {

		name = "";

	}
	/**
	 *  Constructor of Administrator Class
	 *  @param Name name of branches
	 */
	public Branches(String Name) {

		name = Name;

	}
	/**
	 * getter name 
	 * @return name name
	 */
	public String getName() {
		return name;
	}
	/**
	 * to string of branches
	 */
	@Override
	public String toString() {
		return "Branches [name=" + name + "]";
	}
	/**
	 * setter name branches
	 * @param name name of branches
	 */
	public void setName(String name) {
		this.name = name;
	}

}
