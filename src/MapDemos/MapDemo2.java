package MapDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "小张");    //添加元素
        m.put(2, "小王");
        m.put(3, "小李");
        printMap(m);
        System.out.println("---------------");
        printMap1(m);
        System.out.println("---------------");

    }

    public static void printMap(Map<Integer, String> m){
        Set<Integer> s = m.keySet();   //获得键的集合
        for(Integer i : s){            //遍历键
            String ss = m.get(i);      //得到对应键所对应的值
            System.out.println(i + "," + ss);
        }
    }

    public static void printMap1(Map<Integer,String> m){
        Set<Map.Entry<Integer, String>> s = m.entrySet();      //获取整体键值对集合
        for(Map.Entry<Integer, String> i : s){                 //遍历键值对集合得到键值对对象
            Integer k = i.getKey();                            //得到键值对对象的键和值
            String v = i.getValue();
            System.out.println(k + "," + v);
        }
    }

}
