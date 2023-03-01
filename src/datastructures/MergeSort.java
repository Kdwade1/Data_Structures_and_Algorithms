package src.datastructures;

public class MergeSort {
    public static void main(String[] args) {

        //merge sort= recursively divide array into 2,sort,re combine

        //runtime complexity =O(n log n)
        //space complexity O(n)
        int[] array = {5, 4, 2, 6, 7, 3, 1, 6, 9, 8};

        mergeSort(array);
        for (int j : array) {
            System.out.println(j + " ");

        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1)
            return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0;//left array
        int j = 0;


        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int r = 0, l = 0, i = 0;//indices

        //checking the condition to merge.

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;

            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}
