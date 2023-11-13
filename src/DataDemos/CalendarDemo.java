package DataDemos;
import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();   //获取Calendar类   日历类
        System.out.println(c);

        printCalendar(c);

        c.add(Calendar.YEAR, -3);     //在现在的年份上减去3
        printCalendar(c);                    //2020

        c.add(Calendar.YEAR, 3);     //在2020上加上3
        printCalendar(c);                   //2023

        c.set(2050,0,1);    //设置日期为2050/01/01
        printCalendar(c);

    }

        public static void printCalendar(Calendar c){
            int y = c.get(Calendar.YEAR);
            int m = c.get(Calendar.MONTH) + 1;     //注意此处的月份从0开始计算的，所以要+1
            int d = c.get(Calendar.DATE);
            System.out.println( y + "年" + m + "月" + d + "日");
        }

}
