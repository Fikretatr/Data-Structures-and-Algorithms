import java.util.Arrays;
import java.util.Random;

public class SkipList<E extends Comparable<E>> {
	/** Static class to contain the data and the links */    
	static class SLNode<E> {       
		SLNode<E>[] links;          
		E data;
		
		@SuppressWarnings("unchecked")
		/** Create a node of level m */
		SLNode (int m, E data) {
			links = (SLNode<E>[]) new SLNode[m];  // create links
			this.data = data;                     // store item
		}
	}
	
	//Data fields
	private int maxLevel;
	private int maxCap;
	private int size;
	SLNode<E> head;
	
	public SkipList() {
		maxLevel = 1;
		maxCap = computeMaxCap(maxLevel);
		head = new SLNode<E>(maxLevel,null);
		size = 0;
	}
	
	public void insert(E data) {
		SLNode<E>[] pred = search(data);
		SLNode<E> newNode = new SLNode<E>(logRandom(),data);

		for(int i=0;i<newNode.links.length;i++) {
			newNode.links[i] = pred[i].links[i]; 
			pred[i].links[i] = newNode;
		}
		size++;
		
		if (maxCap < size) {
			maxLevel++;
			maxCap = computeMaxCap(maxLevel);
			head.links = Arrays.copyOf(head.links, maxLevel);    
			pred = Arrays.copyOf(pred, maxLevel);    
			pred[maxLevel - 1] = head; 
		}
	}
	
	public void delete(E data) {
		//Gets predecessors of data
		SLNode<E>[] pred = search(data);
		
		int step = pred[0].links[0].links.length;
		for(int i=0;i<step;i++) {
			if(pred[i].links[i].links[i] == null)
				pred[i].links[i] = null;
			else
				pred[i].links[i] = pred[i].links[i].links[i];
		}
	}
	
	private int computeMaxCap(int maxLevel) {
		int temp = 1;
		for(int i=0;i<maxLevel;i++) {
			temp *= 2;
		}
		temp--;
		return temp;
	}
	
	@SuppressWarnings("unchecked") 
	/** Search for an item in the list    
	 * @param item The item being sought    
	 * @return A SLNode array which references the predecessors            
	 * of the target at each level. 
	 */ 
	private SLNode<E>[] search (E target) {
		SLNode<E>[] pred = (SLNode<E>[]) new SLNode[maxLevel];    
		SLNode<E> current = head;
		
		for (int i = current.links.length-1; i >= 0; i--) {
			while (current.links[i] != null && current.links[i].data.compareTo(target) < 0)
				current = current.links[i];       
			pred[i] = current;    
		}
		return pred;
	}

	/** Find an object in the skipâ€�list    
	 * @param target The item being sought    
	 * @return A reference to the object in the skipâ€�list that matches            
	 * the target. If not found, null is returned. 
	*/ 
	public E find(E target) {
		SLNode<E>[] pred = search(target);
		if (pred[0].links[0] != null && pred[0].links[0].data.compareTo(target) == 0) {
			return pred[0].links[0].data;
		} 
		else {
			return null;
		} 
	}

	/** Natural Log of 2 */ 
	static final double LOG2 = Math.log(2.0);
	
	/** Method to generate a logarithmic distributed integer between    
	 * 1 and maxLevel.  i.e., 1/2 of the values returned are 1, 1/4    
	 * are 2, 1/8 are 3, etc.    
	 * @return a random logarithmic distributed int between 1 and maxLevel */ 
	private int logRandom() {
		Random rand = new Random();
		int r = rand.nextInt(maxCap);    
		int k = (int) (Math.log(r + 1) / LOG2);    
		if (k > maxLevel - 1)      
			k = maxLevel - 1;      
		return maxLevel - k; 
	}

	public void print() {
		SLNode<E> current;

		for(int i=0;i<maxLevel;i++) {
			current = head.links[i];
			System.out.print("Level "+i+": ");
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.links[i];
			}
			System.out.println();
		}
	}
}
