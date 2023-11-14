package CollectionDemos;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args){
        Set<String> s = new HashSet<String>();
        s.add("hello");
        s.add("javac");
        s.add("java");
        s.add("java");    //Set容器不包含重复的元素，即使添加了也不会输出

        //增强for遍历
        for(String ss : s){
            System.out.println(ss);
        }
        System.out.println("-------------------");

        //迭代器遍历
        Iterator<String> i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("-------------------");


    }
}
