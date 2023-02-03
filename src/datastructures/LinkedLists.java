package src.datastructures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        //LINKEDLIST =stores nodes in 2 parts (data+address)
        //NODES are in non-consecutive memory location
        //ELEMENTS ARE LINKED using pointers

        //                SINGLY LINKED LIST
        //Node                 NODE                  NODE
        //[data|address] ->    [data|address]->   [data|address]

        //               Doubly LINKED LIST
        //doubly linked list uses more memory but be searched forward and back
        //Node                            NODE
        //[address|data|address] <->    [address|data|address]


        //advantages!
        //1. Dynamic Data structure(allocates needed memory while running)
        //2.Insertion and Deletion of Nodes are easy. O(1)
        //3.no/low memory waste

        //disadvantages
        //1.Greater memory usage(additional pointers)
        //2.no random access of elements(no index[1])
        //3.Accessing/searching element is more time-consuming. O(n)


        //Usages

        //1.implements stacks and queues
        //2.Gps Navigation
        //3. Music playlist



        LinkedList<String>linkedList = new LinkedList<>();



        //Linked LIST AS A STACK
        linkedList.push("a");
        linkedList.push("b");
        linkedList.push("c");
        linkedList.push("d");
        linkedList.push("f");
//        linkedList.pop();
//        System.out.println(linkedList);

//LINKED LIST AS A QUEUE
        linkedList.offer("a");
        linkedList.offer("b");
        linkedList.offer("c");
        linkedList.offer("d");
        linkedList.offer("f");
//        linkedList.poll();
//        System.out.println(linkedList);

        linkedList.add(4,"e");
        System.out.println(linkedList.indexOf("f"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("g");
        String first =linkedList.removeFirst();
        String last= linkedList.removeLast();


        System.out.println(linkedList);
    }
}
