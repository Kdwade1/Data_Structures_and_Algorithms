package src.datastructures;

public class Array {


    public static void main(String[] args) {
        DynamicArray dynamicArray= new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0,"x");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);
        System.out.println(dynamicArray.isEmpty());
    }
}
