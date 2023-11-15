package CollectionDemos;

public class Student1 {
    private String name;
    private int chinese;
    private int math;

    public Student1(String name, int chinese, int math){
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public int getMath(){
        return math;
    }

    public String getName(){
        return name;
    }

    public int getSum(){
        return chinese + math;
    }

    public void printStudent1(){
        System.out.println("name:" + getName() + "   " + "chinese:" + getChinese() + "   " + "math:" + getMath() + "   " + "Sum:" + getSum());
    }

}
