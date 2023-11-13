package DataDemos;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
    public static void main(String[] atgs) throws ParseException {
        Date d = new Date();                             //无参构造
        SimpleDateFormat s = new SimpleDateFormat();     //无参构造
        String s1 = s.format(d);                         //format 将Date 转 String
        System.out.println(s1);

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");   //带参构造
        String s3 = s2.format(d);
        System.out.println(s3);

        String s4 = "2023/11/13 09:40:45";
        System.out.println("String:" + s4);
        SimpleDateFormat s5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d1 = s5.parse(s4);                           //parse 将String 转 Date
        System.out.println("Date:" + d1);

    }
}
