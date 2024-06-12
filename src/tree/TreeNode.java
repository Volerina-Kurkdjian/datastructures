package tree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value){
         if(value==data){//the tree doesn't support duplicate values
             return;
         }

         if(value<data){
             if(leftChild==null){//daca nu are copil in stanga, atunci cream noi copilul in stanga si punem valoarea
                 leftChild=new TreeNode(value);
             }
             else{//altfel are copil in stanga si punem valoarea in el
                 leftChild.insert(value);
             }
         }
         else{
             if(rightChild==null){
                 rightChild=new TreeNode(value);
             }
             else {
                 rightChild.insert(value);
             }
         }
    }

    public void traverseInOrder(){
        if(leftChild !=null){
            leftChild.traverseInOrder();
        }
        System.out.println("Data from left: "+data+", ");

        if(rightChild!=null){
            rightChild.traverseInOrder();
        }
    }

    public TreeNode(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode get(int value){

        if(value==data){
            return this;
        }

        if(value<data){
            if(leftChild!=null){
                return leftChild.get(value);
            }
        }
        else{
            if(rightChild!=null){
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min(){
        if(leftChild==null){
            return data;
        }
        else{
            return leftChild.min();
        }
    }

    public int max(){
        if(rightChild==null){
            return data;
        }
        else{
            return rightChild.max();
        }
    }

    @Override
    public String toString() {
        return "tree.TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
