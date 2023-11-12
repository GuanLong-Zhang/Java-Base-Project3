package Arrays;
import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args){
        int [] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前的数组为:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后的数组为:" + Arrays.toString(arr));

    }

}

