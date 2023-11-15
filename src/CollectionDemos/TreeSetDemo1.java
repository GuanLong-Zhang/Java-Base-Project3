package CollectionDemos;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args){
        TreeSet<Student> tr = new TreeSet<Student>();     //无参构造方法
        Student s = new Student("ming", 18);    //年龄相同，比较姓名首字母  年龄升序  姓名首字母升序
        Student s1 = new Student("hong", 17);   //对于自定义类型需要实现Comparable接口，并且重写compareTo()方法
        Student s2 = new Student("zhang", 16);
        Student s3 = new Student("wang", 16);
        Student s4 = new Student("wang", 16);   //重复元素添加也不会进行输出

        tr.add(s);
        tr.add(s1);
        tr.add(s2);
        tr.add(s3);
        tr.add(s4);

        for(Student ss : tr){
            ss.printStudent();
        }
    }

}
