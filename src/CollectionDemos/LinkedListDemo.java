package CollectionDemos;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> li = new LinkedList<String>();
        li.add("hello");
        li.add("javac");
        li.add("java");
        System.out.println(li);
        System.out.println("------------------------");

        li.addFirst("zgl");      //在表头添加元素
        System.out.println(li);
        System.out.println("------------------------");

        li.addLast("nb");        //在表尾添加元素
        System.out.println(li);
        System.out.println("------------------------");

        System.out.println(li.removeFirst());    //删除表头元素，并将被删除的元素返回
        System.out.println(li);
        System.out.println("------------------------");

        System.out.println(li.removeLast());    //删除表尾元素，并将被删除的元素返回
        System.out.println(li);
        System.out.println("------------------------");

        System.out.println(li);
        System.out.println(li.getFirst());      //获得表头元素
        System.out.println(li.getLast());       //获得表尾元素
        System.out.println("------------------------");
    }
}
