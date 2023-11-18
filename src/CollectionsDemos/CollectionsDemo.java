package CollectionsDemos;
import java.util.Collections;
import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(50);
        a.add(30);
        a.add(20);
        a.add(40);
        System.out.println("排序前：");
        System.out.println(a);

        System.out.println("排序后：");
        Collections.sort(a);     //将指定的列表元素进行升序排序
        System.out.println(a);

        System.out.println("反转后：");
        Collections.reverse(a);   //反转指定列表中的元素顺序
        System.out.println(a);

        System.out.println("随机排列：");
        Collections.shuffle(a);    //使用默认的随机源随机排列指定列表
        System.out.println(a);




    }
}
