
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


/**
 * @author Fikret 
 * 		   1801042693	
 *
 */

public class Trader extends User {

	private HashMap<String, Product> order;
	private HashMap<String, Product> product;

	/**
	 * Constructor of class
	 * @param ID
	 * @param password
	 * @param name
	 * @param state
	 */
	public Trader(String ID, String password, String name, String state) {
		super(ID, password, name, state);
		product = new HashMap<>();
		order = new HashMap<>();
	}
	
	/**
	 * list of product trader
	 */
	public boolean listP() {
		Iterator<String> it = product.keySet().iterator();
		while (it.hasNext()) System.out.println(product.get(it.next()));
		return true;
	}

	/**
     * edit product method
     */
    public boolean editP(Product old_product, Product new_product) {

    	product.put(old_product.getID(), new_product);
		return true;
    }

	/**
	 * list orders
	 */
	@Override
	public boolean listOrder() {
		Iterator<String> it = order.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(order.get(it.next()));
		}
		return true;
	}

	/**
	 * remove product
	 */
	public boolean removeP(Product oldProduct) {
		product.remove(oldProduct.getID());
		return true;
	}

	/**
	 * add product method
	 * 
	 * @return true boolean
	 */

	public boolean addP(Product new_product) {
		product.put(new_product.getID(), new_product);
		return true;
	}

	/**
	 * get product method
	 *
	 * @return product hashmap type
	 */
	public HashMap<String, Product> getProduct() {
		return product;
	}
	/**
	 * get product method
	 * 
	 * @return product hashmap type
	 */
	public List<Product> getProducts() {
		ArrayList<Product> list = new ArrayList<>();
		Iterator<String> it = product.keySet().iterator();
		while(it.hasNext()){
			list.add(product.get(it.next()));
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
			this.product.put(products.get(i).getID(), products.get(i));
		}
	}

	/**
	 * get orders method
	 * 
	 * @return
	 */
	public HashMap<String, Product> getOrders() {
		return order;
	}

	/**
	 * set orders method
	 * 
	 * @param orders
	 */
	public void setOrders(HashMap<String, Product> orders) {
		this.order = orders;
	}

}
