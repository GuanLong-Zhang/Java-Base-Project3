package CollectionDemos;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo2 {
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add("hello");
        l.add("world");
        l.add("java");

//        Iterator<String> it = l.iterator();
//        while(it.hasNext()){
//            String ss = it.next();      //报错 并发修改异常ConcurrentModificationException，在进行判断后，改变了原始List的长度
//            if(ss.equals("world")){    //equals  进行字符串内容的判断  == 进行字符串地址的判断
//                l.add("javac");
//            }
//        }

        for(int i = 0; i < l.size(); i++){
            String ss = l.get(i);
            if(ss.equals("world")){
                l.add("javac");
            }
        }
        System.out.println(l);

    }
}
