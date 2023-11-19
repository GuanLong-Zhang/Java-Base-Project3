package File;
import java.io.File;

public class Recursion {
    public static void main(String[] args){
        System.out.println("方法一");
        test();
        System.out.println("----------------------------");

        System.out.println("方法二");
        System.out.println("不死神兔第二十个月的数量：" + test1(20));
        System.out.println("----------------------------");

        System.out.println("阶乘求解");
        int n = 5;
        System.out.println(n + "的阶乘为：" + test2(n));
        System.out.println("----------------------------");

        System.out.println("遍历目录");
        File srcf = new File("D:\\IDEA_Project_Java\\Java-Base-Project3\\src");
        test3(srcf);
        System.out.println("----------------------------");

    }

    public static void test(){
        int [] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("不死神兔第二十个月的数量：" + arr[arr.length - 1]);
    }

    public static int test1(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return test1(n - 1) + test1(n - 2);   //从第三个月开始才是前两个月之和，所以需要加判断
        }
    }

    public static long test2(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return test2(n - 1) * n;
        }
    }

    public static void test3(File srcf){
        File [] listFile = srcf.listFiles();
        if(listFile != null){
            for(File ls : listFile){
                if(ls.isDirectory()){     //是目录就递归，不是目录就输出绝对路径
                    test3(ls);
                }else{
                    System.out.println(ls.getAbsolutePath());
                }
            }
        }
    }

}
