package File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//图片复制
public class FileInputOutput1 {
    public static void main(String[] args) throws IOException{
        System.out.println("图片复制：");
        long start = System.currentTimeMillis();
        test();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    public static void test() throws IOException{
        FileInputStream f = new FileInputStream("1.jpg");    //文件输入流
        FileOutputStream f1 = new FileOutputStream("2.jpg");  //文件输出流

        byte [] bys = new byte[1024];
        int len;
        while((len = f.read(bys)) != -1){    //字节数组读取，字节数组写入
            f1.write(bys,0,len);
        }
        f1.close();
        f.close();

    }
}
