package Chapter4

/**
 * Created by Doraemon on 2018/11/13.
 */

fun main(args: Array<String>) {
    val msg = "abc"
    println(msg.toFizzer())
    println(3.plusme(3))
}

fun String.toFizzer(): String {
    return this + "Fizzer"
}

fun Int.plusme(b: Int): Int {
    return this + (b * 2)
}