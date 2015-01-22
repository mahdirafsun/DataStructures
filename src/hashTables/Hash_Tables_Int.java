package hashTables;




    import java.util.HashMap;
    import java.util.Map;
    import java.util.Map.Entry;
    public class Hash_Tables_Int {

        public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(1, "New York");
            map.put(2, "ou");


            for (Entry<Integer, String> st : map.entrySet()) {
                System.out.println(st.getKey() +"---------"+ st.getValue());


            }
        }
}
