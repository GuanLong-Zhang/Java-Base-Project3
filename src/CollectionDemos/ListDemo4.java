package CollectionDemos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class ListDemo4 {
    public static void main(String[] args){
        System.out.println("测试ArrayList遍历:");
        testArrayList();
        System.out.println("测试LinkedList遍历:");
        testLinkedList();
    }

    public static void testArrayList(){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("javac");
        arr.add("java");

        //遍历   增强for
        for(String ss : arr){
            System.out.println(ss);
        }
        System.out.println("-------------------------");

        //迭代器遍历
        Iterator<String> l = arr.iterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
        System.out.println("-------------------------");

        //for + 索引
        for(int i = 0; i < arr.size(); i++){
            String ss = arr.get(i);
            System.out.println(ss);
        }
        System.out.println("-------------------------");
    }

    public static void testLinkedList(){
        LinkedList<String> li = new LinkedList<String>();
        li.add("zgl");
        li.add("fight");
        li.add("worker harder");

        //遍历   增强for
        for(String ss : li){
            System.out.println(ss);
        }
        System.out.println("-------------------------");

        //迭代器遍历
        Iterator<String> ll = li.iterator();
        while(ll.hasNext()){
            System.out.println(ll.next());
        }
        System.out.println("-------------------------");

        //for + 索引
        for(int i = 0; i < li.size(); i++){
            String ss = li.get(i);
            System.out.println(ss);
        }
        System.out.println("-------------------------");
    }

}
