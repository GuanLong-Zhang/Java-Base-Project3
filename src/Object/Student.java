package Object;
import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("Student无参构造方法");
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void printStudent(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }

    @Override
    public String toString() {    //重写toString方法    按alt+ins自动重写
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //this指的是s,o指的是s1  比较地址
        if (this == o) return true;

        //判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型 student == s1   Object 转为 Student
        Student student = (Student) o;

        //age为s的
        if (age != student.age) return false;

        return Objects.equals(name, student.name);
    }

}
