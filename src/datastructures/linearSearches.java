package src.datastructures;

public class linearSearches {

    // linear search =iterate through a collection of one element at a time

    // run time complexity O(n)

    //Disadvantages:

    //slow for large data sets

    //Advantages:

    //fast for medium to small data sets
    //does not need to be sorted

    //useful for data structures that do not have random access(LINKEDLIST)


    public static void main(String[] args) {
        int[] array={4,5,6,7,8,6,4,23,6};
        int index=linearSearch(array,6);

        if(index != -1){
            System.out.println("Element found at index "+index);

        }else{
            System.out.println("Element not found");

        }
    }
    public static int linearSearch(int[]array,int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value) {
                return i;
            }
        }
        return -1;
    }
}
