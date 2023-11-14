package CollectionDemos;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args){
        Student s = new Student("小明",18);
        Student s1 = new Student("小红",17);
        Student s2 = new Student("小张",16);
        Collection<Student> c = new ArrayList<Student>();
        c.add(s);
        c.add(s1);
        c.add(s2);

        Iterator<Student> i = c.iterator();
        while(i.hasNext()){
            Student ss = i.next();
            ss.printStudent();
        }
    }


}
