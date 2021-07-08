/**
 * This class represents a Generic Binary Tree that implements insert, find, and
 * delete operations.
 *
 * @author	Muhammet Fikret ATAR
 * @date	12.06.2021
 * @param	<T>		Any generic object that implements Comparable
 */
public class BST<T extends Comparable<? super T>>
{
    /**
     * This class represents a single node in our Binary Tree.
     *
     * @author	Muhammet Fikret ATAR
     * @date	12.06.2021
     */
    public class BinaryNode
    {
        // Local variables
        public T element;			// The data in the node
        BinaryNode left;	// Pointer to the left child
        BinaryNode right;	// Pointer to the right child

        /**
         * This constructor initializes a childless binary node.
         *
         * @param	elem	Any generic object that implements Comparable
         * @post	A childless binary node is initialized
         */
        public BinaryNode(T elem)
        {
            element = elem;
            left = null;
            right = null;
        }

        /**
         * This constructor initializes a binary node with children.
         *
         * @param	elem	Any generic object that implements Comparable
         * @param	lt		The left node to which this node points
         * @param	rt		The right node to which this node points
         * @post	A binary node with two children is initialized
         */
        public BinaryNode(T elem, BinaryNode lt, BinaryNode rt)
        {
            element = elem;
            left = lt;
            right = rt;
        }
    }

    // Local variables
    public BinaryNode root;					// Pointer to root node, if present

    /**
     * This constructor initializes an empty BST.  An empty BST contains no
     * nodes.
     *
     * @post	An empty tree is initialized
     */
    public BST()
    {
        root = null;
    }

    /**
     * This method determines if the BST is empty.
     *
     * @return	Returns true if the BST contains no nodes
     */
    public boolean isEmpty()
    {
        return (root == null);
    }

    /**
     * This method attempts to find an element in the BST.
     *
     * @param	elem	The element to find
     * @return	Returns a pointer to the matching data element or null if no
     * 			matching element exists in the BST
     */
    public T find(T elem)
    {
        BinaryNode found = find(root, elem);
        return (found == null) ? null : found.element;
    }

    /**
     * This method attempts to find an element in the BST.
     *
     * @param	start	The node from which to start the search
     * @param	elem	The element to find
     * @return	Returns a pointer to the matching data element or null if no
     * 			matching element exists in the BST
     */
    public BinaryNode find(BinaryNode start, T elem)
    {
        // If the element isn't found, return null
        if (start == null)
        {
            return null;
        }

        // Compare the current node's element to the element we're looking for
        int comparison = start.element.compareTo(elem);

        // If we should look down the left tree
        if (comparison > 0)
        {
            return find(start.left, elem);
        }
        // If we should look down the right tree
        else if (comparison < 0)
        {
            return find(start.right, elem);
        }
        // If we've found it
        else
        {
            return start;
        }
    }

    /**
     * This method inserts an element into the BST, unless it is already stored.
     *
     * @param	elem	The element to insert into the BST
     * @return	Returns true if the insertion is performed and false otherwise
     * @post	The element will be inserted into the BST
     */
    public boolean insert(T elem)
    {
        return insert(root, elem);
    }

    /**
     * This method inserts an element into the BST, unless it is already stored.
     *
     * @param	start	The node from which to start the insertion
     * @param	elem	The element to insert into the BST
     * @return	Returns true if the insertion is performed and false otherwise
     */
    public boolean insert(BinaryNode start, T elem)
    {
        // We've reached the point of insertion
        if (start == null)
        {
            // Insert our element into a new node
            root = new BinaryNode(elem, null, null);
            return true;
        }

        // Compare the current node's element to the element we're looking to
        // delete
        int comparison = start.element.compareTo(elem);

        // If are insertion will happen somewhere down the left tree
        if (comparison > 0)
        {
            // If we've reached the point of insertion
            if (start.left == null)
            {
                // Insert our element into a new node
                start.left = new BinaryNode(elem, null, null);
                return true;
            }

            // Otherwise, keep traversing until we reach the point of insertion
            return insert(start.left, elem);
        }
        // If are insertion will happen somewhere down the right tree
        else if (comparison < 0)
        {
            // If we've reached the point of insertion
            if (start.right == null)
            {
                // Insert our element into a new node
                start.right = new BinaryNode(elem, null, null);
                return true;
            }

            // Otherwise, keep traversing until we reach the point of insertion
            return insert(start.right, elem);
        }
        // If the element is already in the tree
        else
        {
            // Don't insert the element
            return false;
        }
    }



    /**
     * This method prints the BST.
     */
    public void print()
    {
        print(root);
    }

    /**
     * This heper method prints the BST rooted at the given start node.
     *
     * @param start	The node from which to root the printing proceedure.
     */
    public void print(BinaryNode start)
    {
        if (start != null)
        {
            print(start.left);
            System.out.println(start.element);
            print(start.right);
        }
    }
}