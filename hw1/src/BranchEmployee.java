
/**
 * @author Muhammet Fikret ATAR 1801042693
 * This Class has all the details of BranchEmployee 
 */

public class BranchEmployee implements Users {
	@Override
	public String toString() {
		return "BranchEmployee [name=" + name + ", surname=" + surname + "]";
	}
	private String name;
	private String surname;
	
	/**
	 * Constructor of BranchEmployee Class 
	 * @param Name name of the branch employee
	 * @param Surname surname of the Branch employee
	 */
	public BranchEmployee(String Name,String Surname) {
		name = Name;
		surname = Surname;
	}
	
	/**
	 * Setter of Branch employee name
	 * @param Name parameter name for setting Branch employee name
	 */
	public void setName(String Name) {
		name = Name;
	}
	/**
	 * Getter for Branch employee name
	 * @return Branch employee name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter of branch employee surname
	 * @param Surname parameter name for setting branch Employee surname
	 */
	public void setSurname(String Surname) {
		name = Surname;
	}
	/**
	 * Getter for Branch employee surname
	 * @return Branch employee surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * BranchEmployeeMenu for Branch employee menu
	 * 
	 */
	public void BranchEmployeeMenu() {
		System.out.println("\n-BranchEmployee Menu-");
		System.out.println("**Select the operation**");
		System.out.println("1-Display products in stock");
		System.out.println("2-Information of the previous orders of a customer");
		System.out.println("3-Add Product");
		System.out.println("4-Remove products");
		System.out.println("5- Return to previous menu");
	}
}
