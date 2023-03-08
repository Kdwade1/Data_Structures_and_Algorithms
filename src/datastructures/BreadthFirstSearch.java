package src.datastructures;

public class BreadthFirstSearch {

    //BFS = A Search algorithm for traversing  a tree or graph data structure. This one is done by level at a time
    //rather than one branch at a time.


    //Breadth First Search =Traverses graphs level by level
    //Utilizes a Queues
    //Better if destination average is close to the start
    //Sibling are visited before the children


    //Depth Firs Search =Traversing a graph branch by branch.
    //Utilizes a Stack
    //Better if Destination average is far from start.
    //Children are visited before Siblings
    //More popular for games/puzzles

    public static void main(String[] args) {

        BFSGraph graph = new BFSGraph(5);

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
        graph.breadthFirstSearch(2);
    }
    }

