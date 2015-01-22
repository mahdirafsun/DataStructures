package arrayList_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by salahakanda on 11/27/14.
 */
public class Linked_List {

    public static void main(String[]args){

        LinkedList<String> linkedList= new LinkedList();
        linkedList.add("salah");
        linkedList.add("uddin");
        linkedList.add("akanda");
        linkedList.add(3,"time");



        // Using for each loop
        for ( String st : linkedList){
            System.out.println(st);
        }

        // Using Iterator

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
