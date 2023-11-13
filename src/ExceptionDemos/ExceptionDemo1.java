package ExceptionDemos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args){
        System.out.println("开始");
//        method();
        try {
            method1();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("结束");
    }

    public static void method() {
        try {
            String s = "2023/11/13";
            SimpleDateFormat si = new SimpleDateFormat("yyyy/MM/dd");
            Date d = si.parse(s);    //编译时异常   将 String 转 Date   必须显示处理，否则无法编译
            System.out.println(d);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void method1() throws ParseException {    //抛出异常
        String s = "2023/11/13";
        SimpleDateFormat si = new SimpleDateFormat("yyyy/MM/dd");
        Date d = si.parse(s);    //编译时异常   将 String 转 Date   必须显示处理，否则无法编译
        System.out.println(d);
    }
}
