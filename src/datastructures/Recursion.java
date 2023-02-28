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


    //Call stack- in computer science,a call stack is a stack data structure stores data about the active
    //subroutines of a computer program. This kind of stack is also known as a execution stack,program stack,control stack
    //run-time-stack,machine stack and is shorten to the stack,

    public static void main(String[] args) {
//        walk(5);
        factorial(7);
        System.out.println(factorial(7));
        System.out.println(power(4,8));

    }

    private static int power(int i,int j) {
        if(j<1)return 1;
        return i *power(i,j-1);
    }

    private static int factorial(int x) {
        if(x<1)return 1;
        return x*factorial(x-1);

    }

    private static void walk(int steps) {
       if(steps<1)
           return;
       System.out.println("you take a step");
            walk(steps-1);

    }

}
