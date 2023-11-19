package File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException{     //抛出异常
        FileInputStream f = new FileInputStream("javac.txt");  //创建文件输入流对象
        FileInputStream f1 = new FileInputStream("java.txt");
//        int b = f.read();         //读操作   读取一个字节的操作
//        System.out.println((char)b);

//        int b = f.read();
//        while(b != -1){          //全部读取  循环遍历   读完为-1
//            System.out.print((char)b);
//            b = f.read();
//        }

        int b;
        while((b = f.read()) != -1){    //优化，全部读取  循环遍历  读取一个字节的操作
            System.out.print((char)b);
        }
        System.out.println("-------------------------");

        byte [] bys = new byte[1024];    //字节数组读取
        int len;
        while((len = f1.read(bys)) != -1){
            System.out.print(new String(bys, 0,len));
        }
        System.out.println("-------------------------");

        f1.close();                //关闭文件输入流并释放资源
        f.close();

    }
}
