package linkedList;

public class Main1 {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());

//        System.out.println(myLinkedList.removeFirst());

        myLinkedList.insert(1,20);
        myLinkedList.printList();

        System.out.println("\n-----------------------------");
        myLinkedList.remove(1);


        myLinkedList.insert(1,2);
        myLinkedList.printList();
        /*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/

    }
}
