package src.datastructures;

public class BigONotation {

    //Describes how the code slows as the data grows

    //Describes the performance of an algorithm as the amount of data increases

    //Machine independent(#Number of step to completion

    //ignore smaller operations O(n+1)->O(n)

    //(n) is the amount of data aka variables

    ///***********Example*****************\\

    //this function has a O(n) Linear time
    int addUp(int n){
        int sum =0;
        for(int i=0; i<=n;i++){
            sum =+1;
        }
        return sum;
    }

//Constant time O(1)
    //3 steps and faster than linear time
    int addsUp(int n){

        return n* (n+1)/2;
    }



//O(1)= constant  time
    //*random access of elements of array
    // inserting at beginning of linked list


    //o(log n)=logarithmic time
    //binary search


    //O(n)= linear time
    //looping through elements in an array
    //searching through linked list


    //O(n log n)= quasilinear time
    //quicksort
    //mergesort
    //heapsort


    //O(n^2)=quadratic time
    //insertion sort
    //selection sort
    //bubble-sort

//    O(n!)= factorial time
    //traveling salesman problem








}
