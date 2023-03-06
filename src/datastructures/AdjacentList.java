package src.datastructures;

public class AdjacentList {
    //Adjacency List=An array/arraylist or linkedlist.
    //Each linkedlist has a unique node at the head.
    //All adjacent neighbors to the node are added to the node's linkedlist

    //runtime complexity to check an Edge O(v)
    //space complexity: O(v+e)

    public static void main(String[] args) {
ListGraph graph = new ListGraph();

graph.addNode(new Nodes('A'));
graph.addNode(new Nodes('B'));
graph.addNode(new Nodes('C'));
graph.addNode(new Nodes('D'));
graph.addNode(new Nodes('E'));


graph.addEdge(0,1);
graph.addEdge(1,2);
graph.addEdge(1,4);
graph.addEdge(2,3);
graph.addEdge(2,4);
graph.addEdge(4,0);
graph.addEdge(4,2);

graph.print();

    }
}
