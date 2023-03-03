package src.datastructures;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class Graph {

    ArrayList<Nodes> nodes;

    int[][] matrix;

    public Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Nodes node) {
        nodes.add(node);

    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;

    }

    public Boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }

    }

    public void print() {
        System.out.print("  ");
        for (Nodes nodes1 : nodes) {
            System.out.print(nodes1.data + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
