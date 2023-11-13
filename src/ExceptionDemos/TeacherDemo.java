package ExceptionDemos;
import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个分数：");
        int score = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.cheakScore(score);           //cheakScore只是抛出异常，并没有对异常进行处理，所以需要用try   catch进行包围
        } catch (ScoreException e) {
            throw new RuntimeException(e);
        }
    }
}
