package Chapter1

/**
 * Created by Doraemon on 2018/8/8.
 * 数组测试类
 */

fun main(args: Array<String>) {

    val int_array : IntArray = intArrayOf(1,2,3,4)
    println(int_array.size)

    val float_array : FloatArray = floatArrayOf(3.0f,4.5f)
    println(float_array.size)

    val string_array : Array<String> = arrayOf("fizzer","Doraemon","Ariel")
    println(string_array[1])
}