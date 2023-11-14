package CollectionDemos;
import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s = new Student("小明", 18);
        Student s1 = new Student("小红", 17);
        Student s2 = new Student("小张", 16);   //需要对方法进行重写，这样才可以实现自定义数据的类型的存储 重写hashCode()和equals()方法
        Student s3 = new Student("小张", 16);

        HashSet<Student> ha = new HashSet<Student>();
        ha.add(s);
        ha.add(s1);
        ha.add(s2);
        ha.add(s3);

        for(Student ss : ha){
            ss.printStudent();    //乱序     相同的重复内容不会输出
        }

    }
}
