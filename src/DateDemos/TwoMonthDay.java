package DateDemos;
import java.util.Calendar;
import java.util.Scanner;

public class TwoMonthDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int y = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(y,2,1);           //设置日期为y年3月1日
        c.add(Calendar.DATE,-1);    //3月的第一天减去1，就是二月的最后一天
        System.out.println(y + "年的2月有" + printTwoMonth(c) + "天");
    }

    public static int printTwoMonth(Calendar c){
        int d = c.get(Calendar.DATE);
        return d;
    }
}
