package CollectionDemos;

//可变参数
public class VariableParameters {
    public static void main(String[] args){
        System.out.println("求和结果为：" + sum(10, 20));
        System.out.println("求和结果为：" + sum(10, 20, 30));
        System.out.println("求和结果为：" + sum(10, 20, 30, 40));
        System.out.println("求和结果为：" + sum(10, 20, 30, 40, 50));
    }

    public static int sum(int ... a){
//        System.out.println(a);    //输出[I@b4c966a  表示a是一个数组，就是将参数全部放到一个数组里面
//        return 0;
        int sum = 0;
        for(int i : a){
            sum = sum + i;
        }
        return sum;
    }

}
