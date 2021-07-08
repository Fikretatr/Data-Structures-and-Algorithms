import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Fikret 	
 * 		1801042693
 *
 */

public class Filter {

    public static User csvRead(User user, String name){
        ArrayList<Product> sort = new ArrayList<>();
        String line = "";
        String csvSplit = ";";
        Product product;
        int index = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("e-commerce-samples.csv"))){
            while((line = br.readLine()) != null){
                String[] string = line.split(csvSplit);
                for(int i = 0; i < string.length ; i++){
                    if(name.equals(string[6]))
                        sort.add(new Product(string[0],string[2], string[1], (Integer.parseInt(string[3])),(Integer.parseInt(string[4])),string[5], string[6] ));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(user.getState().equals("Trader")){
            ((Trader)user).setProducts(sort);
        }else{
            ((Customer)user).setProducts(sort);
        }
        return user;
    }

    public static void categorySort(List<Product> productList) {
        ArrayList<Product> list = (ArrayList<Product>) productList;
        Product temp;
        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j).getCategory().compareTo(list.get(j + 1).getCategory()) > 0) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }

    }

    public static List<Product> nameSort(List<Product> productList) {
        productList = (ArrayList<Product>) productList;
        Product temp;

        for (int i = 0; i < productList.size(); i++) {
            for (int j = 0; j < productList.size() - i - 1; j++) {
                if (productList.get(j).getName().compareTo(productList.get(j + 1).getName()) > 0) {
                    temp = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, temp);
                }
            }

         }
        return productList;
    }

    


    /**
     * sortPrice method provide sort price
     * @param sort
     * @return sortedProduct object 
     */
    public static ArrayList<Product> priceSorting(ArrayList<Product> sort){
        for (int i = 1; i < sort.size(); ++i) {
            Product nextItem = sort.get(i);
            int insertion = i;
            while ((insertion > 0) &&(sort.get(insertion-1).getPrice() > (nextItem.getPrice()))) {
                sort.set(insertion, nextItem);
            } // end while
            sort.set(insertion, nextItem);
        }
        return sort;
    }
    /**
     * sortPriceLowerUpper method provide sort lower upper price 
     * @param sorted object
     * @param lowPrice variable
     * @param upperPrice variable
     * @return sort object 
     */
    public static ArrayList<Product> priceSortingIncreasing(ArrayList<Product> sorted, int lowPrice, int upperPrice){
        ArrayList<Product> sortedList = new ArrayList<>();
        for(int i=0 ; i < sorted.size() ; i++){
            if(sorted.get(i).getPrice() > lowPrice && sorted.get(i).getPrice() < upperPrice){
                sortedList.add(sorted.get(i));
            }
        }
        return sortedList;
    }

    /**
     * sortDiscount method provide sort discount 
     * @param sorted object
     * @return sortedProduct object 
     */
    public static ArrayList<Product> discountSorting(ArrayList<Product> sorted){
        for (int i = 1; i < sorted.size(); ++i) {
            Product nextItem = sorted.get(i);
            int insertion = i;
            while ((insertion > 0) &&(sorted.get(insertion-1).getDiscount_amount() > (nextItem.getDiscount_amount()))) {
                sorted.set(insertion, nextItem);
            } // end while
            sorted.set(insertion, nextItem);
        }
        return sorted;
    }
    
    
    /**
     * sortDiscountLowerUpper method provide discount lower upper 
     * @param sorted object
     * @param lowDiscount variable
     * @param upperDiscount variable
     * @return sort object 
     */
    public static ArrayList<Product> discountSortingIncreasing(ArrayList<Product> sorted, int lowDiscount, int upperDiscount){
        ArrayList<Product> sort = new ArrayList<>();
        for(int i=0 ; i < sorted.size() ; i++){
            if(sorted.get(i).getDiscount_amount() > lowDiscount && sorted.get(i).getDiscount_amount() < upperDiscount){
                sort.add(sorted.get(i));
            }
        }
        return sort;
    }
}
