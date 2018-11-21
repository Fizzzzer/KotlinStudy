package Chapter9;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Doraemon on 2018/11/21.
 * Java泛型比较类
 */
public class ComplexJava implements Comparable<ComplexJava> {
    private double a;
    private double b;

    public ComplexJava(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }

    private double valueOf() {
        return a * a + b * b;
    }


    @Override
    public int compareTo(@NotNull ComplexJava o) {
        return (int) (valueOf() - o.valueOf());
    }
}
