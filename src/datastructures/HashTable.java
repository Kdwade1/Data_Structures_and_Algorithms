package src.datastructures;

import java.util.Hashtable;

public class HashTable {

    //Hashtable= A datastructure that stores unique keys to values ex <Integer,String>
    //Each Key/Value pair is known as an Entry
    //Fast insertion,look up,deletion of key/value pairs
    //Not ideal for small datasets, great for large datasets


    ///hashing=takes a key and computes an integer(formula will vary based on key&data type)
    //In a hashTable we use the hash %capacity to calculate index number
    //key.hashcode()%capcity=index


    //bucket=an indexed storage location for one or more Entries
    //can store multiple Entries in case of collision (linked similarly a Linkedlist)


    //collision= hash function generates the same indexes for more than one key
    //less collision= more efficiency

    //runtime complexity: Best Case O(1)
    //worse case O(n)

    public static void main(String[] args) {
//        Hashtable<Integer,String> table=new Hashtable<>(10);
//        table.put(100,"goku");
//        table.put(143,"naruto");
//        table.put(175,"aang");
//        table.put(596,"luffy");
//        table.put(777,"tanjiro");
//
////        table.remove(175);
//
//        for(Integer key:table.keySet()) {
//
//            System.out.println(key.hashCode() % 10+"\t"+key+ "\t"+table.get(key));
    //}

            Hashtable<String,String> table2=new Hashtable<>(10);
            table2.put("100","goku");
            table2.put("143","naruto");
            table2.put("175","aang");
            table2.put("596","luffy");
            table2.put("777","tanjiro");

            for(String keys:table2.keySet()) {
                System.out.println(keys.hashCode() % 10+"\t"+keys+ "\t"+table2.get(keys));
            }



        }
    }

