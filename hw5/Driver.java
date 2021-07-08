
public class Driver {

	public static void main(String[] args) {

		System.out.println("CSE 222/505 - Spring 2021\r\n" + "Homework 5");
		System.out.println("PART 1->");

		MyMap<String, String> map = new MyMap<String, String>();// Test Map Iterator

		map.put("1", "baltimore");
		map.put("2", "samsun");
		map.put("3", "aydin");
		map.put("4", "trabzon");
		map.put("5", "mugla");
		map.put("6", "izmir");
		map.put("7", "antalya");
		map.put("8", "canakkale");
		System.out.println("Key Set : " + map.keySet());

		// Test Map Iterator(random key get)
		MyMap<String, String>.MapIterator<String, String> iter = map.iterator();
		// Test Map Iterator(start given key)
		MyMap<String, String>.MapIterator<String, String> iter2 = map.iterator("3");
		// Next() Method Test
		System.out.println("Next Method Test");
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		// Prev() Method Test
		System.out.println("Prev Method Test");
		System.out.println(iter.prev());
		System.out.println(iter.prev());
		System.out.println(iter.prev());
		System.out.println(iter.prev());
		System.out.println(iter.prev());
		System.out.println(iter.prev());
		System.out.println(iter.prev());

		System.out.println("MapIterator (K key) Method Test");
		System.out.println(iter2.next());
		System.out.println(iter2.next());
		System.out.println(iter2.next());
		System.out.println(iter2.next());
		System.out.println(iter2.prev());
		System.out.println(iter2.next());
		System.out.println(iter2.next());
		System.out.println(iter2.next());
		System.out.println(iter2.prev());
		System.out.println(iter2.prev());

		System.out.println("PART 2->");

		HashtableChain<Integer, String> table = new HashtableChain<>();

		System.out.println("Use the chaining technique for hashing by using linked lists->");

		long startTime = System.nanoTime();
		table.put(1, "baltimore");
		table.put(2, "samsun");
		table.put(3, "aydin");
		table.put(4, "trabzon");

		System.out.println("Size Hash Table: ");
		System.out.println(table.size());
		System.out.println("Get method for key 2");
		System.out.println(table.get(2));
		System.out.println("Remove 2 from Hash Table: ");

		table.remove(2);

		System.out.println(table.get(2));
		System.out.println("Size of Hash Table: ");
		System.out.println(table.size());

		System.out.println("Put key 5 : istanbul ");
		table.put(5, "istanbul");
		System.out.println(table.get(5));

		System.out.println("Remove all");

		table.remove(1);
		table.remove(4);
		table.remove(3);
		table.remove(5);

		System.out.println("Size hashtable: ");

		System.out.println(table.size());
		long endTime = System.nanoTime();

		System.out.println("Total time: ");
		System.out.println(endTime - startTime); 
		System.out.println("\n");

		HashtableChain<Integer, Integer> table2 = new HashtableChain<>();
		System.out.println("Use the chaining technique for hashing by using linked lists");
		System.out.println("Small Data Size Operations 500 Datas");
		startTime = System.nanoTime();
		System.out.println("Add 500 data to Hashtable");
		for (int i = 0; i < 500; i++) {
			table2.put(i, i);
		}
		System.out.println("size: " + table2.size());

		endTime = System.nanoTime();
		System.out.println("Total time : ");
		System.out.println(endTime - startTime);
		System.out.println("\n");
		System.out.println("\n");
		HashtableChain<Integer, Integer> table3 = new HashtableChain<>();
		System.out.println("Use the chaining technique for hashing by using linked lists");
		System.out.println("Medium Data Size Operations 2500 Datas");
		startTime = System.nanoTime();

		System.out.println("Add 2500 data to Hashtable");
		for (int i = 0; i < 2500; i++) {
			table3.put(i, i);
		}
		System.out.println("size: " + table3.size());

		endTime = System.nanoTime();
		System.out.println("Total time : ");
		System.out.println(endTime - startTime);

		System.out.println("\n");
		System.out.println("\n");

		HashtableChain<Integer, Integer> table4 = new HashtableChain<>();
		System.out.println("Use the chaining technique for hashing by using linked lists");
		System.out.println("Large Data Size 10000 Datas");
		startTime = System.nanoTime();

		System.out.println("Add 10000 data to Hashtable");
		for (int i = 0; i < 10000; i++) {
			table4.put(i, i);
		}
		System.out.println("size: " + table4.size());

		endTime = System.nanoTime();
		System.out.println("Total time: ");
		System.out.println(endTime - startTime);

		System.out.println("\n\n");
		
		//----------------------------------tree set
		
		
		HashtableTreeSet<Integer, String> table_set1 = new HashtableTreeSet<>();

		System.out.println("Use the chaining technique for hashing by using TreeSet->");

		
		table_set1.put(1, "baltimore");
		table_set1.put(2, "samsun");
		table_set1.put(3, "aydin");
		table_set1.put(4, "trabzon");

		System.out.println("Size Hash Table: ");
		System.out.println(table_set1.size());
		System.out.println("Get method for key 2");
		System.out.println(table_set1.get(2));
		System.out.println("Remove 2 from Hash Table: ");

		table_set1.remove(2);

		System.out.println(table_set1.get(2));
		System.out.println("Size of Hash Table: ");
		System.out.println(table_set1.size());

		System.out.println("Put key 5 : istanbul ");
		table_set1.put(5, "istanbul");
		System.out.println(table_set1.get(5));

		System.out.println("Remove all");

		table_set1.remove(1);
		table_set1.remove(4);
		table_set1.remove(3);
		table_set1.remove(5);

		System.out.println("Size hashtable: ");

		System.out.println(table_set1.size());
		

		System.out.println("Total time: ");
		System.out.println(endTime - startTime); 
		System.out.println("\n");
		System.out.println("\n");

		HashtableChain<Integer, Integer> table_set2 = new HashtableChain<>();
		System.out.println("Use the chaining technique for hashing by using TreeSet");
		System.out.println("Small Data Size Operations 500 Datas");
		startTime = System.nanoTime();
		System.out.println("Add 500 data to Hashtable");
		for (int i = 0; i < 500; i++) {
			table_set2.put(i, i);
		}
		System.out.println("size: " + table_set2.size());

		endTime = System.nanoTime();
		System.out.println("Total time : ");
		System.out.println(endTime - startTime);
		
		System.out.println("\n");
		System.out.println("\n");
		
		HashtableChain<Integer, Integer> table_set3 = new HashtableChain<>();
		System.out.println("Use the chaining technique for hashing by using TreeSet");
		System.out.println("Medium Data Size Operations 2500 Datas");
		startTime = System.nanoTime();

		System.out.println("Add 2500 data to Hashtable");
		for (int i = 0; i < 2500; i++) {
			table_set3.put(i, i);
		}
		System.out.println("size: " + table_set3.size());

		endTime = System.nanoTime();
		System.out.println("Total time : ");
		System.out.println(endTime - startTime);

		System.out.println("\n");
		System.out.println("\n");

		HashtableChain<Integer, Integer> table_set4 = new HashtableChain<>();
		System.out.println("Use the chaining technique for hashing by using TreeSet");
		System.out.println("Large Data Size 10000 Datas");
		startTime = System.nanoTime();

		System.out.println("Add 10000 data to Hashtable");
		for (int i = 0; i < 10000; i++) {
			table_set4.put(i, i);
		}
		System.out.println("size: " + table_set4.size());

		endTime = System.nanoTime();
		System.out.println("Total time: ");
		System.out.println(endTime - startTime);

	
		

	}

}
