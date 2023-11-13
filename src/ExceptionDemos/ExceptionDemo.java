package ExceptionDemos;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
//        method();
        method1();
        System.out.println("结束");
    }

    public static void method() {      //异常处理 try catch   采用异常处理之后，程序出现问题还可以正常运行下去
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);   //报错  ArrayIndexOutOfBoundsException  索引越界  运行时异常
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你访问的数组索引不存在");
//            System.out.println(e.getMessage());    //输出 Index 3 out of bounds for length 3
//            System.out.println(e.toString());      //输出 java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            e.printStackTrace();                   //输出 java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
                                                   //at ExceptionDemos.ExceptionDemo.method(ExceptionDemo.java:13)
                                                   //at ExceptionDemos.ExceptionDemo.main(ExceptionDemo.java:6)

        }
    }

    public static void method1() throws ArrayIndexOutOfBoundsException{    //抛出异常，并没有解决异常，代码不可以继续向下执行
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }
}

