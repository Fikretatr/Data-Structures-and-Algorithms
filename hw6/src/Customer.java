
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author fikret
 * 		   1801042693	
 *
 */

public class Customer extends User {

	HashMap<String, Product> products;
	HashMap<String, Product> orders;

	
	/**
	 * @param ID
	 * @param password
	 * @param name
	 * @param state
	 */
	public Customer(String ID, String password, String name, String state) {

		super(ID, password, name, state);
		products = new HashMap<>();
		orders = new HashMap<>();
	}

	/**
	 * list orders method 
	 * 
	 */
	@Override
	public boolean listOrder() {
		Iterator<String> it = orders.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(orders.get(it.next()));
		}
		return true;
	}

	/**
	 * add product method 
	 * @param product add product 
	 * @return true boolean 
	 */
	@Override
	public boolean addP(Product product) {
		products.put(product.getID(), product);
		return true;
	}


	/**
	 * list of product Customer
	 */
	public boolean listP() {
		Iterator<String> it = products.keySet().iterator();
		while (it.hasNext()) System.out.println(products.get(it.next()));
		return true;
	}
	
	/**
	 * remove product
	 */
	@Override
	public boolean removeP(Product product) {

		products.remove(product.getID());
		return true;
	}
	/**
	 * list product 
	 *
	 */
	public void list_products() {
		Iterator<String> it = products.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(products.get(it.next()));
		}
	}
	/**
	 *@return false false
	 */
	public boolean search_product() {
		return false;
	}
	/**
	 *@return false false
	 */
	public boolean query_product() {
		return false;
	}
	/**
	 * get product method
	 *
	 * @return product hashmap type
	 */
	public List<Product> getProducts() {
		ArrayList<Product> list = new ArrayList<>();
		Iterator<String> it = products.keySet().iterator();
		while(it.hasNext()){
			list.add(products.get(it.next()));
		}
		return list;
	}
	/**
	 * set product method
	 *
	 * @param products
	 */
	public void setProducts(ArrayList<Product> products){
		for(int i=0 ; i<products.size() ; i++){
			this.products.put(products.get(i).getID(), products.get(i));
		}
	}
	/**
	 *@return product orders
	 */
	public HashMap<String, Product> getOrders() {
		return orders;
	}
	/**
	 * @param orders product of order
	 *set orders
	 */
	public void setOrders(HashMap<String, Product> orders) {
		this.orders = orders;
	}
}
