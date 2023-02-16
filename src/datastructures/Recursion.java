package src.datastructures;

public class Recursion {
    //recursion = When a thing is  defined in a terms of itself
    //apply the result of procedure,to a procedure
    //A recursive method that calls itself. Can be a substitution to iteration.
    //Divide a problem into sub-problem of the same type as the original.
    //commonly used  with advanced sorting algorithms and navigating trees.

    //Advantages ->
    //-------------------
    //easier to read/write
    //easier to debug


    //Disadvantages

    //sometimes slower
    //uses more memory

    public static void main(String[] args) {
        walk(5);

    }

    private static void walk(int steps) {
        for(int i=0; i<steps;i++){
            System.out.println("you take a step");
        }
    }
}
