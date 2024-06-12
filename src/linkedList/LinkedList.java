package linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE REMOVELAST METHOD HERE //
    //                              //
    //

    public Node removeLast(){

        Node temp=head;
        Node pre=head;

        if(length==0){
            return null;
        }

        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }

        tail=pre;
        tail.next=null;
        length--;

        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public Node removeFirst(){
        Node temp=this.head;

        if(length>0){
            if(temp.next!=null){
                this.head=head.next;
                length--;
            }
            temp.next=null;
            return temp;
        }

        else{
          temp=  this.head=this.tail=null;
            return temp;
        }
    }


    public Node get(int index){

        if(index<0 || index>length){
            return null;
        }
        Node temp=head;

        for(int i=0;i<index;i++){
          temp=temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value){
        Node newNode= get(index);

        if(newNode!=null){
            newNode.value=value;
            return true;
        }
        else{
            return false;
        }
    }
    public LinkedList prepend(int value){
        LinkedList.Node newNode=new LinkedList.Node(value);
        LinkedList.Node tempNode;

        if(head!=null){
            tempNode=head;
            head=newNode;
            head.next=tempNode;
            LinkedList linkedList=new LinkedList(head.value);
            return linkedList;
        }

        LinkedList linkedList=new LinkedList(value);
        return linkedList;

    }
    public boolean insert(int index, int value){

        if(index<0 ||index >length){
            return false;
        }

        if(index==0){
            prepend(value);
            return true;
        }

        if(index==length){
            append(value);
            return true;
        }

        Node newNode=new Node(value);
        Node temp= get(0);
        newNode.next=temp.next;
        temp.next=newNode;

        length++;
        return true;

    }


    public Node remove(int index){
        if(index<0 || index>=length){
            return null;
        }

        if(index==0){
            return removeFirst();
        }

        if(index==length-1){
            return removeLast();
        }

        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;

        return temp;
    }





}





    //
    //                              //
    //                              //
    //////////////////////////////////



