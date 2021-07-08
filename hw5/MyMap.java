
import java.util.*;
/**A custom iterator class MapIterator to iterate through the keys in a HashMap data structure
*   @author Muhammet Fikret ATAR
* */
public class MyMap<K, V> extends HashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MapIterator<K, V> iterator() {
		return new MapIterator<K, V>();
	}

	public MapIterator<K, V> iterator(K key) {
		return new MapIterator<K, V>(key);
	}

	@SuppressWarnings("hiding")
	public class MapIterator<K, V> implements Iterator<K> {
		int index1 = 0;//locations in index1
		
		K[] arr;//array for Keys

		/**
		 * default constructor create random number
		 */
		@SuppressWarnings("unchecked")
		public MapIterator() {
			Random rnd = new Random();
			this.arr = (K[]) MyMap.this.keySet().toArray(); // iterate through keys
			
			index1 = rnd.nextInt(arr.length-1);//The iterator starts from random key
		}

		/**
		 * The iterator should start from the given key and still iterate though all
		 *	the keys in the Map
		 */
		@SuppressWarnings("unchecked")
		public MapIterator(K key) {

			this.arr = (K[]) MyMap.this.keySet().toArray(); // iterate through keys

			int i = 0;
			while (i < arr.length) {

				if (key.equals(arr[i])) {
					index1 = i;
					break;
				}

				i++;
			}
		}
		/**
		 * The function returns the next key in the Map. It returns the first key when
		 * there is no not-iterated key in the Map.
		 *
		 * @return arr[0] arr[index1 - 1] to return next key in the Map
		 */

		public K next() {

			if (!hasNext()) {
				index1 = 0;

				return arr[index1++];
			} else {
				index1++;
				return arr[index1 - 1];

			}
		}

		/**
		 * Returns true if the iteration has more elements.
		 * 
		 * @return (index1) < arr.length value if the iteration has more elements
		 */

		public boolean hasNext() {

			return (index1) < arr.length;

		}

		/**
		 * The iterator points to the previous key in the Map. It returns the last key
		 * when the iterator is at the first key.
		 * 
		 * @return arr previous value
		 */
		public K prev() {

			if (index1 == 0) {
				index1 = arr.length - 1;

				return arr[index1];
			} else {
				index1--;
				return arr[index1];
			}
		}

	}

}
