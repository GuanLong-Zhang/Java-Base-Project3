package CollectionDemos;

public class GenericTest2 {
    public static void main(String[] args){
        Generic2Demo<String> ge = new Generic2Demo<String>();
        ge.show("小明");

        Generic2Demo<Integer> ge1 = new Generic2Demo<Integer>();
        ge1.show(18);

        Generic2Demo<Boolean> ge2 = new Generic2Demo<Boolean>();
        ge2.show(true);

        Generic2Demo<Double> ge3 = new Generic2Demo<Double>();
        ge3.show(3.1415);

    }

}
