package CollectionDemos;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> ha = new HashSet<String>();
        ha.add("hello");
        ha.add("javac");
        ha.add("java");
        ha.add("java");      //不包含重复元素，即使插入了也不会输出

        //增强for遍历
        for(String ss : ha){     //乱序
            System.out.println(ss);
        }


    }
}
