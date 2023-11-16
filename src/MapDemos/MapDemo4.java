package MapDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        Student s = new Student("小明", 18);
        Student s1 = new Student("小张", 17);
        Student s2 = new Student("小李", 17);
        Student s3 = new Student("小李", 17);     //自定义的键重复了，需要重写hashcode() 和 equals()方法
        HashMap<Student, String> m = new HashMap<Student, String>();
        m.put(s, "北京");
        m.put(s1, "天津");
        m.put(s2, "上海");
        m.put(s3, "广州");

        printMap(m);
        System.out.println("----------------");
        printMap1(m);
        System.out.println("----------------");
    }

    public static void printMap(HashMap<Student, String> m){
        Set<Student> s = m.keySet();
        for(Student ss : s){
            String st = m.get(ss);
            System.out.println(ss.getName() + " " + ss.getAge() + "," + st);
        }
    }

    public static void printMap1(HashMap<Student, String> m){
        Set<Map.Entry<Student, String>> se  = m.entrySet();
        for(Map.Entry<Student, String> ss : se){
            Student k = ss.getKey();
            String v = ss.getValue();
            System.out.println(k.getName() + " " + k.getAge() + "," + v);
        }
    }

}
