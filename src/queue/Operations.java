package queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Operations {

    public static void main(String[] args) {

        String nums[]={"one","two","three","four"};
        Queue<String> queue=new LinkedList<>();
        Collections.addAll(queue,nums);
        queue.add("five");
        queue.add("six");
        String arr[]=queue.toArray(new String[queue.size()]);
        


    }
}





















