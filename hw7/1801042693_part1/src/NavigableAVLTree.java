import java.util.*;

public class NavigableAVLTree<E extends Comparable<E>>  implements NavigableSet {

    AVLTree<E> avlTree;
    AVLTree.Node temp;

    public NavigableAVLTree(){
        avlTree = new AVLTree<>();
    }

    @Override
    public boolean add(Object item) {
        return avlTree.add((E) item);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object target) {
        return false;
    }





    @Override
    public boolean remove(Object target) {
        return false;
    }

   
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    
    public boolean removeAll(Collection c) {
        return false;
    }

    
    public boolean retainAll(Collection c) {
        return false;
    }

    
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object lower(Object o) {
        return null;
    }

    @Override
    public Object floor(Object o) {
        return null;
    }

    @Override
    public Object ceiling(Object o) {
        return null;
    }

    @Override
    public Object higher(Object o) {
        return null;
    }

    @Override
    public Object pollFirst() {
        return null;
    }

    @Override
    public Object pollLast() {
        return null;
    }



  
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

   

   


    private NavigableAVLTree<E> newAVL = null;
    private void preOrderTraverse(AVLTree.Node node){
        if(node == null){
            return;
        }
        preOrderTraverse(node.left);
        newAVL.add((E) node.data);
        preOrderTraverse(node.right);

    }

   
    private void postOrderTraverse(AVLTree.Node node){
        if(node == null){
            return;
        }
        postOrderTraverse(node.right);
        newAVL.add((E) node.data);
        postOrderTraverse(node.left);
    }
 

    @Override
    public Comparator comparator() {
        return null;
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        return null;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        return null;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object last() {
        return null;
    }

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet descendingSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet headSet(Object toElement, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet tailSet(Object fromElement, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(java.util.Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(java.util.Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(java.util.Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(java.util.Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
}
