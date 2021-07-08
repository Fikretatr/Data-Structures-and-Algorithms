

/**
 * @author Muhammet Fikret ATAR 1801042693 This Class has all the details of
 *         Customer of automation system
 */
public class Customer implements users {

	int id;
	private String name;
	private String surname;
	private String e_mail;
	private String address;
	private String password;

	private KWArrayList<Customer> customers = new KWArrayList<Customer>();

	/**
	 * getter method customer
	 * 
	 *
	 */
	public int getId() {
		return id;
	}
	/**
	 *  setter method
	 *  @param id  of branches
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * getter method customer
	 * @return name
	 *
	 */
	public String getName() {
		return name;
	}
	/**
	 *  setter method
	 *  @param name  of branches
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter method customer
	 * @return surname
	 *
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 *  setter method
	 *  @param surname  of branches
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * getter method customer
	 * @return e_mail
	 *
	 */
	public String getE_mail() {
		return e_mail;
	}
	/**
	 *  setter method
	 *  @param e_mail  of branches
	 */
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	/**
	 * getter method customer
	 * @return address
	 *
	 */
	public String getAddress() {
		return address;
	}
	/**
	 *  setter method
	 *  @param address  of branches
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * getter method customer
	 * @return password
	 *
	 */
	public String getPassword() {
		return password;
	}
	/**
	 *  setter method
	 *  @param password  of branches
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * getter method customer
	 * @return customers
	 *
	 */
	public KWArrayList<Customer> getCustomers() {
		return customers;
	}
	/**
	 *  setter method
	 *  @param customers  of branches
	 */
	public void setCustomers(KWArrayList<Customer> customers) {
		this.customers = customers;
	}

	/**
	 * Default Constructor of Customer Class with parameters id, name, surname,
	 * e_mail, address, password
	 * 
	 *
	 */
	public Customer() {
		name = "";
		surname = "";
		e_mail = "";
		address = "";
	}

	/**
	 * Constructor of Customer Class with parameters id, name, surname, e_mail,
	 * address, password
	 * @param cid    of the Customer
	 * @param cname    of the Customer
	 * @param csurname of the Customer
	 * @param ce_mail of the Customer
	 * @param caddress  of the Customer
	 * @param cpassword of the Customer
	 * 
	 * 
	 */
	public Customer(int cid, String cname, String csurname, String ce_mail, String caddress, String cpassword) {
		id = cid;
		name = cname;
		surname = csurname;
		e_mail = ce_mail;
		address = caddress;
		password = cpassword;
	}

	/**
	 * Subscribes method
	 * @param Custom1 of the Customer
	 */
	public void Subscribes(Customer Custom1) {

		customers.add(Custom1);
	}

	/**
	 * display_emp for display employee in company
	 * 
	 */
	public void display_cus() {

		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i).toString());
		}
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", surname=" + surname + ", e_mail=" + e_mail + ", address=" + address
				+ ", password=" + password;
	}

}
