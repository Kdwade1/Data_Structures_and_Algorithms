package src.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrays {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapseTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

//////////////////////                 Linkedlist  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        startTime = System.nanoTime();
//linkedList.get(0);
//linkedList.get(50000);
//        linkedList.get(999999);
//        linkedList.remove(0);
//        linkedList.remove(500000);
        linkedList.remove(999999);
        endTime = System.nanoTime();

        elapseTime = endTime - startTime;

        System.out.println("Linkedlist:\t" + elapseTime + " ns");

        //do Something
//////////////////////                 Arraylist  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        startTime = System.nanoTime();
//        arrayList.get(0);
//        arrayList.get(50000);
//        arrayList.get(999999);
//        arrayList.remove(0);
//        arrayList.remove(500000);
        arrayList.remove(999999);
                endTime = System.nanoTime();

        elapseTime = endTime - startTime;

        System.out.println("Arraylist:\t" + elapseTime + " ns");

        //do Something
    }
}
