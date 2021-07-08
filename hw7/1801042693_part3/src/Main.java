import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		System.out.println("PART 3:");
		System.out.println("Compare insertion performance of the following data structures;"+"\n");

		Random rand = new Random();
		
		long startTime, stopTime;
		int total = 0;
		long temp = 0;
		
	

		BinarySearchTree<Integer> bst[] = new BinarySearchTree[40];

		for (int k = 0; k < 40; k++) {

			bst[k] = new BinarySearchTree<Integer>();
		}

		RedBlackTree<Integer> rbt[] = new RedBlackTree[40];

		for (int k = 0; k < 40; k++) {

			rbt[k] = new RedBlackTree<Integer>();
		}

		TwoThreeTree<Integer> ttt[] = new TwoThreeTree[40];

		for (int k = 0; k < 40; k++) {

			ttt[k] = new TwoThreeTree<Integer>();
		}

		BTree<Integer> bt[] = new BTree[40];

		for (int k = 0; k < 40; k++) {

			bt[k] = new BTree<Integer>(4);
		}

		SkipList<Integer> sl[] = new SkipList[40];

		for (int k = 0; k < 40; k++) {

			sl[k] = new SkipList<Integer>();
		}

		
		System.out.println("Perform this operation 10 times for 10.000");
		for (int q = 0; q < 10; q++) {
			for (int y = 0; y < 10000; y++) {

				bst[q].add(rand.nextInt());
				rbt[q].add(rand.nextInt());
				ttt[q].add(rand.nextInt());
				bt[q].add(rand.nextInt());
				sl[q].insert(rand.nextInt());

			}

		}

		for (int q = 10; q < 20; q++) {

			for (int y = 0; y < 20000; y++) {

				bst[q].add(rand.nextInt());
				rbt[q].add(rand.nextInt());
				ttt[q].add(rand.nextInt());
				bt[q].add(rand.nextInt());
				sl[q].insert(rand.nextInt());

			}
		}

		for (int q = 20; q < 30; q++) {

			for (int y = 0; y < 40000; y++) {

				bst[q].add(rand.nextInt());
				rbt[q].add(rand.nextInt());
				ttt[q].add(rand.nextInt());
				bt[q].add(rand.nextInt());
				sl[q].insert(rand.nextInt());

			}
		}

		for (int q = 30; q < 40; q++) {

			for (int y = 0; y < 80000; y++) {

				bst[q].add(rand.nextInt());
				rbt[q].add(rand.nextInt());
				ttt[q].add(rand.nextInt());
				bt[q].add(rand.nextInt());
				sl[q].insert(rand.nextInt());

			}
		}
		System.out.print("Binary Search Tree" + "\n");
		for (int q = 0; q < 10; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bst[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Red Black Tree" + "\n");
		for (int q = 0; q < 10; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				rbt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			temp = 0;
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("2-3 tree" + "\n");
		for (int q = 0; q < 10; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				ttt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("B-Tree" + "\n");
		for (int q = 0; q < 10; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Skip list" + "\n");
		for (int q = 0; q < 10; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				sl[q].insert(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
		
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
	
		System.out.println("\n"+"Perform this operation 10 times for 20.000");
		
		System.out.print("Binary Search Tree" + "\n");
		for (int q = 0; q < 10; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bst[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
		
		}
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Red Black Tree" + "\n");
		for (int q = 10; q < 20; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				rbt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("2-3 tree" + "\n");
		for (int q = 10; q < 20; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				ttt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("B-Tree" + "\n");
		for (int q = 10; q < 20; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Skip list" + "\n");
		for (int q = 10; q < 20; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				sl[q].insert(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		
		
		System.out.println("\n"+"Perform this operation 10 times for 40.000");
		
		System.out.print("Binary Search Tree" + "\n");
		for (int q = 20; q < 30; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bst[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
		
		}
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Red Black Tree" + "\n");
		for (int q = 20; q < 30; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				rbt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("2-3 tree" + "\n");
		for (int q = 20; q < 30; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				ttt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("B-Tree" + "\n");
		for (int q = 20; q < 30; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Skip list" + "\n");
		for (int q = 20; q < 30; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				sl[q].insert(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
		
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		
System.out.println("\n"+"Perform this operation 10 times for 80.000");
		
		System.out.print("Binary Search Tree" + "\n");
		for (int q = 30; q < 40; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bst[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Red Black Tree" + "\n");
		for (int q = 30; q < 40; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				rbt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("2-3 tree" + "\n");
		for (int q = 30; q < 40; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				ttt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("B-Tree" + "\n");
		for (int q = 30; q < 40; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				bt[q].add(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
			
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
		System.out.print("Skip list" + "\n");
		for (int q = 30; q < 40; q++) {
			startTime = System.nanoTime();
			for (int y = 0; y < 100; y++) {
				
				sl[q].insert(rand.nextInt());
				

			}
			stopTime = System.nanoTime();
			total += stopTime - startTime;
		
		}
		
		total = total / 10;
		System.out.println("Average->" + "->" + total);

		total = 0;
	}
}