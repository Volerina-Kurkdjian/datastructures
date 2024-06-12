package linkedList;

public class LinkedList1 {

    private Node head;
    private Node tail;
    private int lenght;

    class Node {
        int value;
        Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList1(int value){
       Node newNode=new Node(value);
       head=newNode;
       tail=newNode;
       lenght=1;

    };

    public LinkedList1(){

    }

    public void getHead() {
        Node node=this.head;
        System.out.println(node.value);
    }

    public void getTail() {

        System.out.println(tail.value);
    }

    public void getLength() {
    }

    public void printList() {
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void appoint(int value){

        Node newNode=new Node(value);

        if(head==null) {
            head=newNode;
            tail=newNode;
            this.lenght++;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        lenght++;
    }

    public Node deleteLast(){
        Node newNode=new Node();
        Node tempNode=head;

        if(head==null){
            return newNode;
        }
        while(head.next!=null){
            tail=tempNode;
            tempNode=tempNode.next;
            newNode.value= tempNode.next.value;
            tempNode.next=null;
            return newNode;
        }
        if(head.next==null){
            newNode.value= head.value;
            head=tail=null;
        }
        return newNode;
    }

    public Node deleteFirstNode(){

        Node newNode=new Node();

        if(head!=null){
            newNode=head;
            newNode.value= head.value;;
            head=head.next;
        }

        return newNode;
    }

    public LinkedList1 prepend(int value){
        Node newNode=new Node(value);
        Node tempNode;

        if(head!=null){
            tempNode=head;
            head=newNode;
            head.next=tempNode;
            LinkedList1 linkedList=new LinkedList1(head.value);
            return linkedList;
        }

        LinkedList1 linkedList=new LinkedList1(value);
        return linkedList;

    }


}
