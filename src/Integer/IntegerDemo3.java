package Integer;

public class IntegerDemo3 {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);   //将 int 100 转换为了 Integer包装类
        Integer i1 = 100;    //自动装箱   将 int 100 转换为了 Integer包装类

        i1 = i1.intValue() + 200;   //intValue() 将 Integer 转为 int    进行自动装箱
        System.out.println(i1);
        i1 = i1 + 200;           //自动拆箱 + 自动装箱
        System.out.println(i1);

//        Integer i2 = null;
//        i2 = i2 + 300;      //报错  NullPointerException  因为是null所以进行自动拆箱的时候会报错
        Integer i2 = null;    //引用类型的使用，最好在使用的时候进行空指针的判断
        if (i2 != null) {
            i2 = i2 + 300;
        }
        System.out.println(i2);
    }
}
