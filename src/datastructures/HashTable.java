package src.datastructures;

import java.util.Hashtable;

public class HashTable {

    //

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

