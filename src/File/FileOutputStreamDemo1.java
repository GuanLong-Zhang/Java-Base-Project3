package File;
import java.io.FileOutputStream;
import java.io.IOException;

//try catch异常处理
public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        FileOutputStream f = null;
        try {
            f = new FileOutputStream("java.txt",true);   //元素追加true
            f.write("Hello".getBytes());
            f.write("\r\n".getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(f != null){    //不为空，才进行释放资源
                try{
                    f.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }


    }
}
