package CollectionDemos;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
//        TreeSet<int> tr = new TreeSet<int>();    //直接写int报错 应该用其包装类进行定义
        TreeSet<Integer> tr = new TreeSet<Integer>();
        tr.add(18);
        tr.add(25);
        tr.add(13);
        tr.add(13);      //不会存储相同的元素，即使存储也不会输出，并且无参构造方法会进行自动排序（升序）
        System.out.println(tr);
        System.out.println("---------------------");

        //遍历 增强for
        for(Integer i : tr){
            System.out.println(i);
        }


    }
}
