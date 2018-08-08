package Chapter1;

/**
 * Created by Doraemon on 2018/8/8.
 */
public class SubClass extends ParentClass{
    public String getName(){
        return "Fizzer";
    }

    public void show(){
        System.out.print("你好，这里是子类的方法");
    }
}
