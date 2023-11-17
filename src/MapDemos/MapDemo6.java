package MapDemos;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args){
        HashMap<String,ArrayList<String>> h = new HashMap<String,ArrayList<String>>();
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        a.add("小张");
        a.add("小刘");
        a1.add("小王");
        a1.add("小高");
        a2.add("小李");
        a2.add("小孙");

        h.put("18001", a);
        h.put("18002", a1);
        h.put("18003", a2);

        printHashMap(h);
    }

    public static void printHashMap(HashMap<String,ArrayList<String>> h){
        Set<Map.Entry<String,ArrayList<String>>> s = h.entrySet();
        for(Map.Entry<String,ArrayList<String>> ss : s){
            String k = ss.getKey();
            System.out.println(k);
            ArrayList<String> v = ss.getValue();
            for(String st : v){
                System.out.println("\t" + st);
            }
        }
    }
}
