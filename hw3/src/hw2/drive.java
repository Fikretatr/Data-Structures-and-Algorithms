

import java.util.ArrayList;
import java.util.Scanner;

public class drive {

	public static void main(String[] args) {

		
		//-----------------------------------------Admin---------------------------------------------------
		Administrators Admin = new Administrators("Fikret", "ATAR");

		Branches branch1 = new Branches("Istanbul");
		Branches branch2 = new Branches("Samsun");
		Branches branch3 = new Branches("Adana");
		Branches branch4 = new Branches("Aydin");

		Admin.add_branch(branch1);
		Admin.add_branch(branch2);
		Admin.add_branch(branch3);
		Admin.add_branch(branch4);

		Admin.list_Branches();
		System.out.println();
		Admin.remove(branch3);
		Admin.list_Branches();

		System.out.println();
		

		BranchEmployee employee1 = new BranchEmployee("Istanbul", "murat", "ayar");
		BranchEmployee employee2 = new BranchEmployee("Samsun", "ali", "sancak");
		BranchEmployee employee3 = new BranchEmployee("Aydin", "melih", "atar");

		Admin.add_emp(employee1);
		Admin.add_emp(employee2);
		Admin.add_emp(employee3);

		Admin.display_emp();

		Admin.remove_emp(employee2);

		System.out.println();

		Admin.display_emp();
		
		//-----------------------------------------Customer---------------------------------------------------
		System.out.println();
		
		Customer customer1  = new Customer(01,"Elanur","ATAR","Elanur@gmail","Samsun","1234");
		Customer customer2  = new Customer(02,"Melih","ATAR","Melih@gmail","Samsun","4567");
		Customer customer3  = new Customer(03,"Sevim","ATAR","Sevim@gmail","Samsun","8796");
		
		customer1.Subscribes(customer1);
		customer2.Subscribes(customer2);
		customer3.Subscribes(customer3);
		
		customer1.display_cus();
		customer2.display_cus();
		customer3.display_cus();
		
		System.out.println();
		
		//-----------------------------------------Branch Employee  And Product--------------------------------
		
		BranchEmployee employee_adder = new BranchEmployee("Istanbul", "sinan", "ali");
        Products product1 = new Products("Chair", "Model1", "Blue");
        Products product2 = new Products("Chair", "Model1", "Blue");
        Products product3 = new Products("Chair", "Model1", "Blue");
        System.out.println(product1.toString());
        System.out.print(product2.toString());
        System.out.print(product3.toString());
        System.out.println();
        
        employee_adder.add_product(0,"Chair", "Model1", "Blue");
        employee_adder.add_product(0,"Desk", "Model6", "Yellow");
        employee_adder.add_product(0,"Meeting Table", "Model5", "Red");
        employee_adder.add_product(0,"Book Cases", "Model3");
        employee_adder.add_product(0,"Office Cabinets", "Model2");
        
        employee_adder.display_products();
		
        employee_adder.remove_product(1,0);
        
        
        System.out.println();
		employee_adder.display_products();

	}
}
