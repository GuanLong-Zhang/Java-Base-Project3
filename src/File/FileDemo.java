package File;
import java.io.File;

//三种File构造方法
public class FileDemo {
    public static void main(String[] args){
        File f = new File("D:\\IDEA_Project_Java\\Java-Base-Project3\\java.txt");
        System.out.println(f);

        File f1 = new File("D:\\IDEA_Project_Java\\Java-Base-Project3","java.txt");
        System.out.println(f1);

        File f2 = new File("D:\\IDEA_Project_Java\\Java-Base-Project3");
        File f3 = new File(f2,"java.txt");
        System.out.println(f3);


    }
}
