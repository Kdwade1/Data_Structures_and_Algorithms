package src.datastructures;

public class InterpolationSearch {

    //interpolation search=improvements of binary search. Best used for "uniformly" distribute data"guesses"where the value
    //might be based on calculated probe result. If probe is incorrect, search area is narrowed and new probe is calculated


    //average case O(log(log(n)))
    //worse case O(n)[value increase exponentially]
    public static void main(String[] args) {
        int [] array ={1,2,4,8,16,32,64,128,256,512,1024};
        int index = interpolationSearch(array,256);
        if( index != -1){
            System.out.println("element found at index: "+index);

        }else{
            System.out.println("element not found");
        }

    }



    private static int interpolationSearch(int[] array, int value) {

        int high = array.length-1;
        int low=0;
        while(value >=array[low]&& value <=array[high]&&low <= high){

            int probe= low+(high-low)*(value-array[low])/(array[high]-array[low]);  //<---formular to calculate where value is LIKELY tp be
            System.out.println("probe: "+probe);

            if(array[probe]== value){
                return probe;
            } else if (array[probe]<value) {
                low=probe+1;
                
            }else{
                high =probe-1;
            }

        }
        return -1;

    }
}
