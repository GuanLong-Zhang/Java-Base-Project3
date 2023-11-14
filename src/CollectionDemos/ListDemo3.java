package CollectionDemos;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        Student s = new Student("小明", 18);
        Student s1 = new Student("小红", 17);
        Student s2 = new Student("小张", 16);
        List<Student> l = new ArrayList<Student>();
        l.add(s);
        l.add(s1);
        l.add(s2);

        //通过列表迭代器进行遍历
        ListIterator<Student> li = l.listIterator();
        while(li.hasNext()){
            Student ss = li.next();
            ss.printStudent();
            System.out.println("-----------------");
        }
        System.out.println("**********************");

        //通过增强for循环进行遍历
        for(Student ss : l){
            ss.printStudent();
            System.out.println("------------------");
        }

    }
}
