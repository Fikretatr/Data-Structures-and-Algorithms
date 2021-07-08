

public class Main {
    public static void main(String[] args) {

        BST<Integer> test1 = new BST<>();

        BST<Integer> test2 = new BST<>();// empty
        BST<Integer> test3 = new BST<>();
        // fill bst
        test1.insert(45);
        test1.insert(10);
        test1.insert(7);
        test1.insert(12);
        test1.insert(90);
        test1.insert(50);
        // fill bst
        test3.insert(1);
        test3.insert(2);
        test3.insert(3);
        test3.insert(4);
        test3.insert(5);
        // Check avl
        if (BinarySearchTree_AVL.isBalanced(test1.root)) {
            System.out.println("It is an AVL tree");
        } else {
            System.out.println("It is not an AVL tree");
        }
        if (BinarySearchTree_AVL.isBalanced(test2.root)) {
            System.out.println("It is an AVL tree");
        } else {
            System.out.println("It is not an AVL tree");
        }
        if (BinarySearchTree_AVL.isBalanced(test3.root)) {
            System.out.println("It is an AVL tree");
        } else {
            System.out.println("It is not an AVL tree");
        }

        /////Red Black Tree
        boolean result;
        BinarySeachTree<Integer> bst = new BinarySeachTree<>();
        BinarySeachTree<Integer> bst2 = new BinarySeachTree<>();
        RedBlackTree<Integer> red = new RedBlackTree<>();
        RedBlackTree<Integer> red2 = new RedBlackTree<>();



        bst.add(1);
        bst.add(2);
        bst.add(3);
        bst.add(4);
        bst.add(5);
        red.add(1);
        red.add(2);
        red.add(3);
        red.add(4);
        red.add(5);
        result = bst.isBalanced(bst.root);
        if(red.isRed(result)){
            System.out.println("It is a Red Black tree");
        }
        else{
            System.out.println("It is not a Red Black tree");
        }

        bst2.add(45);
        bst2.add(10);
        bst2.add(7);
        bst2.add(90);
        bst2.add(50);
        red2.add(45);
        red2.add(10);
        red2.add(7);
        red2.add(90);
        red2.add(50);

        result = bst2.isBalanced(bst2.root);
        if(red2.isRed(result)){
            System.out.println("It is a Red Black tree");
        }
        else{
            System.out.println("It is not a Red Black tree");
        }
    }
}
