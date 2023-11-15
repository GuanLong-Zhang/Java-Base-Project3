package CollectionDemos;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

//可变参数的使用
public class VariableParameters1 {
    public static void main(String[] args){
        List<String> l = Arrays.asList("hello", "javac", "java");   //可以插入任意大小的字符串，所以是可变参数
//        l.add("zgl");        //UnsupportedOperationException   运行时异常   添加和删除元素会导致列表大小发生变化，所以报异常错误
//        l.remove("hello");   //UnsupportedOperationException
        System.out.println(l);
        l.set(1, "zgl");       //修改元素，列表大小不会发生变换，所以不会报异常错误
        System.out.println(l);
        System.out.println("----------------");

        List<String> l1 = List.of("hello", "javac","java","world","java");  //允许有重复元素
//        l1.add("zgl");         //UnsupportedOperationException
//        l1.remove("hello");    //UnsupportedOperationException
//        l1.set(1, "zgl");      //UnsupportedOperationException    不可变，虽然大小没变，但是内容也不可以变
        System.out.println(l1);
        System.out.println("----------------");

        Set<String> s = Set.of("hello", "javac","java","world");    //不允许有重复元素
//        s.add("zgl");          //UnsupportedOperationException
//        s.remove("hello");     //UnsupportedOperationException
        System.out.println(s);
        System.out.println("----------------");



    }
}
