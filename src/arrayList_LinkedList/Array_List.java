package arrayList_LinkedList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List {


    public static void main(String[]args) {

        List<String> list = new ArrayList<String>();

       System.out.println(list.size());
        list.add("jjh");
        System.out.println(list.size());
        list.add("salah");
        list.add("uddin");
        list.add("akanda");
        System.out.println(list.size());
//
        // Using for each loop
        for (String st : list )
        System.out.println(st);

        // Using Iterator

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }



}
