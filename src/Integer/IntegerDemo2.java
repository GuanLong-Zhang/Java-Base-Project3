package Integer;
import java.util.Arrays;

public class IntegerDemo2 {
    public static void main(String[] args) {
        String s = "27 28 29 41 18";
        System.out.println("排序前的字符串：" + s);
        String [] s1 = s.split(" ");    //将字符串进行分割，然后将其存在字符串数组里面
        int [] arr = new int[s1.length];      //动态开辟数组
        for (int i = 0; i < s1.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);   //String 转 int
        }
        Arrays.sort(arr);    //对整型数组进行排序
        StringBuilder s2 = new StringBuilder(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s2.append(arr[i]);
            }
            else {
                s2.append(arr[i] + " ");
            }
        }
        String s3 = s2.toString();     //将 StringBuilder 转 String
        System.out.println("排序后的字符串：" + s3);
    }

}
