package MapDemos;
import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args){
        Map<Integer, String> m = new HashMap<Integer, String>();     //集合中使用基本类型，必须使用基本类型包装类
        m.put(1, "小张");    //键  值  插入元素使用put
        m.put(2, "小李");
        m.put(3, "小王");
        System.out.println(m);
        m.put(3, "小刘");    //对重复的键，赋值后，原先的内容就会被覆盖
        System.out.println(m);
    }
}
