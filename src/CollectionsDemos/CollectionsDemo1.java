package CollectionsDemos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CollectionsDemo1 {
    public static void main(String[] args){
        Student s = new Student("小红", 18);
        Student s1 = new Student("小张", 17);
        Student s2 = new Student("小李", 16);
        Student s3 = new Student("张三", 16);

        ArrayList<Student> a = new ArrayList<Student>();
        a.add(s);
        a.add(s1);
        a.add(s2);
        a.add(s3);

        Collections.sort(a, new Comparator<Student>(){     //使用Comparator
            @Override
            public int compare(Student o1, Student o2) {   //重写compare方法
                int num = o1.getAge() - o2.getAge();       //年龄升序
                int num1 = num ==0 ? o1.getName().compareTo(o2.getName()) : num;   //年龄相同，名字升序
                return num1;
            }
        });

        for(Student st : a){
            st.printStudent();
        }


    }
}
