package CollectionDemos;

public class GenericTest {
    public static void main(String[] args){
        Generic<String> g = new Generic<String>();
        g.setT("小明");
        System.out.println(g.getT());

        Generic<Integer> g1 = new Generic<Integer>();      //泛型类传入的基本类型，应该是基本类型包装类
        g1.setT(18);
        System.out.println(g1.getT());

        Generic<Boolean> g2 = new Generic<Boolean>();
        g2.setT(true);
        System.out.println(g2.getT());

    }
}
