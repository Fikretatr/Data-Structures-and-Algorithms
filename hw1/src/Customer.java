

/**
 * @author Muhammet Fikret ATAR 1801042693
 * This Class has all the details of Customer of automation system
 */
public class Customer implements Users {

	private int id;
	private String name;
	private String surname;
	private String e_mail;
	private String address;
	private String password;
	/**
	 * Constructor of Customer Class with parameters id, name, surname, e_mail, address, password
	 * @param id  of the Customer
	 * @param name  of the Customer
	 * @param surname  of the Customer
	 * @param e_mail  of the Customer
	 * @param address  of the Customer
	 * @param password  of the Customer
	 * 
	 */
	public Customer(int id, String name, String surname, String e_mail, String address, String password) {
		super();
		
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.e_mail = e_mail;
		this.address = address;
		this.password = password;
	}
	/**
	 * Constructor of Customer Class with parameters id, name, surname, e_mail, address, password
	 * 
	 * @param name name  of the Customer
	 * @param password password  of the Customer
	 * 
	 */
	public Customer(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", e_mail=" + e_mail + ", address="
				+ address + ", password=" + password + "]";
	}
	
	public String toString1() {
		return "Customer [name=" + name + ", password=" + password + "]";
	}



	/**
	 * Getter for  Customer id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Setter for Customer id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Getter for  Customer getName
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for Customer Name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for  Customer Surname
	 * @return surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * Setter for Customer Surname
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * Getter for  Customer E_mail
	 * @return e_mail
	 */
	public String getE_mail() {
		return e_mail;
	}
	/**
	 * Setter for Customer E_mail
	 * @param e_mail
	 */
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	/**
	 * Getter for  Customer address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Setter for Customer address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Getter for  Customer Password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Setter for Customer Password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * check method compare two customer objects
	 * @param c2 object
	 * @return boolean
	 */
	public boolean check(Customer c2) {
		if(this.id!=c2.id) {
			
			return false;
		}
		else if(this.name != c2.name) {
			
			return false;
		}
		else if (this.surname != c2.surname){
			return false;
			
		}
		else if (this.e_mail != c2.e_mail){
			return false;
			
		}
		else if (this.address != c2.address){
			return false;
			
		}
		else if (this.password != c2.password){
			return false;
			
		}
		
			
		return true;
		}
	/**
	 * check1 method compare two customer objects
	 * @param c3 object
	 * @return boolean
	 */
		public boolean check1(Customer c3) {
		
			if(this.name != c3.name) {
			
			return false;
			}
		
			else if (this.password != c3.password){
			return false;
			
			}
		
			
		return true;
	}
		/**
		 * CustomerMenu method print customer menu
		 * 
		 */
		
		public static void customerMenu() {
			System.out.println("\n-Customer Menu-");
			System.out.println("**Select the operation**");
			System.out.println("1- Search Product");
			System.out.println("2- List of products in stok");
			System.out.println("3- View previous orders");
			System.out.println("4- Return to previous menu");
		}
}


