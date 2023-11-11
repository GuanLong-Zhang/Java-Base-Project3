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
        System.out.println("------------------------");

        Scanner sc1 = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name1 = sc1.nextLine();
        System.out.print("请输入年龄：");
        int age1 = sc1.nextInt();
        Student s1 = new Student(name1, age1);
        System.out.println(s1);
        s1.printStudent();
        System.out.println("------------------------");

        System.out.println(s.equals(s1));   //equals()默认比较的是地址，所以需要对方法进行重写


    }
}
