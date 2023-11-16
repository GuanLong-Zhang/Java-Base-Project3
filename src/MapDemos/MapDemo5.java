package MapDemos;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args){
        ArrayList<HashMap<String, String>> a = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> m = new HashMap<String, String>();
        HashMap<String, String> m1 = new HashMap<String, String>();
        HashMap<String, String> m2 = new HashMap<String, String>();
        m.put("18001", "小张");
        m.put("18002", "小赵");
        m1.put("18003", "小王");
        m1.put("18004", "小洪");
        m2.put("18005", "小李");
        m2.put("18006", "小刘");

        a.add(m);
        a.add(m1);
        a.add(m2);
        printArrayList(a);
    }

    public static void printArrayList(ArrayList<HashMap<String, String>> a){
        for(HashMap<String, String> s : a){                     //遍历ArrayList
            Set<Map.Entry<String, String>> ss = s.entrySet();   //遍历HashMap
            for(Map.Entry<String, String> sss : ss){
                String st = sss.getKey();
                String st1 = sss.getValue();
                System.out.println(st + "," + st1);
            }
        }
    }

}
