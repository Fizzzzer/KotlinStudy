package Chapter4

/**
 * Created by Doraemon on 2018/11/13.
 */
class overload {
    fun a(): Int {
        return 0
    }

    fun a(str: String): Int {
        return str.length
    }
}

fun main(args: Array<String>) {
    val ov = overload()
    println(ov.a())
    println(ov.a("Fizzer"))

}