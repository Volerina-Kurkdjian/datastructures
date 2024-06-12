package tree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] intArray=new int[7];
        intArray[0]=12;
        intArray[1]=25;
        intArray[2]=-15;
        intArray[3]=7;
        intArray[4]=55;
        intArray[5]=1;
        intArray[6]=-22;

//        for(int i=0;i<intArray.length;i++){
//            System.out.println(intArray[i]);
//        }

        //we have a file where the array is stored, or we receive the values from the interface
        //we don't know the indexes of the elements, but we want to retrieve some elements
        //we want to retrieve value number 7, we don't know the index of the value

        int index=0;
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]==7){
                index=i;
                break;
            }
        }
        System.out.println(index);

        BST tree=new BST();
        tree.insert(25);
        tree.insert(20);
        tree.insert(5);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(22);
        tree.insert(32);

        tree.traverseInOrder();

        if( tree.get(27)!=null){
            System.out.println("the tree value exists");
        }

        System.out.println(tree.min());
        System.out.println(tree.max());

    }
}