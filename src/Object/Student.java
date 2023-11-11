package Object;

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
}