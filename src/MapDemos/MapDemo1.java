package MapDemos;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class MapDemo1 {
    public static void main(String[] args){
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "小张");    //添加元素
        m.put(2, "小王");
        m.put(3, "小李");
        System.out.println(m);
        System.out.println("键对应的值为：" + m.get(1));     //根据键获取值
        System.out.println("键对应的值为：" + m.get(0));

        Set<Integer> s = m.keySet();    //获取所有键的集合   键不重复，所以用Set
        System.out.println("所有键的集合为：" + s);

        Collection<String> ss = m.values();   //获取所有值的集合
        System.out.println("所有值的集合为：" + ss);

        System.out.println("被删除的值为：" + m.remove(1));   //根据键删除键值对,并且返回被删除的值
        System.out.println(m);

        System.out.println(m.containsKey(1));   //判断是否包含键 1
        System.out.println(m.containsValue("小王"));   //判断是否包含值 小王

        System.out.println("Map集合大小为：" + m.size());    //键值对的个数

        m.clear();                       //清空
        System.out.println(m);
        System.out.println("Map集合是否为空：" + m.isEmpty());     //判空

    }
}
