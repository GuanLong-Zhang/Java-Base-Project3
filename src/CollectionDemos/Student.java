package CollectionDemos;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printStudent(){
        System.out.println("name:" + name + "   " + "age:" + age);
    }

    //重写hashCode()方法实现每次返回的值相同
//    @Override
//    public int hashCode() {
//        return 0;
//    }

    //对于自定义数据类型要存储在HashSet集合中，就需要对equals()  hashCode()方法进行重写，这样才不会有重复的元素存储在HashSet中
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    //重写compareTo方法
    @Override
    public int compareTo(Student o) {
//        return 0;
//        return 1;     //按照添加的顺序，顺序输出
//        return -1;    //按照添加的顺序，逆序输出
        int num = this.age - o.age;     //想升序排序 this放前面   想降序排序 this放后面
        int num2 = num == 0 ? this.name.compareTo(o.name):num;
        return num2;
    }

}
