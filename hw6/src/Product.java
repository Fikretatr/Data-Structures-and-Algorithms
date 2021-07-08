
/**
 * @author fikret 1801042693
 *
 */

public class Product {

	
	private String categoryDefault = "";
	private int lowPrice = 0;
	private int highPrice = 1000000;
	private String default_name = "";

	private String ID;
	private String category;
	private String name;
	private String description;
	private int price;
	private int discount_amount;
	private String nameTrader;

	/**
	 * Constructor of class
	 * 
		 * @param ID              of products
		 * @param category        of products
		 * @param name            of products
		 * @param price           of products
		 * @param discount_amount of products
		 * @param description     of products
	 */
	public Product(String ID, String category, String name, int price, int discount_amount, String description ,String nameTrader) {
		this.ID = ID;
		this.category = category;
		this.name = name;
		this.price = price;
		this.discount_amount = discount_amount;
		this.description = description;
		this.nameTrader = nameTrader;

	}

	/**
	 * to string print method
	 * @return sb.toString 
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID:" + ID + "\n");
		sb.append("Name:" + name + "\n");
		sb.append("Category:" + category + "\n");
		sb.append("Description:" + description + "\n");
		sb.append("Discount:" + discount_amount + "\n");
		sb.append("Price:" + price + "\n");
		return sb.toString();

	}

	/**
	 * get method
	 * @return id get id method
	 */
	public String getID() {
		return ID;
	}

	/**
	 * set id method
	 * @param ID param id
	 */
	public void setID(String ID) {
		this.ID = ID;
	}

	/**
	 * get method
	 * @return id get id method
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * set category method
	 * @param category parameter category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * get method
	 * 
	 * @return name get name method
	 */
	public String getName() {
		return name;
	}

	/**
	 * set name method
	 * @param name set name method set name method
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get description method
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * set description method
	 * 
	 * @param description set description method
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * get price method
	 * 
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price set price method
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * getDiscount_amount method
	 * 
	 * @return discount_amount return amount
	 */
	public int getDiscount_amount() {
		return discount_amount;
	}

	/**
	 * @param discount_amount set discount_amount count method
	 */
	public void setDiscount_amount(int discount_amount) {
		this.discount_amount = discount_amount;
	}

	/**
	 * get method
	 * 
	 * @return categoryDefault getCategoryDefault
	 */
	public String getCategoryDefault() {
		return categoryDefault;
	}

	/**
	 * @param categoryDefault set category default method
	 */
	public void setCategoryDefault(String categoryDefault) {
		this.categoryDefault = categoryDefault;
	}

	/**
	 * get method
	 * 
	 * @return name
	 */
	public int getLowPrice() {
		return lowPrice;
	}

	/**
	 * set low price method
	 * 
	 * @param lowPrice
	 */
	public void setLowPrice(int lowPrice) {
		this.lowPrice = lowPrice;
	}

	/**
	 * get method
	 * 
	 * @return name return name
	 */
	public int getHighPrice() {
		return highPrice;
	}

	/**
	 * set method
	 * 
	 * @param highPrice
	 */
	public void setHighPrice(int highPrice) {
		this.highPrice = highPrice;
	}

	/**
	 * get method
	 * 
	 * @return name return name
	 */
	public String getDefault_name() {
		return default_name;
	}

	/**
	 * set method
	 * 
	 * @param default_name set name
	 */
	public void setDefault_name(String default_name) {
		this.default_name = default_name;
	}


}
