package Arrays;

public class ArraysDemo {
    public static void main(String[] args){
        int [] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前的数组为:" + arrToString(arr));
        System.out.println("排序后的数组为:" + arrToString(bubbleSort(arr)));

    }

    public static String arrToString(int [] arr){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                s.append(arr[i] + ",");
            }
            else{
                s.append(arr[i]);
            }
        }
        s.append("]");
        String s1 = s.toString();
        return s1;
    }

    public static int [] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
