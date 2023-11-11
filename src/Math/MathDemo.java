package Math;

public class MathDemo {
    public static void main(String[] args){
        //abs  返回参数的绝对值
        System.out.println(Math.abs(88));    //88
        System.out.println(Math.abs(-88));   //88
        System.out.println("----------------");

        //ceil   返回大于或者等于参数的最小double值
        System.out.println(Math.ceil(12.13));   //13.0
        System.out.println(Math.ceil(12.45));   //13.0
        System.out.println("----------------");

        //floor 返回小于或者等于参数的最大double值
        System.out.println(Math.floor(12.13));   //12.0
        System.out.println(Math.floor(12.45));   //12.0
        System.out.println("----------------");

        //round 四舍五入 返回最接近的int值
        System.out.println(Math.round(3.1415));  //3
        System.out.println(Math.round(3.7879));  //4
        System.out.println("----------------");

        //max  返回两个数中的较大值 同种类型
        System.out.println(Math.max(3.14, 3.15));   //3.15
        System.out.println(Math.max(3, 4));         //4
        System.out.println("----------------");

        //min  返回两个数中的较小值 同种类型
        System.out.println(Math.min(3.14, 3.15));   //3.14
        System.out.println(Math.min(3, 4));         //3
        System.out.println("----------------");

        //pow  返回a的b的幂次
        System.out.println(Math.pow(2.0, 3.0));   //8.0
        System.out.println("----------------");

        //random  返回一个随机数 double [0.0,1.0)
        System.out.println(Math.random());
        System.out.println(Math.random() * 100);
        System.out.println((int)(Math.random() * 100));   //数据类型强制转换   0-99
        System.out.println("----------------");
    }
}
