package CollectionDemos;
import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo2 {
    public static void main(String[] args){
        TreeSet<Student> tr = new TreeSet<Student>(new Comparator<Student>(){    //匿名对象类   new 接口或者类   带参构造方法
            @Override
            public int compare(Student o1, Student o2) {        //抽象方法重写  重写compare方法
                //this  o    Comparable
                //o1   o2    Comparator
                int num = o1.getAge() - o2.getAge();   //升序 o1-o2  降序 o2-o1
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });
        Student s = new Student("ming", 18);    //年龄相同，比较姓名首字母  年龄升序  姓名首字母升序
        Student s1 = new Student("hong", 17);
        Student s2 = new Student("zhang", 16);
        Student s3 = new Student("wang", 16);
        Student s4 = new Student("wang", 16);  //重复元素添加也不会进行输出

        tr.add(s);
        tr.add(s1);
        tr.add(s2);
        tr.add(s3);
        tr.add(s4);

        //增强for循环遍历
        for(Student ss : tr){
            ss.printStudent();
        }
    }

}
