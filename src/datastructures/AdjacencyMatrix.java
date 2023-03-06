package src.datastructures;

public class AdjacencyMatrix {

    //Adjacent Matrix=An 2d array to store 1's/0's to represented edges
    //# of rows =# of unique nodes
    //# of columns= # of unique nodes

    // run time complexity to check edges O(1)
    //space complexity O(v^2)
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Nodes('A'));
        graph.addNode(new Nodes('B'));
        graph.addNode(new Nodes('C'));
        graph.addNode(new Nodes('D'));
        graph.addNode(new Nodes('E'));


        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();
        System.out.println(graph.checkEdge(0,1));

        System.out.println(graph.checkEdge(3,2));


    }
}
