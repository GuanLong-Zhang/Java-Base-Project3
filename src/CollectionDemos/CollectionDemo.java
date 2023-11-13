package CollectionDemos;
import java.util.Collection;   //接口
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args){
        Collection<String> c = new ArrayList<String>();   //接口多态  使用接口的引用指向实现子类对象
//        System.out.println(c.add("hello"));       //add 添加数据  返回boolean类型  永远为true
//        System.out.println(c.add("world"));
        c.add("hello");           //添加数据
        c.add("world");
        c.add("java");
        System.out.println(c);    //输出[hello, world, java]  重写过toString()方法

        c.remove("world");     //移除数据   返回boolean类型   true  false
        System.out.println(c);
        System.out.println(c.remove("world"));    //因为没有world，所以返回false
        System.out.println(c);

        System.out.println("Collection集合中是否包含world这个元素？" + c.contains("world"));   //判断是否包含world这个元素

        System.out.println("Colleaction集合中的元素个数：" + c.size());    //元素个数

        c.clear();                //清空
        System.out.println(c);

        System.out.println("Collection集合是否为空？" + c.isEmpty());    //判空





    }
}
