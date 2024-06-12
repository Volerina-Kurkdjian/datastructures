package bst;

public class BSTMain {

    public static void main(String[] args) {
        BinarySearchTree myTree=new BinarySearchTree();

        System.out.println("root= "+myTree.root);

        myTree.insert(47);
        myTree.insert(57);
        myTree.insert(27);
        myTree.insert(67);
        myTree.insert(17);
        myTree.insert(37);
        myTree.insert(77);


        System.out.println(myTree.root.left.value);
        System.out.println(myTree.root.right.value);
        //System.out.println(myTree.root.right.left.value);
        System.out.println(myTree.contains(0));

    }
}
