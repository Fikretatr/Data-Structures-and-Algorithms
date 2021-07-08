
/**
 * @author Muhammet Fikret ATAR 1801042693
 * This Class has all the details of Bookcases of Products
 */
public class Bookcases extends Products {
	/**
	 * Constructor of Bookcases Class with Product_Type and Model
	 * @param pProduct_Type Product_Type of the Bookcases
	 * @param pModel Model of the Bookcases
	 */
	public Bookcases(String pProduct_Type, String pModel) {
		super(pProduct_Type, pModel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bookcases [toString()=" + super.toString() + ", to1String()=" + to1String() + ", getProduct_Type()="
				+ getProduct_Type() + ", getModel_name()=" + getModel_name() + ", getColor_name()=" + getColor_name()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
