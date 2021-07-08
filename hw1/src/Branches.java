


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Muhammet Fikret ATAR 1801042693
 * This Class has all the details of Branches of automation system
 */

public class Branches  {
	

	/**
	 * Create employees array
	 * 
	 * 
	 */
	public BranchEmployee[] employees;
	/**
	 * Create products array
	 *
	 * 
	 */
	
	public Products [] products;
	/**
	 * 
	 * Create temp_products array
	 * 
	 */
	public Products [] temp_products;
	/**
	 * 
	 * Create customer array
	 * 
	 */
	public Customer [] customer;
	/**
	 * 
	 * Create box array
	 * 
	 */
	public Products [] box;
	
	private int Products_count,Customer_count;
	private String name;
	/**
	 * Create admin array
	 * 
	 * 
	 */
	public Administrators [] admin;
	private int employeeCapacity,employeeNumber;
	
	
	/**
	 * Constructor of Branches Class with parameters branchName 
	 * @param branchName branch name 
	 * 
	 */
	public Branches(String branchName) {
		customer= new Customer[100];
		admin =new Administrators [1] ;
		admin[0]= new Administrators("fikret","atar");
		customer[0]= new Customer (1,"fikret","atar","ata-turk","samsun","1919");
		name = branchName;
		employees = new BranchEmployee[2];
		employees[0]=new BranchEmployee("emp1","emps1");
		employees[1]=new BranchEmployee("emp2","emps2");
		employeeCapacity = 2;
		employeeNumber = 0;
		box=new Products[100] ;
		products=  new Products[152] ;
		products[0]=new Chair("chair","model1","red");
		products[1]=new Chair("chair","model1","blue");
		products[2]=new Chair("chair","model1","green");
		products[3]=new Chair("chair","model1","yellow");
		products[4]=new Chair("chair","model1","black");
		products[5]=new Chair("chair","model2","red");
		products[6]=new Chair("chair","model2","blue");
		products[7]=new Chair("chair","model2","green");
		products[8]=new Chair("chair","model2","yellow");
		products[9]=new Chair("chair","model2","black");
		products[10]=new Chair("chair","model3","red");
		products[11]=new Chair("chair","model3","blue");
		products[12]=new Chair("chair","model3","green");
		products[13]=new Chair("chair","model3","yellow");
		products[14]=new Chair("chair","model3","black");
		products[15]=new Chair("chair","model4","red");
		products[16]=new Chair("chair","model4","blue");
		products[17]=new Chair("chair","model4","green");
		products[18]=new Chair("chair","model4","yellow");
		products[19]=new Chair("chair","model4","black");
		products[20]=new Chair("chair","model5","red");
		products[21]=new Chair("chair","model5","blue");
		products[22]=new Chair("chair","model5","green");
		products[23]=new Chair("chair","model5","yellow");
		products[24]=new Chair("chair","model5","black");
		products[25]=new Chair("chair","model6","red");
		products[26]=new Chair("chair","model6","blue");
		products[27]=new Chair("chair","model6","green");
		products[28]=new Chair("chair","model6","yellow");
		products[29]=new Chair("chair","model7","black");
		products[30]=new Chair("chair","model7","red");
		products[31]=new Chair("chair","model7","blue");
		products[32]=new Chair("chair","model7","green");
		products[33]=new Chair("chair","model7","yellow");
		products[34]=new Chair("chair","model7","black");
		products[35]=new Desk("desk","model1","red");
		products[36]=new Desk("desk","model1","green");
		products[37]=new Desk("desk","model1","blue");
		products[38]=new Desk("desk","model1","black");
		products[39]=new Desk("desk","model2","red");
		products[40]=new Desk("desk","model2","green");
		products[41]=new Desk("desk","model2","blue");
		products[42]=new Desk("desk","model2","black");
		products[43]=new Desk("desk","model3","red");
		products[44]=new Desk("desk","model3","green");
		products[45]=new Desk("desk","model3","blue");
		products[46]=new Desk("desk","model3","black");
		products[47]=new Desk("desk","model4","red");
		products[48]=new Desk("desk","model4","green");
		products[49]=new Desk("desk","model4","blue");
		products[50]=new Desk("desk","model4","black");
		products[51]=new Desk("desk","model5","red");
		products[52]=new Desk("desk","model5","green");
		products[53]=new Desk("desk","model5","blue");
		products[54]=new Desk("desk","model5","black");
		products[55]=new Desk("desk","model5","red");
		products[56]=new Desk("desk","model5","green");
		products[57]=new Desk("desk","model5","blue");
		products[58]=new Desk("desk","model5","black");
		products[59]=new Desk("meetingtable","model1","red");
		products[60]=new Desk("meetingtable","model1","green");
		products[61]=new Desk("meetingtable","model1","blue");
		products[62]=new Desk("meetingtable","model1","black");
		products[63]=new Desk("meetingtable","model2","red");
		products[64]=new Desk("meetingtable","model2","green");
		products[65]=new Desk("meetingtable","model2","blue");
		products[66]=new Desk("meetingtable","model2","black");
		products[67]=new Desk("meetingtable","model3","red");
		products[68]=new Desk("meetingtable","model3","green");
		products[69]=new Desk("meetingtable","model3","blue");
		products[70]=new Desk("meetingtable","model3","black");
		products[71]=new Desk("meetingtable","model4","red");
		products[72]=new Desk("meetingtable","model4","green");
		products[73]=new Desk("meetingtable","model4","blue");
		products[74]=new Desk("meetingtable","model4","black");
		products[75]=new Desk("meetingtable","model5","red");
		products[76]=new Desk("meetingtable","model5","green");
		products[77]=new Desk("meetingtable","model5","blue");
		products[78]=new Desk("meetingtable","model5","black");
		products[79]=new Desk("meetingtable","model6","red");
		products[80]=new Desk("meetingtable","model6","green");
		products[81]=new Desk("meetingtable","model6","blue");
		products[82]=new Desk("meetingtable","model6","black");
		products[83]=new Desk("meetingtable","model7","red");
		products[84]=new Desk("meetingtable","model7","green");
		products[85]=new Desk("meetingtable","model7","blue");
		products[86]=new Desk("meetingtable","model7","black");
		products[87]=new Desk("meetingtable","model8","red");
		products[88]=new Desk("meetingtable","model8","green");
		products[89]=new Desk("meetingtable","model8","blue");
		products[90]=new Desk("meetingtable","model8","black");
		products[91]=new Desk("meetingtable","model9","red");
		products[92]=new Desk("meetingtable","model9","green");
		products[93]=new Desk("meetingtable","model9","blue");
		products[94]=new Desk("meetingtable","model9","black");
		products[95]=new Desk("meetingtable","model10","red");
		products[96]=new Desk("meetingtable","model10","green");
		products[97]=new Desk("meetingtable","model10","blue");
		products[98]=new Desk("meetingtable","model10","black");
		products[99]=new Bookcases("bookcases","model1");
		products[100]=new Bookcases("bookcases","model2");
		products[101]=new Bookcases("bookcases","model3");
		products[102]=new Bookcases("bookcases","model4");
		products[103]=new Bookcases("bookcases","model5");
		products[104]=new Bookcases("bookcases","model6");
		products[105]=new Bookcases("bookcases","model7");
		products[106]=new Bookcases("bookcases","model8");
		products[107]=new Bookcases("bookcases","model9");
		products[108]=new Bookcases("bookcases","model10");
		products[109]=new Bookcases("bookcases","model11");
		products[110]=new Bookcases("bookcases","model12");
		products[111]=new OfficeCabinets("officecabinets","model1");
		products[112]=new OfficeCabinets("officecabinets","model2");
		products[113]=new OfficeCabinets("officecabinets","model3");
		products[114]=new OfficeCabinets("officecabinets","model4");
		products[115]=new OfficeCabinets("officecabinets","model5");
		products[116]=new OfficeCabinets("officecabinets","model6");
		products[117]=new OfficeCabinets("officecabinets","model7");
		products[118]=new OfficeCabinets("officecabinets","model8");
		products[119]=new OfficeCabinets("officecabinets","model9");
		products[120]=new OfficeCabinets("officecabinets","mode110");
		products[121]=new OfficeCabinets("officecabinets","model11");
		products[122]=new OfficeCabinets("officecabinets","model12");
		
		Products_count=123;
		Customer_count=1;
	}
	
	
	@Override
	public String toString() {
		return "Branches [employees=" + Arrays.toString(employees) + "]";
	}
	/**
	 * List product method lists products  
	 * 
	 * 
	 */
	public void  ListProduct() {
		int i;
		
		if(Products_count==0) {
			System.out.println("\n-There is no product!!");
			return;
			
		}
		
			for(i=0;i<Products_count;i++) {
				if(products[i].getColor_name()!=null) {
					
					System.out.println(i+"->"+products[i].toString());
		
				}	
				
					else if(products[i].getColor_name()==null) {
								
					System.out.println(i+"->"+products[i].to1String());
					}
			}
		}
		
	/**
	 * Add product method adds products to system.
	 * 
	 * 
	 */
	public void add_product() {
		Scanner scan = new Scanner(System.in);
		int i,choice;
		String types[]= new String [] { "chair","desk","meetingtable","bookcases","officecabinets"  };
		String colors [][]= new String [][] {{"red","yellow","blue","brown","orange","green","black"},{"red","yellow","blue","brown"},{"red","yellow","blue","brown"}};
		String models [][]= new String [][] {{"model1","model2","model3","model3","model4","model5","model6","model7"},{"model1","model2","model3","model3","model4","model5"}
											,{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10"},
											{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10","model11","model12"},
											{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10","model11","model12"}};
		for(i=0;i<types.length;i++) {
			
			System.out.println(i+"->"+types[i]);
			
		}
		System.out.println("Choice Type:");
		choice = scan.nextInt();
		String Type;
		switch(choice) {
		
		case 0: Type= types[0];
				break;
				
		case 1: Type= types[1];
		break;
		case 2: Type= types[2];
		break;
		case 3: Type= types[3];
		break;
		case 4: Type= types[4];
		break;
		default : System.out.println("Type is not faund");
					return;
		}
		int Type_index=choice;
	
		String Color= "-";
		if(Type_index==0||Type_index==1||Type_index==2) {
			
			
			for(i=0;i<colors[Type_index].length;i++) {
				
				System.out.println(i+"->"+colors[Type_index][i]);
				
			}
			
			System.out.println("Color Type:");
			
			choice = scan.nextInt();
			
			
			switch(choice) {
			
			case 0: Color= colors[Type_index][choice];
					break;
					
			case 1: Color= colors[Type_index][choice];
			break;
			case 2: Color= colors[Type_index][choice];
			break;
			case 3: Color= colors[Type_index][choice];
			break;
			case 4: Color= colors[Type_index][choice];
			break;
			default : System.out.println("Color is not faund");
						return;
			}
			
			
			
		}
		
		for(i=0;i<models[Type_index].length;i++) {
			
			System.out.println(i+"->"+models[Type_index][i]);
			
		}
		
		
		System.out.println("Model Type:");
		
		choice = scan.nextInt();
		String Model;
		
		switch(choice) {
		
		case 0: Model= models[Type_index][choice];
				break;
				
		case 1: Model= models[Type_index][choice];
				break;
		case 2: Model= models[Type_index][choice];
				break;
		case 3: Model= models[Type_index][choice];
				break;
		case 4: Model= models[Type_index][choice];
				break;
		default : System.out.println("Color is not faund");
				return;
		}
		
		
	
		
		products[Products_count++]=new Products(Type,Model,Color);
		
		
		
	}
	
	/**
	 * Remove product method removes products from system.
	 * 
	 * 
	 */
	public void remove_product() {
		
		Scanner scan = new Scanner(System.in);
		int i,choice;
		String types[]= new String [] { "chair","desk","meetingtable","bookcases","officecabinets"  };
		String colors [][]= new String [][] {{"red","yellow","blue","brown","orange","green","black"},{"red","yellow","blue","brown"},{"red","yellow","blue","brown"}};
		String models [][]= new String [][] {{"model1","model2","model3","model3","model4","model5","model6","model7"},{"model1","model2","model3","model3","model4","model5"}
											,{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10"},
											{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10","model11","model12"},
											{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10","model11","model12"}};
		for(i=0;i<types.length;i++) {
			
			System.out.println(i+"->"+types[i]);
			
		}
		System.out.println("Choice Type:");
		choice = scan.nextInt();
		String Type;
		switch(choice) {
		
		case 0: Type= types[0];
				break;
				
		case 1: Type= types[1];
		break;
		case 2: Type= types[2];
		break;
		case 3: Type= types[3];
		break;
		case 4: Type= types[4];
		break;
		default : System.out.println("Type is not faund");
					return;
		}
		int Type_index=choice;
	
		String Color= "-";
		if(Type_index==0||Type_index==1||Type_index==2) {
			
			
			for(i=0;i<colors[Type_index].length;i++) {
				
				System.out.println(i+"->"+colors[Type_index][i]);
				
			}
			
			System.out.println("Color Type:");
			
			choice = scan.nextInt();
			
			
			switch(choice) {
			
			case 0: Color= colors[Type_index][choice];
					break;
					
			case 1: Color= colors[Type_index][choice];
			break;
			case 2: Color= colors[Type_index][choice];
			break;
			case 3: Color= colors[Type_index][choice];
			break;
			case 4: Color= colors[Type_index][choice];
			break;
			default : System.out.println("Color is not faund");
						return;
			}
			
			
			
		}
		
		for(i=0;i<models[Type_index].length;i++) {
			
			System.out.println(i+"->"+models[Type_index][i]);
			
		}
		
		
		System.out.println("Model Type:");
		
		choice = scan.nextInt();
		String Model;
		
		switch(choice) {
		
		case 0: Model= models[Type_index][choice];
				break;
				
		case 1: Model= models[Type_index][choice];
				break;
		case 2: Model= models[Type_index][choice];
				break;
		case 3: Model= models[Type_index][choice];
				break;
		case 4: Model= models[Type_index][choice];
				break;
		default : System.out.println("Color is not faund");
				return;
		}
		
			
			
			for(i=0;i<this.Products_count-1;i++) {
				
				if(Type_index==0||Type_index==1||Type_index==2) {
					
					if(products[i].check(new Products(Type,Model,Color))) {
						
								for(int k=i;k<Products_count;k++) {
							
										
									products[k]=products[k+1];
							
								}
								Products_count--;
					}
					
					
					
				}
				else if((products[i].getProduct_Type()==Type)&&(products[i].getModel_name()==Model))  {
					
					for(int k=i;k<Products_count;k++) {
						
						
						products[k]=products[k+1];
						
					}
					Products_count--;
					
					
				}
					
			}
			
		}
	
	/**
	 * Search product method searches products in system.
	 * @param nname name for customer's box matching.
	 * 
	 */
	public void search_product(String nname) {
		Scanner scan = new Scanner(System.in);
		int i,choice;
		String types[]= new String [] { "chair","desk","meetingtable","bookcases","officecabinets"  };
		String colors [][]= new String [][] {{"red","yellow","blue","brown","orange","green","black"},{"red","yellow","blue","brown"},{"red","yellow","blue","brown"}};
		String models [][]= new String [][] {{"model1","model2","model3","model3","model4","model5","model6","model7"},{"model1","model2","model3","model3","model4","model5"}
											,{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10"},
											{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10","model11","model12"},
											{"model1","model2","model3","model3","model4","model5","model6","model7","model8","model9","model10","model11","model12"}};
		for(i=0;i<types.length;i++) {
			
			System.out.println(i+"->"+types[i]);
			
		}
		System.out.println("Choice Type:");
		choice = scan.nextInt();
		String Type;
		switch(choice) {
		
		case 0: Type= types[0];
				break;
				
		case 1: Type= types[1];
		break;
		case 2: Type= types[2];
		break;
		case 3: Type= types[3];
		break;
		case 4: Type= types[4];
		break;
		default : System.out.println("Type is not faund");
					return;
		}
		int Type_index=choice;
	
		String Color= "-";
		if(Type_index==0||Type_index==1||Type_index==2) {
			
			
			for(i=0;i<colors[Type_index].length;i++) {
				
				System.out.println(i+"->"+colors[Type_index][i]);
				
			}
			
			System.out.println("Color Type:");
			
			choice = scan.nextInt();
			
			
			switch(choice) {
			
			case 0: Color= colors[Type_index][choice];
					break;
					
			case 1: Color= colors[Type_index][choice];
			break;
			case 2: Color= colors[Type_index][choice];
			break;
			case 3: Color= colors[Type_index][choice];
			break;
			case 4: Color= colors[Type_index][choice];
			break;
			default : System.out.println("Color is not faund");
						return;
			}
			
		}
		
		for(i=0;i<models[Type_index].length;i++) {
			
			System.out.println(i+"->"+models[Type_index][i]);
			
		}
		
		
		System.out.println("Model Type:");
		
		choice = scan.nextInt();
		String Model;
		
		switch(choice) {
		
		case 0: Model= models[Type_index][choice];
				break;
				
		case 1: Model= models[Type_index][choice];
				break;
		case 2: Model= models[Type_index][choice];
				break;
		case 3: Model= models[Type_index][choice];
				break;
		case 4: Model= models[Type_index][choice];
				break;
		default : System.out.println("Model is not faund");
				return;
		}
		
		int temp_number=0;
		String answer;
		for(i=0;i<this.Products_count-1;i++) {
			
			if(Type_index==0||Type_index==1||Type_index==2) {
				
				if(products[i].check(new Products(Type,Model,Color))) {
					
					System.out.println("Product is faund!!");
					System.out.println("Would you like to buy it?");
					System.out.println("Enter Y / N");
					answer=scan.next();
					switch(answer) {
					
					case "Y":
						for(int k=0;k<Customer_count;k++) {
							
						if((customer[k].getName()).equals(nname))	{
							
							temp_number=k;
							
						}
							 
						}
						for(i=0;i<this.Products_count-1;i++) {
							
							if(Type_index==0||Type_index==1||Type_index==2) {
								
								if(products[i].check(new Products(Type,Model,Color))) {
									
											for(int k=i;k<Products_count-1;k++) {
										
													
												products[k]=products[k+1];
										
											}
											Products_count--;
								}
								
								
								
							}
							else if((products[i].getProduct_Type()==Type)&&(products[i].getModel_name()==Model))  {
								
								for(int k=i;k<Products_count;k++) {
									
									
									products[k]=products[k+1];
									
								}
								Products_count--;
								
								
							}
								
						}
						box[temp_number]=new Products(Type,Model,Color) ;
						
						break;
					case "N":	
						break;
					
					}
				}
				
			}
				else if((products[i].getProduct_Type()==Type)&&(products[i].getModel_name()==Model)) {
					
					
					System.out.println("Product is faund!!");
					System.out.println("Would you like to buy it?");
					System.out.println("Enter Y / N");
					answer=scan.next();
					switch(answer) {
					
					case "Y":
						for(int k=0;k<Customer_count;k++) {
							
						if((customer[k].getName()).equals(nname))	{
							
							temp_number=k;
							
						}
							 
						}
						box[temp_number]=new Products(Type,Model) ;
						for(i=0;i<this.Products_count-1;i++) {
							
							if(Type_index==0||Type_index==1||Type_index==2) {
								
								if(products[i].check(new Products(Type,Model,Color))) {
									
											for(int k=i;k<Products_count;k++) {
										
													
												products[k]=products[k+1];
										
											}
											
								}
								Products_count--;
								
								
							}
							
							
							else if((products[i].getProduct_Type()==Type)&&(products[i].getModel_name()==Model))  {
								
								for(int k=0;k<Products_count-1;k++) {
									
									
									products[i]=products[i+1];
									
								}
								
								Products_count--;
								
							}
							
						}
						break;
					case "N":	
						break;
					default:
						System.out.println("Invalid Choice");
						break;
					}
				}
			}
		}
			
	
	/**
	 * Previous orders method shows products customer's products that purchased.
	 * @param Pname name  for customer's box matching.
	 * 
	 */
	public void previous_orders(String Pname){
		int	temp_number1=0;
		
		if(box[0]==null){
			
			System.out.println("There is no previous_orders");
			return;
			
		}
		
		for(int k=0;k<Customer_count;k++) {
			
			if((customer[k].getName()).equals(Pname))	{
				
				temp_number1=k;
				
			}
				 
		}
		System.out.println("Previous_orders");
		System.out.println(box[temp_number1].getProduct_Type()+"   -   "+box[temp_number1].getModel_name()+"   -   "+box[temp_number1].getColor_name());
		
			
				 
		}
	/**
	 * Employee_see_c_p_orders method shows products customer's products that purchased.
	 * @param name for customer's box matching.
	 *  @param surname for customer's box matching.
	 *  
	 */
	public void employee_see_c_p_orders(String name ,String surname) {
		if(box[0]==null){
			
			System.out.println("There is no previous_orders");
			return;
			
		}
		int	temp_number1=0;
		for(int k=0;k<Customer_count;k++) {
			
			if(((customer[k].getName()).equals(name))&&((customer[k].getSurname()).equals(surname)))	{
				
				temp_number1=k;
				
			}
				 
		}
		
		System.out.println(name+surname+"'s"+" "+"previous_orders:");
		System.out.println(box[temp_number1].getProduct_Type()+"   -   "+box[temp_number1].getModel_name()+"   -   "+box[temp_number1].getColor_name());
		
		
	}
		
		
	
	/**
	 * Login_Page method provides customers log to system
	 * @param Name for customer's verify.
	 *  @param Password for customer's verify.
	 *  @return boolean
	 */
	public boolean Login_Page(String Name,String Password){
		
		String tempname,temppassword;
		
		
		for(int i=0;i<this.Customer_count;i++) {
			
			
				tempname=customer[i].getName();
				temppassword=customer[i].getPassword();
				if(Name.equals(tempname)&&temppassword.equals(Password)) {
					
					return true;
				}
								
			
		}
		
		return false;
		
	}
	/**
	 * Add_customer method provides adding customer to system
	 * 
	 *  
	 *  
	 */
	public void add_customer() {
			
			int ID;
			String cname,csurname,ce_mail,cadress,cpassword;
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("*Registration Page*");
			System.out.println("*Enter ID: *");
			ID = scan.nextInt();
			scan.nextLine();
			System.out.println("*Enter name: *");
			cname= scan.nextLine();
			
			System.out.println("*Enter surname: *");
			csurname= scan.nextLine();
			
			System.out.println("*Enter e-mail: *");
			ce_mail= scan.nextLine();
			
			System.out.println("*Enter adress: *");
			cadress= scan.nextLine();
			
			System.out.println("*Enter password: *");
			cpassword= scan.nextLine();
			
			customer[Customer_count++]=new Customer(ID, cname, csurname,  ce_mail,  cadress,  cpassword);
			//for(int i=0;i<Customer_count;i++) {
				//System.out.println(i+"->"+customer[i].toString());
			
			//}
			
		}
	/**
	 * Copy constructor
	 * 
	 * @param Branch1 Branch1 object
	 */
	public Branches(Branches Branch1) {
		name = Branch1.name;
		employeeCapacity = Branch1.employeeCapacity;
		employeeNumber = Branch1.employeeNumber;
		
		employees = new BranchEmployee[Branch1.employeeCapacity];
		
		
		for(int i=0;i<employeeNumber;i++) {
			if(Branch1.employees[i] != null)
				employees[i] = new BranchEmployee(Branch1.employees[i].getName(),Branch1.employees[i].getSurname());
		}
		
	}
	
	/**
	 * Setter for branch name
	 * @param branchName  Branch name 's name
	 */
	public void setName(String branchName){
		name = branchName;
	}
	
	/**
	 * Getter of the branch name
	 * @return name 
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * setEmployeeCapacity method for maximum capacity of employees array
	 * @param capa capacity of employees array
	 */
	
	public void setEmployeeCapacity(int capa){
		employeeCapacity = capa;
	}
	/**
	 * GetEmployeeCapacity of the employees array
	 * @return maximum capacity of employees array
	 */
	public int getEmployeeCapacity() {
		return employeeCapacity;
	}
	
	
	
	/**
	 * Setter for current employee number in the employees array
	 * @param e_N employee number
	 */
	public void setEmployeeNumber(int e_N){
		employeeNumber = e_N;
	}
	/**
	 * Getter of current employee number in the employees array
	 * @return current employee number
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	
	
	/**
	 * Prints the branch employees .
	 */
	public void printEmployees() {
		for(int i=0;i<employeeNumber;i++) {
			if(employees[i] != null)
				System.out.println(employees[i].getName() + " " + employees[i].getSurname());
		}
	}
	
	/**
	 * IncreaseEmployeeCapacity method increase the capacity
	 */
	public void increaseEmployeeCapacity(){
		BranchEmployee[] temp = new BranchEmployee[employeeCapacity];
		
		
		for(int i=0;i<employeeNumber;i++)
			if(employees[i] != null)
				temp[i] = new BranchEmployee(employees[i].getName(),employees[i].getSurname());
		
		
		employees = new BranchEmployee[employeeCapacity*2];
		for(int i=0;i<employeeNumber;i++) {
			if(temp[i] != null)
				employees[i] = new BranchEmployee(temp[i].getName(),temp[i].getSurname());
		}
		employeeCapacity *= 2;
	}
	
}
