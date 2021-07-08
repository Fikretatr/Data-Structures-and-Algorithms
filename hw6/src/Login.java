import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fikret 	
 *			1801042693
 */


public class Login {
    /**
     * 
     * @return list object 
     * @throws FileNotFoundException
     */
    public static User login(String ID, String password) throws FileNotFoundException {
        String line;
        String splitter = ";";
        String state ;
        try(BufferedReader br = new BufferedReader(new FileReader(new File("users.txt")))){
            while((line = br.readLine()) != null){
                String[] info = line.split(splitter);
                for(int i = 0; i < info.length ; i += 4){
                    if(info[i+3].equals("Trader")){
                        if(info[i].equals(ID) && info[i+1].equals(password)){
                            return new Trader(info[i], info[i+1], info[i+2], info[i+3]);
                        }
                    }else{
                        if(info[i].equals(ID) && info[i+1].equals(password)){
                            return new Customer(info[i], info[i+1], info[i+2], info[i+3]);
                        }
                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Wrong ID or Password");
        return null;
    }

}
