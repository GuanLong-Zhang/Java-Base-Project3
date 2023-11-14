package CollectionDemos;
import java.util.List;
import java.util.ArrayList;

//增强for循环   内部原理是一个Iterator迭代器
public class ForDemo {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};    //静态开辟数组
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("---------------------");

        String [] arr1 = {"hello", "world", "java"};
        for(String i : arr1){
            System.out.println(i);
        }
        System.out.println("---------------------");

        List<String> l = new ArrayList<String>();
        l.add("hello");
        l.add("java");
        l.add("javac");
        for(String i : l){
            System.out.println(i);
        }
        System.out.println("---------------------");


    }

}
