package Object;
import java.util.Scanner;

public class ObjectDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        Student s = new Student(name, age);
        System.out.println(s);    // Object.Student@6193b845    默认调用toString方法，但是一般该方法需要进行重写
        s.printStudent();

    }
}
