package hashTables;


import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_Hash {

    public static void main(String[]args){

        List<String> list = new ArrayList<String>();
        list.add("ny");
        list.add("nj");
        list.add("dc");

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("USA", list);

        for(Map.Entry<String, List<String>> st: map.entrySet()){
            System.out.println(st.getKey()  + " : " + st.getValue());
        }

        

//        for(Entry<String, String> st : map.entrySet()){
//            System.out.println(st.getKey() + st.getValue());



        }
}
