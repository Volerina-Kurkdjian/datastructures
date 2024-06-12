package linkedList;

public class MainL {

    public static void main(String[] args) {

        LinkedList1 myLinkedList = new LinkedList1(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.appoint(5);
        myLinkedList.appoint(6);

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        LinkedList1.Node n=myLinkedList.deleteLast();
        System.out.println("Last element "+n.value);
        myLinkedList.printList();
        System.out.println("\n--------------");
        System.out.println("first node "+myLinkedList.deleteFirstNode().value);
        myLinkedList.printList();

        System.out.println("Prepend!");
        myLinkedList.prepend(65);
        myLinkedList.printList();



        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */
    }
}
