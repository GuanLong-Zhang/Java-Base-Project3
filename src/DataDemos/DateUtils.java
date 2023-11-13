package DataDemos;
import java.text.ParseException;    //抛出异常
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateUtils {
    private DateUtils(){};   //构造方法私有

    public static String date2string(Date d, String format){    //成员方法静态
        SimpleDateFormat s = new SimpleDateFormat(format);
        String s1 = s.format(d);
        return s1;
    }

    public static Date string2date(String ss, String format) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat(format);
        Date d = s.parse(ss);
        return d;
    }

}
