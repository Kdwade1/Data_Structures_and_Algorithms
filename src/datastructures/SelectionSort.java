package src.datastructures;

public class SelectionSort {
    //selection sort =search through an array and keep track of minimum value during each interation.
    //At the end of each iteration we swap variables

    //quadratic time = o(n^2)
    //small data set=okay
    //large data sets = BAD

    public static void main(String[] args) {
        int []array ={3,4,1,2,7,8,6,9,5};
        selectionSort(array);
        for(int i: array){
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for(int i=0;i< array.length-1;i++){
            int min =i;
            for(int j=i+1;j< array.length;j++){
                if(array[min]> array[j]){
                    min =j;
                }

            }
            int temp= array[i];
            array[i]= array[min];
            array[min]= temp;
        }
    }
}
