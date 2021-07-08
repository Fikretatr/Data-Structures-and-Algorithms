
import java.util.Scanner;
/**
 * @author Muhammet Fikret ATAR 1801042693
 * This Class has all the details of Administrators of automation system
 */
public class Administrators implements Users {
	private String name;
	private String surname;
	
	/**
	 * Default Constructor of Administrator Class
	 */
	public Administrators() {
		name = "";
		surname = "";
	}
	
	/**
	 * Constructor of Administrator Class with parameters name and surname
	 * @param aName name of the admin
	 * @param aSurname surname of the admin
	 */
	public Administrators(String aName,String aSurname) {
		name = aName;
		surname = aSurname;
	}
	
	/**
	 * Setter of administrator name
	 * @param aName parameter name for setting administrator name
	 */
	public void setName(String aName) {
		name = aName;
	}
	/**
	 * Getter for administrator name
	 * @return administrator name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter of administrator surname
	 * @param aSurname parameter name for setting administrator surname
	 */
	public void setSurname(String aSurname) {
		surname = aSurname;
	}
	/**
	 * Getter for administrator surname
	 * @return administrator surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * AdministratorMenu for administrator menu
	 * 
	 */
	public void administratorMenu() {
		System.out.println("\n-Administrator Menu-");
		System.out.println("Please choose the action from below:");
		System.out.println("1- Add a branch");
		System.out.println("2- Remove a branch");
		System.out.println("3- Add a branch employee");
		System.out.println("4- Remove a branch employee");
		System.out.println("5- List branches");
		System.out.println("6- Go back");
	}

	@Override
	public String toString() {
		return "Administrators [name=" + name + ", surname=" + surname + "]";
	}
	
	
}
