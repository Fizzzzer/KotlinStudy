package Java;

import Chapter4.ExtendsKotlinKt;
import Chapter4.Version;

/**
 * Created by Doraemon on 2018/11/13.
 */
public class JavaTest {
    public static void main(String[] args){
        System.out.println(Version.INSTANCE.getVersionName());
        System.out.println(Version.INSTANCE.getName());

        System.out.println(ExtendsKotlinKt.toFizzer("hello "));
    }
}
