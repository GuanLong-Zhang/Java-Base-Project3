package DataDemos;
import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println("Date:" + d1);
        String format = "yyyy/MM/dd HH:mm:ss";          //指定格式
        String s = DateUtils.date2string(d1, format);   //成员方法静态 可以通过类名进行访问
        System.out.println("String:" + s);

        String s1 = "2023/11/13 10:00:55";
        System.out.println("String:" + s1);
        Date d2 = DateUtils.string2date(s1, format);
        System.out.println("Date:" + d2);

    }
}
