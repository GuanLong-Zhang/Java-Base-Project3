package MapDemos;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//统计字符个数，利用Map特性去统计
public class MapDemo7 {
    public static void main(String[] args){
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        System.out.print("请输入一串字符：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){     //遍历字符串
            char k = s.charAt(i);
            Integer v = h.get(k);
            if(v == null){
                h.put(k, 1);
            }else{
                v++;
                h.put(k, v);
            }
        }

        StringBuilder st = new StringBuilder();
        Set<Character> se = h.keySet();
        for(Character k1 : se){
            Integer v1 = h.get(k1);
            st.append(k1).append("(").append(v1).append(")");
        }

        String str = st.toString();
        System.out.println(str);
    }
}
