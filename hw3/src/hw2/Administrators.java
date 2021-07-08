

import java.util.Scanner;

/**
 * @author Muhammet Fikret ATAR 1801042693 This Class has all the details of
 *         Administrators of automation system
 */
public class Administrators implements users {
	private String name;
	private String surname;

	Scanner scan = new Scanner(System.in);
	private KWLinkedList<Branches> Branchler = new KWLinkedList<Branches>();
	private KWArrayList<BranchEmployee> employee = new KWArrayList<BranchEmployee>();

	/**
	 * Default Constructor of Administrator Class
	 */
	public Administrators() {
		name = "";
		surname = "";
	}

	/**
	 * Constructor of Administrator Class with parameters name and surname
	 * 
	 * @param aName    name of the admin
	 * @param aSurname surname of the admin
	 */
	public Administrators(String aName, String aSurname) {
		name = aName;
		surname = aSurname;
	}

	/**
	 * Setter of administrator name
	 * 
	 * @param aName parameter name for setting administrator name
	 */
	public void setName(String aName) {
		name = aName;
	}

	/**
	 * Getter for administrator name
	 * 
	 * @return administrator name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of administrator surname
	 * 
	 * @param aSurname parameter name for setting administrator surname
	 */
	public void setSurname(String aSurname) {
		surname = aSurname;
	}

	/**
	 * Getter for administrator surname
	 * 
	 * @return administrator surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * tostring
	 * 
	 */

	@Override
	public String toString() {
		return "Administrators [name=" + name + ", surname=" + surname + "]";
	}
	/**
	 * list branches
	 * 
	 */
	public void list_Branches() {

		for (int i = 0; i < Branchler.getSize(); i++) {

			System.out.println(i + "->" + Branchler.get(i).getName());
		}
	}
	/**
	 * AdministratorMenu for administrator menu
	 * 
	 */
	public KWLinkedList<Branches> getBranches() {
		return Branchler;
	}
	/**
	 * setter branches
	 * @param obj1 get obje
	 * 
	 */
	public void setBranches(KWLinkedList<Branches> obj1) {
		this.Branchler = obj1;
	}
	/**
	 * add branch
	 * @param Branch branch
	 * 
	 */
	public void add_branch(Branches Branch) {

		Branchler.addLast(Branch);

	}

	/**
	 * remove branch provide delete branch
	 * 
	 * 
	 */
	public void remove_branch2() {

		list_Branches();
		int num = 0;
		System.out.println("Which branch do you want to remove ?");
		boolean exit = true;

		System.out.println(Branchler.getSize());

		while (exit) {

			System.out.println("Choice:");
			num = scan.nextInt();
			if (num > Branchler.getSize() - 1 || num < 0) {
				System.out.println("Your choice invalid");

			} else {
				exit = false;
			}
		}
		Branchler.remove(num);
		scan.close();
	}
	
	
	/**
	 * remove branch provide delete branch
	 * @param branch branch
	 * 
	 */
	public void remove(Branches branch) {
		Branchler.remove(branch);
	}
	/**
	 * remove branch provide delete branch
	 * @return employee of employee
	 * 
	 */
	public KWArrayList<BranchEmployee> getEmployee() {
		return employee;
	}
	/**
	 * remove branch provide delete branch
	 * @param employee of employee
	 * 
	 */
	public void setEmployee(KWArrayList<BranchEmployee> employee) {
		this.employee = employee;
	}

	/**
	 * add_emp for add new employee to company
	 * 
	 * @param employee1   employee1
	 *
	 */
	public void add_emp(BranchEmployee employee1) {

		employee.add(employee1);

	}

	/**
	 * display_emp for display employee in company
	 * 
	 */
	public void display_emp() {

		for (int i = 0; i < employee.size(); i++) {
			System.out.println(i + "->" + employee.get(i).getName()+" " + employee.get(i).getSurname()+" "+ employee.get(i).getBranch_name() );
		}
	}

	/**
	 * remove_emp for remove employee from company
	 * 
	 * @param rname    get name
	 * @param rsurname get surname
	 * @param Branch_name get Branch_name
	 */
	public void remove_emp(String Branch_name, String rname, String rsurname) {
		int flag = 0;
		for (int i = 0; i < employee.size(); i++) {

			if (Branch_name == employee.get(i).getBranch_name() && employee.get(i).getName() == rname
					&& employee.get(i).getSurname() == rsurname) {
				flag = 1;
				getEmployee().remove(i);
			}

		}
		if (flag == 0) {
			System.out.println("Employee not found!");
		} else {
			System.out.println("Employee is removed by admin");
		}

	}
	/**
	 * remove_emp for remove employee from company
	 * 
	 * 
	 * 
	 * @param employee1 get Branch_name
	 */
	public void remove_emp(BranchEmployee employee1) {
		
		employee.remove(employee1);
	}

	

}
