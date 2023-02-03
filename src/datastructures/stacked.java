package src.datastructures;

import java.util.Stack;

public class stacked {
    public static void main(String[] args) {

        //stack =LIFO data structure. Last in first out
        //stores objects into a sort of vertical towers
        //push() adds to the top
        //pop() to remove from the top

        Stack<String>stack=new Stack<>();

//        System.out.println(stack.empty());

        stack.push("Naruto");
        stack.push("Chainsaw Man");
        stack.push("Bleach");
        stack.push("One Peace");
        stack.push("Attack on titan");

        System.out.println(stack.empty());
        String myFavAnime=stack.pop();

        System.out.println(stack.peek());
        //allows to see what's on top of the stack
        System.out.println( stack.search("bleach"));
        System.out.println(myFavAnime);

        System.out.println(stack);



    }


}
