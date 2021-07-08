import java.util.ArrayList;
import java.util.Collections;

public class BSTHeapTree<E extends Comparable> {
    protected Node root;
    //Keep adding element to all heap
    protected ArrayList<Integer> tempNum = new ArrayList<>();
    //Keep occurence index for adding heap element
    protected ArrayList<Integer> tempIndex = new ArrayList<>();


    private int capacity = 7; //maximum capacity
    /**
	 * Node Class
	 * 
	 */
    public static class Node<E extends Comparable<E>>{
        protected Node left,right;
        private MaxHeap<E> data; //data
        private int sizeOfHeap; //size of heap
        private int heightOfHeap; //heap height

        public Node(){
            left = null;
            right = null;
            sizeOfHeap = 0;
            heightOfHeap = 0;
            data = new MaxHeap();

        }

        public Node(Node<E> left,Node<E> right,int heightOfHeap,int sizeOfHeap) {
            this.left = left;
            this.right = right;
            this.heightOfHeap = heightOfHeap;
            this.sizeOfHeap = sizeOfHeap;
        }
    }
    /**
	 * constructor BST HEAPS
	 *  
	 */
    public BSTHeapTree() {
        root = new Node<>();
    }
    /**
	 * add method to  BST HEAPS
	 * @param Item to be add item 
	 * @return res to be add value 
	 */
    public int add(E item) {
        Node iter = root;
        int res = add(iter,item);
        return res;
    }
    /**
   	 * add method to  BST HEAPS
   	 * @param Item to be add item 
   	 * @param iter iter save root infos
   	 * @return item  
   	 */
    private int add(Node iter, E item) {
        //Check heap full or not
        if(iter.sizeOfHeap != capacity) {
            //Check same element or not
            //If same element, same element index increasing
            if(iter.data.find((Integer)item) == 1) {
                int index = tempNum.indexOf(item);
                int temp = tempIndex.get(index);
                temp += 1;
                tempIndex.set(index,temp);

            }
            //If not same element, sizeofheap increase and heap insert item
            else {

                tempNum.add((Integer)item);
                tempIndex.add(1);
                iter.sizeOfHeap += 1;
                iter.data.add(item);
            }
            return (Integer)item;
        }
        //If heap capaticy is full and item is same data
        if(iter.sizeOfHeap == capacity && iter.data.find(item) == 1) {
            int index = tempNum.indexOf(item);
            int temp = tempIndex.get(index);
            temp += 1;
            tempIndex.set(index,temp);
            return (Integer)item;
        }
        //If heap capaticy is full and item is not same data
        if(iter.right != null) {
            if(iter.data.findMax().compareTo(item) < 0)

                return add(iter.right,item);
        }
        else if(iter.left != null) {
            if(iter.data.findMax().compareTo(item) > 0)

                return add(iter.left,item);
        }
        else if(iter.right == null && iter.data.findMax().compareTo(item) < 0) {
                Node r = new Node();
                iter.right = r;
                iter = iter.right;
                iter.data.add(item);
                iter.sizeOfHeap += 1;
                tempNum.add((Integer)item);
                tempIndex.add(1);
                return (Integer)item;

        }
        else if(iter.left == null && iter.data.findMax().compareTo(item) > 0) {
                Node l = new Node();
                iter.left = l;
                iter = iter.left;
                iter.data.add(item);
                iter.sizeOfHeap += 1;
                tempNum.add((Integer)item);
                tempIndex.add(1);
                return (Integer)item;

        }
        return 0;

    }
    /**
   	 * find method to find element in BST HEAP
   	 * @param Item item 
   	 * 
   	 * @return res 
   	 */
    public int find(E item) {

        int index = tempNum.indexOf(item);
        if(index == -1)
            return -1;
        int res = tempIndex.get(index);
        return res;

    }
    /**
   	 * Find max occurence, return value is occurence value
   	 * 
   	 * 
   	 * @return retult  is heap str mode  
   	 */
    
    public int find_node(){
        int res = Collections.max(tempIndex);
        int index = tempIndex.indexOf(res);
        int result = tempNum.get(index);
        return result;
    }
    /**
   	 * Display Method
   	 * 
   	 * 
   	 *  
   	 */
    public void display() {
        for(int i=0;i<tempNum.size();i++) {
            System.out.println("(" + tempNum.get(i) + "," + tempIndex.get(i) + ")");
        }
    }
    
    /**
   	 * Traverse method so it's printing console.
   	 * @param root item root
   	 * 
   	 * 
   	 */
    public void printTraverse(Node root){
       if(root == null){
           System.out.println("Tree is empty");
           return;
       }
       else{
       
           if(root.left != null)
        	   
               printTraverse(root.left);
           root.data.check(tempIndex);
           if(root.right != null){
               printTraverse(root.right);
           }
       }
    }

}
