package CollectionDemos;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

//输出1-20的10个不重复的随机整数
public class SetDemo1 {
    public static void main(String[] args){
//        Set<Integer> s = new HashSet<Integer>();   //乱序输出
        Set<Integer> s = new TreeSet<Integer>();     //按照排序规则输出   默认升序
        Random r = new Random();

        while(s.size() < 10){
            int i = r.nextInt(20) + 1;  //0-19  所以要+1
            s.add(i);
        }

        //增强for遍历
        for(Integer i : s){
            System.out.println(i);
        }

    }
}
