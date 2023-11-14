package CollectionDemos;

public class HashDemo {
    public static void main(String[] args){
        Student s = new Student("小明", 18);
        System.out.println(s.hashCode());     //获取对象的哈希码   输出793589513
        System.out.println(s.hashCode());     //两次结果都相同   同一对象的哈希值是相同的
        Student s1 = new Student("小明", 18);   //输出1313922862    默认情况下不同对象的哈希值是不同的
        System.out.println(s1.hashCode());
        System.out.println("------------------");

        System.out.println("hello".hashCode());    //输出99162322
        System.out.println("javac".hashCode());    //输出100899457
        System.out.println("java".hashCode());     //输出3254818
        System.out.println("hello".hashCode());    //输出99162322
        System.out.println("------------------");

        System.out.println("你好".hashCode());      //输出652829
        System.out.println("未来".hashCode());      //输出845179
        System.out.println("------------------");


    }
}
