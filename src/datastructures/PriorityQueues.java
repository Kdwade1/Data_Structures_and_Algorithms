package src.datastructures;

//import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    //Priority Queue= A FIFO data structure that serves elements
    //with the highest priority queue first before elements with lower priority
    public static void main(String[] args) {

        Queue<Double>queue=new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.4);
        queue.offer(1.7);
        queue.offer(4.0);
        queue.offer(2.0);
        queue.offer(1.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Queue<String>queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.offer("B");
        queue1.offer("A");
        queue1.offer("C");
        queue1.offer("D");
        queue1.offer("F");

        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
    }




}
