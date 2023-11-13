package ExceptionDemos;

//自定义异常
public class ScoreException extends Exception{
    public ScoreException(){}
    public ScoreException(String message){
        super(message);              //调用父类的带参构造方法
    }
}
