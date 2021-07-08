

/**
 * @author Muhammet Fikret ATAR 1801042693 This Class has all the details of
 *         Products of automation system
 */
public class Products {
	private String Product_Type;
	private String Model_name;
	private String Color_name;

	/**
	 * Constructor of Products Class with parameters Product type , Model and Color
	 * 
	 * @param pProduct_Type type of the Products
	 * @param pModel        model of the Products
	 * @param pColor        Color color of the Products
	 */
	public Products(String pProduct_Type, String pModel, String pColor) {
		Product_Type = pProduct_Type;
		Model_name = pModel;
		Color_name = pColor;
	}

	/**
	 * Constructor of Products Class with parameters Product type , Model and Color
	 * 
	 * @param pProduct_Type type of the Products
	 * @param pModel        model of the Products
	 * 
	 * 
	 */

	public Products(String pProduct_Type, String pModel) {
		Product_Type = pProduct_Type;
		Model_name = pModel;

	}

	@Override
	/**
	 * toString for print
	 * 
	 * @return " Product_Type=" + Product_Type + ", Model_name=" + Model_name + ",
	 *         Color_name=" + Color_name
	 */
	public String toString() {
		return " Product_Type=" + Product_Type + ", Model_name=" + Model_name + ", Color_name=" + Color_name;
	}

	/**
	 * toString for print
	 * 
	 * @return " Product_Type=" + Product_Type + ", Model_name=" + Model_name
	 */
	public String to1String() {
		return " Product_Type=" + Product_Type + ", Model_name=" + Model_name;
	}

	/**
	 * Getter for Product_Type
	 * 
	 * @return Product_Type
	 */
	public String getProduct_Type() {
		return Product_Type;
	}

	/**
	 * Setter for setProduct_Type
	 * 
	 * @param product_Type for product type
	 */
	public void setProduct_Type(String product_Type) {
		Product_Type = product_Type;
	}

	/**
	 * Check method compare two product object
	 * 
	 * @param p2 object
	 * @return boolean
	 */
	public boolean check(Products p2) {
		if (this.Product_Type != p2.Product_Type) {

			return false;
		} else if (this.Model_name != p2.Model_name) {

			return false;
		} else if (this.Color_name != p2.Color_name) {
			return false;

		}

		return true;
	}

	/**
	 * Getter for Model name
	 * 
	 * @return Model_name of the product
	 */
	public String getModel_name() {
		return Model_name;
	}

	/**
	 * Setter for model name
	 * 
	 * @param model_name of the product
	 */
	public void setModel_name(String model_name) {
		Model_name = model_name;
	}

	/**
	 * Getter for Product_Type
	 * 
	 * @return Product_Type of the product
	 */
	public String getColor_name() {
		return Color_name;
	}

	/**
	 * Setter for color_name
	 * 
	 * @param color_name of the product
	 */
	public void setColor_name(String color_name) {
		Color_name = color_name;
	}

}
