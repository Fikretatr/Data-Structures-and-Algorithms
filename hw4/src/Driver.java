import java.util.Random;
import java.util.*;

public class Driver {

	public static void main(String args[]) {
		System.out.println("Hw4 Part 1 Tests:");

		MyHeap<Integer> MyHeap = new MyHeap<Integer>();
		MyHeap<Integer> MyHeap1 = new MyHeap<Integer>();
		MyHeap<String> MyHeap_S = new MyHeap<String>();

		// Insert to heap with elements
		System.out.println("Add Method with integer:");
		MyHeap.add(6);
		MyHeap.add(9);
		MyHeap.add(3);
		MyHeap.add(8);
		MyHeap.add(7);

		MyHeap1.add(11);
		MyHeap1.add(2);
		MyHeap1.add(4);
		MyHeap1.add(24);
		MyHeap1.add(1);
		System.out.println("Heap 1");
		MyHeap.print_heap();
		System.out.println("---");
		System.out.println("Heap 2");
		MyHeap1.print_heap();

		System.out.println("Method remove ith largest element from the Heap:");
		System.out.println("Heap 1 after remove 2th largerst element");
		MyHeap.ith_largest_element_remove(2);
		MyHeap.print_heap();
		System.out.println("\n");

		System.out.println("Add Method with string:");
		System.out.println("Heap 3");
		MyHeap_S.add("Fikret");
		MyHeap_S.add("Elanur");
		MyHeap_S.add("Sevim");
		MyHeap_S.add("Mehmet");
		MyHeap_S.add("Melih");

		MyHeap_S.print_heap();
		System.out.println("\n");
		System.out.println("Heap 3 after remove 3th largerst element");
		MyHeap_S.ith_largest_element_remove(3);
		MyHeap_S.print_heap();
		System.out.println("\n");

		System.out.println("Merge Method:");
		System.out.println("Merge Heap 1 And Heap 2:");
		MyHeap.Merge_with_another_heap(MyHeap, MyHeap1).print_heap();
		System.out.println("\n");
		System.out.println("Search Method:");
		System.out.println(MyHeap_S.search_heap("Elanur"));
		System.out.println(MyHeap_S.search_heap("Ayse"));
		System.out.println(MyHeap.search_heap(3));
		System.out.println(MyHeap.search_heap(12));
		System.out.println("\n");

		/*------------------------------------------------------*/

		System.out.println("Hw4 Part 2 Tests:");
		System.out.println("\n");

		BSTHeapTree<Integer> bst1 = new BSTHeapTree<Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>(100); // use for search number
		int count = 0;
		Random rand = new Random();
		// 3000 numbers in the range 0-5000
		for (int i = 0; i < 3000; i++) {
			int randNumber = rand.nextInt(5000);
			bst1.add(randNumber);
			if (count < 100)
				alist.add(randNumber);
			count++;
		}

		System.out.println(
				"Insert the 3000 numbers that are randomly generated in the range 0-5000 into the BSTHeapTree");
		System.out.println("Display Method:");
		System.out.println("\n");
		bst1.printTraverse(bst1.root);
		System.out.println("\n");
		System.out.println("Find Method:");
		System.out.println(
				"Search for 100 numbers in the array and 10 numbers not in the array and make sure that the number of occurrences is correct");

		// Find
		// Search element number 90 numbers in the range 0-5000
		for (int i = 0; i < alist.size(); i++) {
			if (bst1.find(alist.get(i)) != -1) {
				System.out.println("Find: " + "(" + alist.get(i) + "," + bst1.find(alist.get(i)) + ")");
			} else {
				System.out.println("Not in heap");
			}
		}
		// Find mode value
		System.out.println("\n");
		System.out.println("Find_Mode Method:");
		System.out.println("Max Occurence Value: " + bst1.find_node());

	}

}
