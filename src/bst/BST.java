package bst;

public class BST {

    private Node root;

    class Node{
        private Node left;
        private Node right;
        private int value;

        Node(int value){
            this.value=value;
        }
    }

   public boolean insert(int value){

        Node node=new Node(value);

        if(root==null){
            root=node;
            return true;
        }

        Node temp=root;

        while(true){
            if(node==temp){return false;}

            if(node.value<temp.value){
                if(temp.left==null){
                    temp.left=node;
                    return true;
                }
                temp=temp.left;

            }
            else {
                if (node.value > temp.value) {
                    if (temp.right == null) {
                        temp.right = node;
                        return true;
                    }
                    temp = temp.right;

                }
            }

        }


    }
}
