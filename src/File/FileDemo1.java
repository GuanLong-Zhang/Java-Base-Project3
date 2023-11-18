package File;
import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\IDEA_Project_Java\\Java-Base-Project3\\java.txt");
        System.out.println(f.createNewFile());     //创建文件   不存在，进行创建  成功true 失败false

        File f1 = new File("D:\\IDEA_Project_Java\\Java-Base-Project3\\javaSE");
        System.out.println(f1.mkdir());     //创建目录

        File f2 = new File("D:\\IDEA_Project_Java\\Java-Base-Project3\\javaWEB\\HTML");
        System.out.println(f2.mkdirs());   //创建多级目录




    }
}
