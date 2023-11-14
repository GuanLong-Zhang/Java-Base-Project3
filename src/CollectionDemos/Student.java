package CollectionDemos;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printStudent(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }

    //重写hashCode()方法实现每次返回的值相同
//    @Override
//    public int hashCode() {
//        return 0;
//    }

}
