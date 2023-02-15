package src.datastructures;

public class BubbleSort {


    //bubble sort =pairs of adjacent elements compared,and the elements swapped if they are not in order
    //Quadratic time of O(n^2)
    //small data set =eh
//    large data set = bad
    public static void main(String[] args) {
        int []array={3,4,1,2,7,8,6,9,5};
        bubbleSort(array);
        for(int i:array){
            System.out.println(i);
        }
    }

     static void bubbleSort(int []array) {
        for(int i =0; i<array.length -1;i++){
            for(int j =0; j<array.length -i-1;j++){
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
    }
}
