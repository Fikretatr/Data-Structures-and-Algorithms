
/**
 * @author Muhammet Fikret ATAR 1801042693
 * This Class has all the details of OfficeCabinets of Products 
 */
public class OfficeCabinets extends Products {
	/**
	 * Constructor of OfficeCabinets Class with Product_Type and Model
	 * @param pProduct_Type Product_Type of the OfficeCabinets
	 * @param pModel Model of the OfficeCabinets
	 */
	public OfficeCabinets(String pProduct_Type, String pModel) {
		super(pProduct_Type, pModel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OfficeCabinets [toString()=" + super.toString() + ", to1String()=" + to1String()
				+ ", getProduct_Type()=" + getProduct_Type() + ", getModel_name()=" + getModel_name()
				+ ", getColor_name()=" + getColor_name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

		
	
}
