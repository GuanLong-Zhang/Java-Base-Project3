package DataDemos;
import java.util.Date;

public class DataDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);     //输出现在的时间 格式为：Sun Nov 12 21:50:45 CST 2023

        long a = 1000 * 60 * 60;   //毫秒转小时
        Date d1 = new Date(a);
        System.out.println(d1);    //输出Thu Jan 01 09:00:00 CST 1970

        System.out.println("距离1970年有" + d.getTime() * 1.0 / 1000 / 60 / 60 / 24 /365 + "年");  //53.900196745972856

        long b = 1000 * 60 * 60;
        d.setTime(b);
        System.out.println(d);     //输出Thu Jan 01 09:00:00 CST 1970  类似于Date的有参构造

        long c = System.currentTimeMillis();   //现在的时间
        d.setTime(c);
        System.out.println(d);     //输出现在的时间 格式为 Sun Nov 12 21:50:45 CST 2023
    }
}
