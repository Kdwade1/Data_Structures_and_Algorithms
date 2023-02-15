package src.datastructures;

public class InsertionSort {
    //Insertion sort =after comparing the elements to the left shift elements to the right to make room for insertion

    //Quadratic time 0(n^2)
    //small data set=decent
    //large data set = Awful

    //fewer steps than a bubble sort
    //best case 0(n) compared to a selection sort 0(n^2)


    public static void main(String[] args) {
        int []array ={3,4,1,2,7,8,6,9,5};

        insertionSort(array);
        for(int i: array) {
            System.out.println(i+" ");
        }

    }

    private static void insertionSort(int[] array) {
        for(int i=1;i< array.length;i++){
            int temp= array[i];
            int j =i-1;

            while( j>=0 && array[j] > temp){
                array[j+1]=array[j];
                j--;

            }
            array[j+1]=temp;
        }
    }
}
