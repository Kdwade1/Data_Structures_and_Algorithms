package src.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    //Queue= fifo data structure First -In First- Out(ex. A Line of People)
    //A collection designed for holding elements prior processing
    //linear data structures
    //add =enqueue,offer()
    //remove=dequeue,poll()
    //QUEUES ARE A INTERFACE can't be instantiated . Queues are part of the collection class can use its methods
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<String>();
        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Harold");
        queue.offer("Steven");
//        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.isEmpty());




        ///Where are they useful?
        //1.Keyboard Buffer(Letters appear on the screen in order they are pressed)
        //2.Printer queue(print job should be completed in order)
        //3. Used in linkedList, PriorQueue,Breath-first search.

    }
}
