package File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {       //alt+shift+enter抛出异常
        FileOutputStream f = new FileOutputStream("javac.txt",true);   //创建文件输出流对象   文件追加写入写true
        f.write(55);    //写内容
        f.write(56);
        f.write("\r\n".getBytes());   //window换行

        byte [] by = {97,98,99,100};   //字节数组
        f.write(by);
        f.write("\r\n".getBytes());

        byte [] by1 = "zgl".getBytes();  //将字符串转换为字节数组
        f.write(by1);
        f.write("\r\n".getBytes());

        byte [] by2 = "daydayup".getBytes();
        f.write(by2,1,3);    //从索引1开始写三个数据
        f.write("\r\n".getBytes());

        f.close();         //关闭文件输出流，并释放了资源

    }
}
