package bst;

public class BinarySearchTree {

     Node root;

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value=value;
        }

    }

    public boolean insert(int value){
        Node newNode=new Node(value);
        Node temp=root;

        if(root==null){
            root=newNode;
            return true;
        }

        while(true){
          if(newNode.value==temp.value){//inserting an already existing value
              return false;
          }
          if(newNode.value<temp.value){
              if(temp.left==null){
                  temp.left=newNode;
                  return true;
              }
             temp=temp.left;//trecem la urmatorul nod
          }
          if(newNode.value>temp.value){
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
          }
          if(temp==null){
              temp=newNode;
          }
        }
    }
//   if(temp.left==null){
//                    return false;
//                }
    public boolean contains(int value) {

        Node temp = root;
        if (temp == null) {
           return  false;
        }

        while(true) {
            if(temp==null){
                return false;
            }
            if (temp.value>value) {
                temp=temp.left;
                continue;
            }
            if(temp.value<value){
                temp=temp.right;
                continue;
            }
                return true;
        }

    }

    }





