package CollectionDemos;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add("hello");
        l.add("world");
        l.add("java");

        //遍历
        ListIterator<String> li =  l.listIterator();    //列表迭代器
        while(li.hasNext()){                //向前遍历  正向遍历
            String ss = li.next();
            System.out.println(ss);
        }
        System.out.println("-----------------------");

        while(li.hasPrevious()){           //向后遍历  逆向遍历
            String ss = li.previous();
            System.out.println(ss);
        }
        System.out.println("-----------------------");

        //注意  通过List集合对象去添加元素在遍历的时候会报并发修改异常，但是通过列表迭代器ListIterator对象添加元素就不会报错了
        while(li.hasNext()){
            String ss = li.next();
            if(ss.equals("world")){    //equals  进行字符串内容的判断  == 进行字符串地址的判断
                li.add("javac");       //列表迭代器也可以使用add进行添加元素   添加之后，原先的元素后移
            }
        }
        System.out.println(l);
        System.out.println("-----------------------");


    }
}
