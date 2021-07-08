
public class Driver {
	
	public static void main(String[] args) throws Exception {
		
		
		NavigableSkipList<Integer> navigableSkipList = new NavigableSkipList<>();
		NavigableAVLTree<Integer> navigableAVLTree = new NavigableAVLTree<>();
		 
		System.out.println("Skip List Insert Remove");
		if(navigableSkipList.add(101)){
	            System.out.println("Successful add");
	        }else{
	            System.out.println("Unsuccessful add");
	        }
	        if(navigableSkipList.add(102)){
	            System.out.println("Successful add");
	        }else{
	            System.out.println("Unsuccessful add");
	        }
	        if(navigableSkipList.add(103)){
	            System.out.println("Successful add");
	        }else{
	            System.out.println("Unsuccessful add");
	        }
	        if(navigableSkipList.remove(101)){
	            System.out.println("Successful remove");
	        }else{
	            System.out.println("Unsuccessful remove");
	        }
	        if(navigableSkipList.remove(102)){
	            System.out.println("Successful remove");
	        }else{
	            System.out.println("Unsuccessful remove");
	        }
	        if(navigableSkipList.remove(103)){
	            System.out.println("Successful remove");
	        }else{
	            System.out.println("Unsuccessful remove");
	        }
	        System.out.println("AVL Tree Insert ");
	        if(navigableAVLTree.add(101)){
	            System.out.println("Successful add");
	        }else{
	            System.out.println("Unsuccessful add");
	        }
	        if(navigableAVLTree.add(102)){
	            System.out.println("Successful add");
	        }else{
	            System.out.println("Unsuccessful add");
	        }
	        if(navigableAVLTree.add(103)){
	            System.out.println("Successful add");
	        }else{
	            System.out.println("Unsuccessful add");
	        }
	      
	        
	        
	        
	        
	        
	        
	        
		
	}
}
