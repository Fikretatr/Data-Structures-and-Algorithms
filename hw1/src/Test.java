
import java.util.Scanner;

/**
 * @author Muhammet Fikret ATAR 1801042693
 * This Class has all the details of main and driver
 */
public class Test {

	
	public static void main(String[] args) {
		int choice=0;
		Scanner scan = new Scanner(System.in);
		int i=0,j;
		String temp,temp1;
		int branchNumber=4, branchCapacity=4;
		Branches[] branches = new Branches[4] ;
		branches[0]=new Branches("Branch1");
		branches[1]=new Branches("Branch2");
		branches[2]=new Branches("Branch3");
		branches[3]=new Branches("Branch4");
		boolean exit=false,exitMenu,error,exitAdminMenu,exitmainmenu=true;
		Administrators [] admin= new Administrators[1];
		admin[0]= new Administrators("fikret","atar");
		
		
		
		while(exitmainmenu) {
			error = true;
			System.out.println("\n\nWelcome to our Company");
			System.out.println("1-Login as an Administrator");
			System.out.println("2-Login as a Branch Employee");
			System.out.println("3-Login as a Customer");
			System.out.println("4-Exit");
			exitAdminMenu=true;
			System.out.println("Choice:");
			try {
				choice = scan.nextInt();
			}
			catch(Exception e) {
				
				
				System.out.println("Enter integer input!!");
				scan.nextLine();
			}
				
			
			switch(choice) {
			
			case 1:
				while(exitAdminMenu) {
					
					admin[0].administratorMenu();
					System.out.println("Choice:");
					choice = scan.nextInt();
					switch(choice) {
					
					case 1:
					
					
						
						if(branchCapacity == branchNumber) {
							Branches[] tempArray = new Branches[branchCapacity];
							
							for(i=0;i<branchNumber;i++) {
								tempArray[i] = new Branches(branches[i]);
							}
							
							branches = new Branches[branchCapacity*2];
							for(i=0;i<branchNumber;i++) {
								branches[i] = new Branches(tempArray[i]);
							}
							branchCapacity *= 2;
						}
						
						System.out.print("Enter the new branch's name: ");
						
						temp = scan.next();
						branches[branchNumber] = new Branches(temp);
						branchNumber++;
					
						break;
			/*************************************************************************************************************************/			
					case 2:	
						System.out.println("Branches: ");
						for(i=0;i<branchNumber;i++) {
							if(branches[i] != null)
								System.out.println(branches[i].getName());
						}
					
						System.out.print("Enter the name of the branch that you want to remove: ");
						temp = scan.next();
						error = true;
						
						for(i=0;i<branchNumber;i++) {
							if(branches[i].getName().matches(temp)) {
								error = false;
								branches[i] = null;
							}
						}
						if(error)
							System.out.println("Branch is not found!");
						break;
			/*************************************************************************************************************************/			
					case 3:
						
						System.out.print("Enter the Branch: ");
						temp = scan.next();
						error =  true;
						for(i=0;i<branches.length;i++) {
							if(branches[i] != null && branches[i].getName().matches(temp)) {
								System.out.println(branches[i].getName() + "'s employees: ");
								branches[i].printEmployees();
								error = false;
								
								System.out.print("Enter the new branch employee's name: ");
								temp = scan.next();
								System.out.print("Enter the new branch employee's surname: ");
								temp1 = scan.next();
								
								if(branches[i].getEmployeeCapacity() == branches[i].getEmployeeNumber())
									branches[i].increaseEmployeeCapacity();
								
								branches[i].employees[branches[i].getEmployeeNumber()] = new BranchEmployee(temp,temp1);
								branches[i].setEmployeeNumber(branches[i].getEmployeeNumber() + 1);
							}
						}
						break;
			/*************************************************************************************************************************/			
					case 4:
						System.out.print("Enter the branch employee's name: ");
						temp = scan.next();
						System.out.print("Enter the branch employee's surname: ");
						temp1 = scan.next();
						error = true;
						for(i=0;i<branches.length;i++) {
							if(branches[i] != null) {
								for(j=0;j<branches[i].employees.length;j++) {
									if(branches[i].employees[j] != null) {
										if(branches[i].employees[j].getName().matches(temp) && branches[i].employees[j].getSurname().matches(temp1)) {
											error = false;
											branches[i].employees[j] = null;
										}
									}
								}
							}
						}
						if(error)
							System.out.println("Branch Personnel is not found!");
						break;
					
			/*************************************************************************************************************************/	
					case 5:
						System.out.println("Branches: ");
						for(i=0;i<branches.length;i++) {
							
							if(branches[i] != null) {
								System.out.println(i+"->"+branches[i].getName());
							}
						}
						break;
					case 6:
						exitAdminMenu = false;//Exit Case
						break;
					
					default:
						System.out.println("You entered an invalid input!");
						break;
						
						
					}
				}
				
						break;
				
			/*************************************************************************************************************************/		
				case 2:
					boolean exit1=true;
				while(exit1) {
					System.out.println("Branches: ");
					for(i=0;i<branchNumber;i++) {
						
						if(branches[i] != null) {
							System.out.println(i+"->"+branches[i].getName());
						}
					}// Display branches
					
					System.out.println("Choice Branch:");
					
					choice = scan.nextInt();
					Branches temp_branch=branches[choice];
					if(temp_branch==null) {
						
						System.out.println("There is no branches");
						break;
					}
					
					branches[0].employees[0].BranchEmployeeMenu();
					System.out.println("Choice:");
					choice = scan.nextInt();
					switch(choice) {
					
					case 1 :	
						temp_branch.ListProduct();
			/*************************************************************************************************************************/				
						break;
					case 2:
						String Cname,Csurname;
						System.out.println("Customer Name:");
						Cname = scan.next();
						System.out.println("Customer Surname:");
						Csurname = scan.next();
						
						temp_branch.employee_see_c_p_orders(Cname,Csurname);
						
						break;
					case 3:
						temp_branch.add_product();
						break;
						
			/*************************************************************************************************************************/				
					case 4: 
						temp_branch.remove_product();
						break;
					
					case 5:
						exit1=false;
						break;
			/*************************************************************************************************************************/				
					default:
						System.out.println("Invalid choice");
						return; 
					}
					break;
							
				
					}//sub while 
				break;
			/*************************************************************************************************************************/			
					case 3:
						int customer_number=0;
						String Name,Password;
						
						boolean exit4=true;
						while(exit4) {
						System.out.println("1-Login Page");
						System.out.println("2-Registration");
						System.out.println("3-Return to previous menu");
						System.out.println("Choice:");
						choice = scan.nextInt();
						switch(choice) {
						    case 1:
						    	
						    	System.out.println("Branches: ");
								for(i=0;i<branchNumber;i++) {
									
									if(branches[i] != null) {
										System.out.println(i+"->"+branches[i].getName());
									}
								}// Display branches
								
								System.out.println("Choice Branch:");
								
								choice = scan.nextInt();
								Branches temp_branch=branches[choice];
								if(temp_branch==null) {
									
									System.out.println("There is no branches");
									break;
								}
								
								
								
								System.out.println("1-Enter Name\n");
								
						    	Name = scan.next();
						    	
						    	System.out.println("2-Enter Password");
						    	
						    	Password = scan.next();
						    
						    	
							
								
								
								if(	temp_branch.Login_Page(Name,Password)) {
									
									System.out.println("Successful Login*");
									boolean exit5=true;
									while(exit5) {
										Customer.customerMenu();
										System.out.println("Choice:");
										choice = scan.nextInt();
										switch(choice) {
										case 1:
											
											temp_branch.search_product(Name);
												
											break;
											
										case 2:
											temp_branch.ListProduct();
											break;
										case 3:
											temp_branch.previous_orders(Name);
											break;
										case 4:
											exit5=false;
											break;
										}
									}
									
									
									
								}
								else
									System.out.println("Unsuccessful Login");
								break;
								
			/*************************************************************************************************************************/						
							case 2:
								System.out.println("Branches: ");
								for(i=0;i<branchNumber;i++) {
									
									if(branches[i] != null) {
										System.out.println(i+"->"+branches[i].getName());
									}
								}// Display branches
								
								System.out.println("Choice Branch:");
								
								choice = scan.nextInt();
								temp_branch=branches[choice];
								if(temp_branch==null) {
									
									System.out.println("There is no branches");
									return;
								}
								temp_branch.add_customer();
								break;
							case 3:
								exit4=false;
								break;
							
							default:
									System.out.println("Invalid choice");
									return; 	
									
						}
								
						}break;
								case 4:
									exitmainmenu=false;
									System.out.println("Program Terminated");
										break;
									default:
										System.out.println("Invalid choice");
											break; 
				}//main switch
							
			}//main while
				
		}//Main class
		
	}//automation_system 

