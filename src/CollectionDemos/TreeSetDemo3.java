package CollectionDemos;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args){
        TreeSet<Student1> tr = new TreeSet<Student1>(new Comparator<Student1>(){    //匿名对象类   new 接口或者类   带参构造方法
            @Override
            public int compare(Student1 o1, Student1 o2) {        //抽象方法重写  重写compare方法
                //this  o    Comparable
                //o1   o2    Comparator
                int num = o2.getSum() - o1.getSum();   //升序 o1-o2  降序 o2-o1       //总分降序
                int num2 = num == 0 ? o2.getMath() - o1.getMath() : num;             //总分相同  数学降序
                int num3 = num2 == 0 ? o2.getName().compareTo(o1.getName()) : num2;  //总分相同  数学相同  语文相同  名字降序
                return num3;
            }
        });

        Student1 s = new Student1("ming", 97, 96);
        Student1 s1 = new Student1("hong", 98, 97);
        Student1 s2 = new Student1("zhang", 99, 98);
        Student1 s3 = new Student1("wang", 98, 99);
        Student1 s4 = new Student1("lang", 98, 99);

        tr.add(s);
        tr.add(s1);
        tr.add(s2);
        tr.add(s3);
        tr.add(s4);

        //增强for循环遍历
        for(Student1 ss : tr){
            ss.printStudent1();
        }
    }


}



