package Chapter9

/**
 * Created by Doraemon on 2018/11/21.
 * Kotlin泛型的使用
 */
fun main(args: Array<String>) {
    val a = Complex(3.0, 4.0)
    val b = Complex(4.0, 4.0)
    print(maxOf(a, b))

}

fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a > b) a else b
}