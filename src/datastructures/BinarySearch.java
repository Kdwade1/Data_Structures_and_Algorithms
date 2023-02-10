package src.datastructures;

import java.util.Arrays;

public class BinarySearch {


    //Binary search=Searches algorithms that find the position of a target value within a sorted array.
    //Half the array eliminated through steps.


    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target= 600;

        for (int i = 0; i < array.length; i++) {
            array[i]= i;
            
        }
//        int index= Arrays.binarySearch(array,target);
        int index= binarySearch(array,target);

        if(index ==-1){
            System.out.println( target+"not found");
        }else{
            System.out.println("Element found at: "+index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low =0;
        int high =array.length -1;

        while(low <= high){
            int middle= low+ (high -low)/2;
            int value= array[middle];
            int lValue=array[low];
            int hValue=array[high];
            System.out.println("low:"+ lValue);

            System.out.println("middle: "+value);
            System.out.println("high: "+hValue);
            System.out.println("the target is: "+ target);

            if (value< target){
                low=middle+1;
            } else if (value>target) {
                high=middle-1;

            }else{
                return middle;
            }
        }
        return -1;
    }
}

