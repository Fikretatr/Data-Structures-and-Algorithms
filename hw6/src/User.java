
/**
 * @author Fikret 	
 * 			1801042693
 *
 */

public abstract class User{
    public String state;
    String ID;
    String password;
    String name;


    /**
     * @param ID user id 
     * @param password user password
     */
    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    /**
     * @param ID user id 	
     * @param password user password 
     * @param name user name 
     * @param state user state 
     */
    public User(String ID, String password, String name, String state) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.state = state;
    }



    /**
     * list orders
     */
    public abstract boolean   listOrder();

    /**
     * add product method provide add 
     * @param product
     * @return
     */
    public abstract boolean addP(Product product);

    /**
     * remove product method provide remove
     * @param product
     */
    public abstract boolean removeP(Product product);

    /**
     * get state method
     * @return state state
     */
    public  String getState() {
        return state;
    }


    /**
     * get id method 
     * @return id user id
     */
    public String getID() { return ID; }

    /**
     * set id method 
     * @param ID id 
     */
    public void setID(String ID) { this.ID = ID; }

    /**
     * get user password method 
     * @return password 
     */
    public String getPassword() { return password; }

    /**
     * set password 
     * @param password
     */
    public void setPassword(String password) { this.password = password; }

    /**
     * set state 
     * @param state user state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * get name method 
     * @return name user
     */
    public String getName() {
        return name;
    }

    /**
     * set name method 
     * @param name user 
     */
    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean listP();


    public class Order {


        public final String trader;
        public final String customer;
        public final String product;
        public final String state;

        public Order(String trader, String customer, String product, String state) {
            this.trader = trader;
            this.customer = customer;
            this.product = product;
            this.state = state;
        }

        
        /**
         * user information print method 
         */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("**********Orders************");
            sb.append("Trader:" + trader + "\n");
            sb.append("Customer:" + customer + "\n");
            sb.append("Product:" + product + "\n");
            switch (state){
                case "MET":
                    sb.append("Met\n");
                    break;
                case "PUT":
                    sb.append("putted\n");
                    break;
                case "REMOVED":
                    sb.append("Removed\n");
                    break;
            }
            return sb.toString();
        }
    }
}
