package File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        System.out.println("文本文件复制(一个字节)：");
        long start = System.currentTimeMillis();
        test();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");

    }

    public static void test()throws IOException{
        FileInputStream f = new FileInputStream("javac.txt");    //读数据对象
        FileOutputStream f1 = new FileOutputStream("java.txt");  //写数据对象
        int b;
        while((b = f.read()) != -1){   //从javac.txt中读取数据，然后写入java.txt中   一次读取一个字节
            f1.write(b);
        }
        f1.close();
        f.close();
    }

}
