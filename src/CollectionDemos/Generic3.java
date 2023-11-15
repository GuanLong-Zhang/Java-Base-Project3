package CollectionDemos;
import java.util.List;
import java.util.ArrayList;

public class Generic3 {
    public static void main(String[] args){
        //类型通配符<?>
        List<?> l = new ArrayList<Object>();
        List<?> l1 = new ArrayList<Number>();
        List<?> l2 = new ArrayList<Integer>();
        System.out.println("------------------");

        //类型通配符上限<? extends 类型>
        List<? extends Number> l3 = new ArrayList<Number>();    //类型可以是Number 也可以是Number的子类
        List<? extends Number> l4 = new ArrayList<Integer>();

        //类型通配符下限<? super 类型>
        List<? super Number> l5 = new ArrayList<Object>();      //类型可以是Number 也可以是Number的父类
        List<? super Number> l6 = new ArrayList<Number>();
//        List<? super Number> l7 = new ArrayList<Integer>();   //报错，Integer是Number的子类，所以不行

    }
}
