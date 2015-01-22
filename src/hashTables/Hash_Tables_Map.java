package hashTables;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Hash_Tables_Map {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("usa", "New York");
        map.put("po", "ou");


        for(Entry<String, String> st : map.entrySet()){
            System.out.println(st.getKey() + st.getValue());


        }
    }


}