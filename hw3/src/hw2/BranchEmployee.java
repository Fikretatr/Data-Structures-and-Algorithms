

import java.util.Scanner;

// import the ArrayList class
/**
 * @author Muhammet Fikret ATAR 1801042693 This Class has all the details of
 *         Administrators of automation system
 */
public class BranchEmployee implements users {
	private String name;
	private String surname;
	private String Branch_name;
	/**
	 * Default Constructor of Administrator Class
	 */

	HybridList<Products> Furnitures = new HybridList<Products>();
	/**
	 * Constructor of BranchEmployee Class with parameters name and surname
	 * 
	 * 
	 * 
	 * 
	 */
	public BranchEmployee() {
		name = "";
		surname = "";
		Branch_name = "";
	}

	/**
	 * Constructor of BranchEmployee Class with parameters name and surname
	 * 
	 * @param aName    name of the admin
	 * @param aSurname surname of the admin
	 * @param aBranch_name name of branch name
	 */
	public BranchEmployee(String aBranch_name, String aName, String aSurname) {
		name = aName;
		surname = aSurname;
		Branch_name = aBranch_name;
	}
	/**
	 * get branch name 
	 * 
	 * 
	 *
	 * 
	 */
	public String getBranch_name() {
		return Branch_name;
	}
	/**
	 * set branch name
	 * 
	 * 
	 * 
	 * 
	 */
	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}

	/**
	 * Setter of BranchEmployee name
	 * 
	 * @param aName parameter name for setting administrator name
	 */
	public void setName(String aName) {
		name = aName;
	}

	/**
	 * Getter for BranchEmployee name
	 * 
	 * @return administrator name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of BranchEmployee surname
	 * 
	 * @param aSurname parameter name for setting administrator surname
	 */
	public void setSurname(String aSurname) {
		surname = aSurname;
	}

	/**
	 * Getter for BranchEmployee surname
	 * 
	 * @return administrator surname
	 */
	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return "BranchEmployee [name=" + name + ", surname=" + surname + ", Branch_name=" + Branch_name + "]";
	}

	/**
	 * Add product method adds products to system.
	 * 
	 * 
	 */
	public void add_product() {
		Scanner scan = new Scanner(System.in);
		int i, choice;
		String types[] = new String[] { "chair", "desk", "meetingtable", "bookcases", "officecabinets" };
		String colors[][] = new String[][] { { "red", "yellow", "blue", "brown", "orange", "green", "black" },
				{ "red", "yellow", "blue", "brown" }, { "red", "yellow", "blue", "brown" } };
		String models[][] = new String[][] {
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7" },
				{ "model1", "model2", "model3", "model3", "model4", "model5" },
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7", "model8", "model9",
						"model10" },
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7", "model8", "model9",
						"model10", "model11", "model12" },
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7", "model8", "model9",
						"model10", "model11", "model12" } };
		for (i = 0; i < types.length; i++) {

			System.out.println(i + "->" + types[i]);

		}
		System.out.println("Choice Type:");
		choice = scan.nextInt();
		String Type;
		switch (choice) {

		case 0:
			Type = types[0];
			break;

		case 1:
			Type = types[1];
			break;
		case 2:
			Type = types[2];
			break;
		case 3:
			Type = types[3];
			break;
		case 4:
			Type = types[4];
			break;
		default:
			System.out.println("Type is not faund");
			return;
		}
		int Type_index = choice;

		String Color = "-";
		if (Type_index == 0 || Type_index == 1 || Type_index == 2) {

			for (i = 0; i < colors[Type_index].length; i++) {

				System.out.println(i + "->" + colors[Type_index][i]);

			}

			System.out.println("Color Type:");

			choice = scan.nextInt();

			switch (choice) {

			case 0:
				Color = colors[Type_index][choice];
				break;

			case 1:
				Color = colors[Type_index][choice];
				break;
			case 2:
				Color = colors[Type_index][choice];
				break;
			case 3:
				Color = colors[Type_index][choice];
				break;
			case 4:
				Color = colors[Type_index][choice];
				break;
			default:
				System.out.println("Color is not faund");
				return;
			}

		}

		for (i = 0; i < models[Type_index].length; i++) {

			System.out.println(i + "->" + models[Type_index][i]);

		}

		System.out.println("Model Type:");

		choice = scan.nextInt();
		String Model;

		switch (choice) {

		case 0:
			Model = models[Type_index][choice];
			break;

		case 1:
			Model = models[Type_index][choice];
			break;
		case 2:
			Model = models[Type_index][choice];
			break;
		case 3:
			Model = models[Type_index][choice];
			break;
		case 4:
			Model = models[Type_index][choice];
			break;
		default:
			System.out.println("Color is not faund");
			return;
		}

		Furnitures.add(0, new Products(Type, Model, Color));

	}

	void display_products() {

		Furnitures.display(Furnitures);
	}

	/**
	 * Remove product method removes products from system.
	 * 
	 * 
	 */
	public void remove_product() {

		Scanner scan = new Scanner(System.in);
		int i, choice;
		String types[] = new String[] { "chair", "desk", "meetingtable", "bookcases", "officecabinets" };
		String colors[][] = new String[][] { { "red", "yellow", "blue", "brown", "orange", "green", "black" },
				{ "red", "yellow", "blue", "brown" }, { "red", "yellow", "blue", "brown" } };
		String models[][] = new String[][] {
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7" },
				{ "model1", "model2", "model3", "model3", "model4", "model5" },
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7", "model8", "model9",
						"model10" },
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7", "model8", "model9",
						"model10", "model11", "model12" },
				{ "model1", "model2", "model3", "model3", "model4", "model5", "model6", "model7", "model8", "model9",
						"model10", "model11", "model12" } };
		for (i = 0; i < types.length; i++) {

			System.out.println(i + "->" + types[i]);

		}
		System.out.println("Choice Type:");
		choice = scan.nextInt();
		String Type;
		switch (choice) {

		case 0:
			Type = types[0];
			break;

		case 1:
			Type = types[1];
			break;
		case 2:
			Type = types[2];
			break;
		case 3:
			Type = types[3];
			break;
		case 4:
			Type = types[4];
			break;
		default:
			System.out.println("Type is not faund");
			return;
		}
		int Type_index = choice;

		String Color = "-";
		if (Type_index == 0 || Type_index == 1 || Type_index == 2) {

			for (i = 0; i < colors[Type_index].length; i++) {

				System.out.println(i + "->" + colors[Type_index][i]);

			}

			System.out.println("Color Type:");

			choice = scan.nextInt();

			switch (choice) {

			case 0:
				Color = colors[Type_index][choice];
				break;

			case 1:
				Color = colors[Type_index][choice];
				break;
			case 2:
				Color = colors[Type_index][choice];
				break;
			case 3:
				Color = colors[Type_index][choice];
				break;
			case 4:
				Color = colors[Type_index][choice];
				break;
			default:
				System.out.println("Color is not faund");
				return;
			}

		}

		for (i = 0; i < models[Type_index].length; i++) {

			System.out.println(i + "->" + models[Type_index][i]);

		}

		System.out.println("Model Type:");

		choice = scan.nextInt();
		String Model;

		switch (choice) {

		case 0:
			Model = models[Type_index][choice];
			break;

		case 1:
			Model = models[Type_index][choice];
			break;
		case 2:
			Model = models[Type_index][choice];
			break;
		case 3:
			Model = models[Type_index][choice];
			break;
		case 4:
			Model = models[Type_index][choice];
			break;
		default:
			System.out.println("Color is not faund");
			return;
		}

		Furnitures.add(0, new Products(Type, Model, Color));

	}
	/**
	 * Add product function provide add product to system 
	 * 
	 * @param index    of hybrid list
	 * @param Type of product type
	 * @param Model name of model name
	 * @param Color name of color
	 */
	public void add_product(int index,String Type, String Model , String Color) {
		Furnitures.add(index, new Products(Type, Model, Color));
	}
	/**
	 * 
	 * Add product function provide add product to system 
	 * @param index    of hybrid list
	 * @param Type of product type
	 * @param Model name of model name
	 * 
	 */
	
	public void add_product(int index,String Type, String Model ) {
		Furnitures.add(index, new Products(Type, Model));
	}
	/**
	 * Remove product function provide remove from product to system 
	 * 
	 * @param nodeIndex    of hybrid list
	 * @param index of product type
	 *  
	 * 
	 */
	public void remove_product(int nodeIndex, int index) {
		Furnitures.removeArraylist(nodeIndex, index);
	}
	
	
}
