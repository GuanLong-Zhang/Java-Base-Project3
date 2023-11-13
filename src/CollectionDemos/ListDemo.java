package CollectionDemos;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("hello");
        l.add("world");
        l.add("java");
        System.out.println(l);   //输出[hello, world, java]   表示有序  输出的结果和添加的顺序相同
        l.add("hello");
        System.out.println(l);   //输出[hello, world, java, hello]   表示可重复

        //遍历
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            String ss = it.next();
            System.out.println(ss);
        }

        //List集合特有的方法
        l.add(1,"javac");    //在索引1插入javac,原始元素后移
        System.out.println(l);

        System.out.println(l.remove(2));   //删除索引2的元素，并将被删除元素返回
        System.out.println(l);

        System.out.println(l.set(1,"java"));     //将索引1的元素修改，并返回被修改的元素
        System.out.println(l);

        System.out.println(l.get(0));       //获取索引0的元素
        System.out.println("-------------------");

        //遍历
        for(int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }

    }
}
