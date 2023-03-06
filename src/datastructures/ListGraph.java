package src.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListGraph {

    ArrayList<LinkedList<Nodes>>aList;

    ListGraph(){
        aList= new ArrayList<>();
    }

    public void addNode(Nodes node){
        LinkedList<Nodes>currentList= new LinkedList<>();
        currentList.add(node);
        aList.add(currentList);



    }
    public void addEdge(int src, int dest){
//        LinkedList<Nodes>currentList=aList.get(src);
//        Nodes destNode=aList.get(dest).get(0);
//        currentList.add(destNode);

        Nodes destNode=aList.get(dest).get(0);
        aList.get(src).add(destNode);//<--- shorten way to do things


    }
    public boolean checkEdge(int src, int dest){
        LinkedList<Nodes>currentList=aList.get(src);
        Nodes destNode=aList.get(dest).get(0);

        for(Nodes node: currentList){
            if(node ==destNode){
                return true;
            }
        }
        return false;

    }
    public void print(){
for(LinkedList<Nodes> currentList: aList){
    for(Nodes node:currentList){
        System.out.print(node.data+" -> ");
    }
    System.out.println();
}
    }
}
