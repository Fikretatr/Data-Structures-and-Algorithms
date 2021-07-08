
/*
 * Write method that takes a BinarySearchTree and checks whether the tree is
 * an AVL tree
 * 
 * 
 */
public class BinarySearchTree_AVL {

	public static boolean isBalanced(BST.BinaryNode root) {

		if (root == null) {
			return true;
		}

		if (Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
			return true;
		}
		return false;
	}

	private static int height(BST.BinaryNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}

}
