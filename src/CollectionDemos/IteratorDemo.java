package CollectionDemos;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args){
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("zgl");
        c.add("java");

        //元素遍历
        Iterator<String> i = c.iterator();
        while(i.hasNext()){        //判断是否有更多的元素，如果有返回true  如果没有返回false
            String s = i.next();   //返回迭代器下一个元素
            System.out.println(s);
        }
    }
}
