package CollectionDemos;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo1 {
    public static void main(String[] args) {
        Student s = new Student("小明",18);
        Student s1 = new Student("小红",17);
        Student s2 = new Student("小张",16);
        List<Student> l = new ArrayList<Student>();
        l.add(s);
        l.add(s1);
        l.add(s2);

        //遍历1 for + 索引
        for(int i = 0; i < l.size(); i++){
            l.get(i).printStudent();
        }

        System.out.println("***********************");

        //遍历2  使用迭代器
        Iterator<Student> i = l.iterator();
        while(i.hasNext()){
            Student ss = i.next();
            ss.printStudent();
        }
    }
}
