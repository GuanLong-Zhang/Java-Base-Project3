package System;

public class SystemDemo {
    public static void main(String[] args){
        System.out.println("开始");
//        System.exit(0);      //终止执行
        System.out.println("结束");
        System.out.println("-------------");

        System.out.println(System.currentTimeMillis());
        System.out.println("-------------");

        System.out.println("现在距离1970年有" + System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");   //现在距离1970年的时间
        System.out.println("-------------");

        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "毫秒");
        System.out.println("-------------");

    }
}
