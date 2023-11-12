package Integer;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        System.out.println(i);
        System.out.println("-------------");
        Integer i1 = Integer.valueOf("100");
        System.out.println(i1);
        System.out.println("-------------");
//        Integer i2 = Integer.valueOf("abc");   //报错 只能传数字的字符串
//        System.out.println(i2);

        int number = 100;
        String s = String.valueOf(number);    //int 转 String
        System.out.println(s);
        System.out.println("-------------");

        int a = Integer.parseInt(s);          //String 转 int
        System.out.println(a);
        System.out.println("-------------");

    }
}
