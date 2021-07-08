import java.util.ArrayList;
import java.util.Collections;

/**
 * I implement the following features for the Heap structure.
 *
 * i. Search for an element ii. Merge with another heap iii. Removing ith
 * largest element from the Heap iv. Extend the Iterator class by adding a
 * method to set the value (value passed as parameter) of the last element
 * returned by the next methods.
 * 
 * @author Muhammet Fikret ATAR
 */
/* Heap structure */
class MaxHeap<E extends Comparable<E>> {
	protected ArrayList<E> heap;
	protected ArrayList<Integer> tmp = new ArrayList<>();

	public MaxHeap() {
		heap = new ArrayList<E>();
	}

	/**
	 * Swaps the two items in heap at indices x and y
	 * 
	 * @param x
	 * @param y
	 */
	private void swap(int x, int y) {
		/* swaps reference */
		E temp = heap.get(x);
		heap.set(x, heap.get(y));
		heap.set(y, temp);
	}

	/**
	 * Getter for item at index i
	 * 
	 * @param i index of item
	 * @return item at index
	 */
	private E get(int i) {
		return heap.get(i);
	}

	/**
	 * Determines the parent index
	 * 
	 * @param i index of given item
	 * @return i/2 is result rule
	 */
	private int getParentIndex(int i) {
		return i / 2;
	}

	/**
	 * Gets the parent item
	 * 
	 * @param i index of given item
	 * @return the parent for item at i
	 */
	private E getParent(int i) {
		return heap.get(getParentIndex(i));
	}

	/**
	 * Bubble up the current item until it is no longer larger than its parent.
	 * O(log N) operation
	 * 
	 * @param i index of item to be bubbled up
	 */
	private void modify(int i) {
		/* while index != root and item is larger than parent */
		while (i > 0 && getParent(i).compareTo(get(i)) < 0) {
			swap(getParentIndex(i), i);
			i = getParentIndex(i);
		}
	}

	/**
	 * Getter for current heap size
	 * 
	 * @return the size of heap
	 */
	public int size() {
		return heap.size();
	}

	/**
	 * add item to the heap to root
	 * 
	 * 
	 * @param item item to be inserted
	 */
	public void add(E item) {
		heap.add(item); // add to rear of heap
		modify(size() - 1); // O(log N)
	}
	/**
	 * find item 
	 * 
	 * 
	 * @param item item to be search
	 * @return 1
	 */
	public int find(E item) {
		int index = heap.indexOf(item);
		if (index == -1)
			return -1;
		else
			return 1;
	}
	/**
	 * find max item to the heap to root
	 * 
	 * 
	 * @return res find max value
	 */
	public E findMax() {
		E res = heap.get(0);
		return res;
	}
	/**
	 * check item to the heap to root
	 * 
	 * @param tempIndex is array list 
	 * 
	 */
	public void check(ArrayList<Integer> tempIndex) {
		for (int i = 0; i < heap.size(); i++) {
		     System.out.println("(" + heap.get(i) + "," + tempIndex.get(i) + ")");
        }
		System.out.println("-------");

	}
}