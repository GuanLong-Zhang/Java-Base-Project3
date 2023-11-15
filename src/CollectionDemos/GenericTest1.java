package CollectionDemos;

public class GenericTest1 {
    public static void main(String[] args){
        Generic1 g = new Generic1();    //不指定类型
        g.show("小明");
        g.show(18);
        g.show(true);
        g.show(3.1415);

    }
}
