package MapDemos;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args){
        Student s = new Student("小明",18);
        Student s1 = new Student("小张",17);
        Student s2 = new Student("小李",17);
        HashMap<String, Student> m = new HashMap<String, Student>();
        m.put("18001",s);
        m.put("18002",s1);
        m.put("18003",s2);

        printMap(m);           //注意输出乱序,不是按照插入的顺序进行输出的
        System.out.println("-----------------");
        printMap1(m);
        System.out.println("-----------------");

    }

    public static void printMap(HashMap<String, Student> m){
        Set<String> s = m.keySet();
        for(String ss : s){
            Student st = m.get(ss);
            System.out.println(ss + "," + st.getName() + " " + st.getAge());
        }
    }

    public static void printMap1(HashMap<String, Student> m){
        Set<Map.Entry<String, Student>> se  = m.entrySet();
        for(Map.Entry<String, Student> ss : se){
            String k = ss.getKey();
            Student v = ss.getValue();
            System.out.println(k + "," + v.getName() + " " + v.getAge());
        }
    }

}
