package src.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrays {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList =new LinkedList<>();
        ArrayList<Integer>arrayList=new ArrayList<>();

        long startTime;
        long endTime;
        long elapseTime;

        for(int i=0; i<100000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }


    }
}
