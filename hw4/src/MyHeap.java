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
class MyHeap<T extends Comparable<T>> {
	private ArrayList<T> heap;

	public MyHeap() {
		heap = new ArrayList<T>();
	}

	/**
	 * Getter for item at index i
	 * 
	 * @param i index of item
	 * @return item at index
	 */
	private T get(int i) {
		return heap.get(i);
	}

	/**
	 * Determines the parent index
	 * 
	 * @param i index of given item
	 * @return the index for parent of item at i
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
	public T getParent(int i) {
		return heap.get(getParentIndex(i));
	}

	public Boolean Search_for_an_element(T ITEM) {

		for (int i = 0; i < heap.size(); i++) {

			if (ITEM == heap.get(i)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * get size
	 * 
	 * 
	 * @return heap.size
	 */
	public int get_size() {

		return heap.size();
	}

	/**
	 * Swaps the two items in heap at indices x and y
	 * 
	 * @param x
	 * @param y
	 */
	private void swap(int x, int y) {
		/* swaps reference */
		T temp = heap.get(x);
		heap.set(x, heap.get(y));
		heap.set(y, temp);
	}

	/**
	 * Merge_with_another_heap
	 * 
	 * @param obj1 this one of heap
	 * @param obj2 this one of heap
	 * @return merge heap struct
	 */
	public MyHeap<T> Merge_with_another_heap(MyHeap<T> obj1, MyHeap<T> obj2) {
		// firstly compare obj and merge according to size
		if (obj1.get_size() > obj2.get_size()) {
			try {
				for (int i = 0; i < obj2.get_size(); i++) {

					obj1.add(obj2.get(i));
				}
				return obj1;
			} catch (Exception e) {
				System.out.println("Something went wrong MERGE.");
			}
			// firstly compare obj and merge according to size
		} else if (obj1.get_size() < obj2.get_size()) {
			try {
				for (int i = 0; i < obj1.get_size(); i++) {

					obj2.add(obj1.get(i));
				}
				return obj2;
			} catch (Exception e) {
				System.out.println("Something went wrong.MERGE");
			}
			// firstly compare obj and merge according to size
		} else {
			try {
				for (int i = 0; i < obj2.get_size(); i++) {

					obj1.add(obj2.get(i));
				}
				return obj1;
			} catch (Exception e) {
				System.out.println("Something went wrong.MERGE");
			}

		}
		return obj1;
	}

	/**
	 * Modify heap. O(log N) time complexity
	 * 
	 * @param i index
	 */

	private void modify_heap(int i) {
		/* while index != root and item is larger than parent */
		while (i > 0 && getParent(i).compareTo(get(i)) < 0) {
			swap(getParentIndex(i), i);
			i = getParentIndex(i);
		}
	}

	/**
	 * get heap size
	 * 
	 * 
	 * @return heap.size()
	 */
	public Integer get_heap_size() {

		return heap.size();
	}

	/**
	 * Find ith_largest_element and remove
	 * 
	 * @param index in heap array list
	 * 
	 */
	public void ith_largest_element_remove(int index) {

		try {
			Collections.sort(heap, Collections.reverseOrder());
			heap.remove(index - 1);
		} catch (Exception e) {
			System.out.println("Something went wrong.ith_largest_element_remove ");
		}

	}

	/**
	 * Remove item at given index worst case delete(1) runs O(log N)
	 * 
	 * @param i index of item to be removed
	 * @return the item removed from heap
	 */
	public T remove(int i) {
		if (i == 0) {
			System.out.println("Enter positive number");

		}

		T item = get(i);
		swap(i, size() - 1); // swaps item to be deleted with last heap item
		modify_heap(size() - 1); // remove from heap

		return item;

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
	 * Insert item to the heap worst case O(log N) when item needs to be bubbled to
	 * the root
	 * 
	 * @param item item to be inserted
	 */
	public void add(T item) {
		heap.add(item);
		modify_heap(size() - 1); // O(log N)
	}

	/**
	 * Print_Heap
	 *
	 */
	public void print_heap() {

		for (int i = 0; i < heap.size(); i++) {
			System.out.println(heap.get(i));
		}
	}

	/**
	 * Search Heap
	 * 
	 * @param node is element
	 * @return true false
	 */
	public boolean search_heap(T node) {
		int flag = 1;
		for (int i = 0; i < heap.size(); i++) {
			if (node == heap.get(i)) {
				flag = 0;
				return true;
			}

		}
		if (flag == 1) {
			return false;
		}
		return false;
	}

}