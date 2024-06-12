package ilist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Operations {

    public static void main(String[] args) {

        List<String> bags  =new ArrayList<String>();
        List<String> boxes  =new ArrayList<String>();
        bags.add("300");


        boxes.add("300");
        boxes.add("100");
        boxes.add("200");
        boxes.add("10000");

        List<String> copy = new ArrayList<>(boxes);


        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
        System.out.println("Copy of : "+copy);

        boxes.removeAll(bags);

        System.out.println("\nAfter Applying retainAll()"+
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);





        Iterator<String> bagIterator= bags.iterator();
        Iterator<String> boxIterator= boxes.iterator();


        while(boxIterator.hasNext()){
            Object ticket = boxIterator.next();

//            if(ticket.){
//
//            }
        }

    }



}
