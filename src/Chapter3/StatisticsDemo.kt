package Chapter3

/**
 * Created by Doraemon on 2018/9/4.
 * 统计Demo
 */

fun main(args: Array<String>) {

    readLineTest()
}

fun readLineTest(){
    println("请输入数字a")
    var a = readLine()!!.toInt()

    println("请输入数字b")
    var b = readLine()!!.toInt()

    print("两个数字的和是 a + b = ${a+b}")
}
