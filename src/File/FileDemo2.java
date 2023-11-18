package File;
import java.io.File;

public class FileDemo2 {
    public static void main(String[] args){
        File f = new File("java.txt");
        File f2 = new File("javaSE");
        File f3 = new File("javaWEB");
        System.out.println(f.isDirectory());    //是否是目录
        System.out.println(f.isFile());         //是否是文件
        System.out.println(f.exists());         //文件时候存在
        System.out.println("------------------------");

        System.out.println(f.getAbsolutePath());  //获得绝对路径
        System.out.println(f.getPath());          //获得对象路径名
        System.out.println(f.getName());           //获得文件名称或者目录名称
        System.out.println("------------------------");

        System.out.println(f.delete());        //删除文件
        System.out.println(f2.delete());       //删除目录
        System.out.println(f3.delete());       //删除目录 目录下面有东西的时候是直接删除不掉的，必须把里面的内容删除才可以删除
        System.out.println("------------------------");

        File f1 = new File("D:\\IDEA_Project_Java\\Java-Base-Project3");
        String[] l = f1.list();     //获得指定路径下目录和文件名称
        int num = 0;
        for(String s : l){
            System.out.println(s);
            num++;
        }
        System.out.println("num = " + num);
        System.out.println("------------------------");

        File[] fi = f1.listFiles();  //获得指定路径下目录和文件的绝对路径
        int num1 = 0;
        for(File file : fi){      //因为为File，所以可以使用isFile方法
            if(file.isFile()){
                System.out.println(file.getName());
                num1++;
            }
        }
        System.out.println("num1 = " + num1);
        System.out.println("------------------------");


    }
}
