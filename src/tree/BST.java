package tree;

public class BST {

    private TreeNode root;

    public void insert(int value){
        if(root==null){//always insert to the empty spot you find, always the root
            root=new TreeNode(value);
        }
        else{//daca rootul nu e null
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root!=null){
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value){
        if(root !=null){
            return root.get(value);
        }
        return null;
    }

    public int min(){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        else{
            return root.min();
        }
    }

    public int max(){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        else{
           return root.max();
        }
    }

    @Override
    public String toString() {
        return "tree.BST{" +
                "root=" + root +
                '}';
    }

    public void delete(int value){
        root=delete(root,value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
            if(subTreeRoot==null){
                return subTreeRoot;
            }
            if(value< subTreeRoot.getData()){
                subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
            }
            else if(value> subTreeRoot.getData()){
                subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),value));
            }
            else{
                //cases 0 and 1: node to delete has 0 or 1 children
                if(subTreeRoot.getLeftChild()==null){
                    return subTreeRoot.getRightChild();
                }
                else if(subTreeRoot.getRightChild()==null){
                    return subTreeRoot.getLeftChild();
                }
            }
        return subTreeRoot;
    }
}
