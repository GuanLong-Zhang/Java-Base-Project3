package CollectionDemos;

//接口实现类
public class Generic2Demo <T> implements Generic2<T>{    //实现

    @Override
    public void show(T t) {    //重写抽象方法
        System.out.println(t);
    }
}
