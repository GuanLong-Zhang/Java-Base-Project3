package CollectionDemos;
import java.util.LinkedHashSet;

//链表保证有序，哈希表保证数据不重复
public class LinkedHashSetDemo {
    public  static void main(String[] args){
        LinkedHashSet<String> li = new LinkedHashSet<String>();
        li.add("hello");
        li.add("javac");
        li.add("java");
        li.add("java");     //添加重复元素,即使添加了，也不会有输出

        //增强for循环遍历
        for(String ss : li){
            System.out.println(ss);
        }
    }

}
