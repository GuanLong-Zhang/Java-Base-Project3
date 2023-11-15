package CollectionDemos;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

//泛型
public class GenericDemo {
    public static void main(String[] args){
        test();
        System.out.println("-------------------");
        test1();
        System.out.println("-------------------");

    }

    public static void test(){
        Collection c = new ArrayList();     //未指定类型
        c.add("hello");           //默认Object类
        c.add("javac");
        c.add("java");

        Iterator i = c.iterator();   //迭代器
        while(i.hasNext()){
            String s = (String)i.next();   //向下转型 Object 转 String
            System.out.println(s);
        }
    }

    public static void test1(){
        Collection<String> c = new ArrayList<String>();     //指定String
        c.add("hello");
        c.add("javac");
        c.add("java");
//        c.add(100);      //报错，因为已经指定了为String     把运行时的问题提前到了编译期间

        Iterator<String> i = c.iterator();   //迭代器
        while(i.hasNext()){
            String s = i.next();      //避免了强制类型转换
            System.out.println(s);
        }
    }

}

