package src.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    ArrayList<Nodes> nodes;
    int[][] matrix;

    BFSGraph(int size) {
        nodes = new ArrayList<>();

        matrix = new int[size][size];

    }
    public void addNode (Nodes node){
        nodes.add(node);


    }
    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;


    }
    public boolean checkEdge(int src, int dest){
        if(matrix[src][dest] == 1) {

            return true;

        }

        else {

            return false;

        }


    }
    public void print(){
        System.out.print("  ");

        for(Nodes node : nodes) {

            System.out.print(node.data + " ");

        }

        System.out.println();



        for(int i = 0; i < matrix.length; i++) {

            System.out.print(nodes.get(i).data + " ");

            for(int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println();

    }

    public void breadthFirstSearch(int src) {
        Queue<Integer> queue= new LinkedList<>();
        boolean[]visited= new boolean[matrix.length];
        queue.offer(src);
        visited[src]= true;
        while(queue.size()!= 0){
            src=queue.poll();
            System.out.println(nodes.get(src).data+" = Visited");
            for (int i = 0; i < matrix[src].length; i++) {
                if(matrix[src][i]== 1&& !visited[i]){
                    queue.offer(i);
                    visited[i]=true;

                }

            }


        }

    }
}
