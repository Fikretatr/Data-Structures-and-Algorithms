import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            Product product = new Product("SRTEH2FF9KEDEFGF","Alisha Solid Women's Cycling Shorts","Alisha Solid Women's Cycling Shorts",999,379, "Key Features of Alisha Solid Women's Cycling Shorts Cotton Lycra Navy, Red, Navy,Specifications of Alisha Solid Women","Alisha");
            System.out.println("Welcome the E-Shopping");
            int choice;
            String productID = null;
        Trader trader = null;
        User customer = null;
        try {
            trader = (Trader)Login.login("00000000","000000");
            customer = (Customer)Login.login("11111111", "111111");
            trader = (Trader) Filter.csvRead(trader , trader.getName());
            customer = (Customer)Filter.csvRead(customer, customer.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


            product = new Product("SRTEH2FF9KEDEFGF","Alisha Solid Women's Cycling Shorts","Alisha Solid Women's Cycling Shorts",999,379,"Key Features of Alisha Solid Women's Cycling Shorts Cotton Lycra Navy, Red, Navy,Specifications of Alisha Solid Women","Alisha");
            

            if(trader.listP() == true){
                System.out.println("passed.->listP");
            }else{
                System.out.println("Failed");
            }
            if(trader.listOrder() == true){
                System.out.println("passed.->listOrder");
            }else{
                System.out.println("Failed");
            }
            if(((Customer) customer).addP(product) == true){
                System.out.println("passed.->addP");
            }else{
                System.out.println("Failed");
            }
            if(((Customer) customer).removeP(product) == true){
                System.out.println("passed.->removeP");
            }else{
                System.out.println("Failed");
            }
            if(((Customer) customer).listP() == true){
                System.out.println("passed.->listP");
            }else{
                System.out.println("Failed");
            }

            if(((Customer) customer).listP() == true){
                System.out.println("passed.->listP");
            }else{
                System.out.println("Failed");
            }
            if(trader.addP(product) == true){
                System.out.println("passed.->addP");
            }else{
                System.out.println("failed");
            }

            if(trader.editP(trader.getProduct().get("SRTEH2FF9KEDEFGF"), product) == true){
                System.out.println("passed.->editP");
            }else{
                System.out.println("Failed");
            }
            if(trader.removeP(trader.getProduct().get("SRTEH2FF9KEDEFGF")) == true){
                System.out.println("passed.->removeP");
            }else{
                System.out.println("Failed");
            }



            
        Filter.categorySort(trader.getProducts());
        ArrayList<Product> name = (ArrayList<Product>) Filter.nameSort( trader.getProducts());
        System.out.println("passed.->nameSort");


        /*ArrayList<Product> discountSort = Filter.discountSorting((ArrayList<Product>) trader.getProducts());
        Filter.categorySort(trader.getProducts());

        ArrayList<Product> priceSort = (ArrayList<Product>) Filter.priceSorting((ArrayList<Product>) trader.getProducts());*/
        
    }
}
