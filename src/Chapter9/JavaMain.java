package Chapter9;

/**
 * Created by Doraemon on 2018/11/21.
 * Java泛型的复习
 */
public class JavaMain {
    public static void main(String[] args) {
        ComplexJava a = new ComplexJava(6, 4);
        ComplexJava b = new ComplexJava(4, 5);
        System.out.println(maxOf(a, b));

    }

    public static <T extends Comparable<T>> T maxOf(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
