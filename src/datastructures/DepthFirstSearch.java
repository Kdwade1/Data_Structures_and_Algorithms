package src.datastructures;

public class DepthFirstSearch {
    public static void main(String[] args) {
//Depth First Search =Pick a route,keep going
        //If you reach a dead end, or already visited node,
        //backtrack to previous node with unvisited adjacent neighbor

        DepthGraph graph = new DepthGraph(5);

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
        graph.addEdge(4,3);

        graph.print();
        graph.depthFirstSearch(4);
    }
}
