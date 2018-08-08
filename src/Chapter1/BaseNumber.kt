package Chapter1

/**
 * Created by Doraemon on 2018/8/7.
 * Kotlin学习基础
 */

fun main(args: Array<String>) {
//    BooleanTest()
//    NumberTest()
//    ChatTest()
//    StringTest()
    rangeTest()
}

fun printStr(str: String) {
    println(str)
}

fun BooleanTest() {
    val boolTrue: Boolean = true
    val boolFalse: Boolean = false


    println(boolTrue)

    println(boolFalse)

}

fun NumberTest() {
    val maxInt: Int = Int.MAX_VALUE
    val minInt: Int = Int.MIN_VALUE
    val float: Float = 9.0F
    val double: Double = 9.0

    println(maxInt)
    print(minInt)
    println(Math.PI)
}

fun ChatTest() {
    val aChar: Char = 'a'
    val nChar: Char = '\n'
    println(aChar)
    println(nChar)
}

fun StringTest() {
    val name: String = "Fizzer"
    val birth: String = "1991"
    println(name)

    println(name == birth)

    println(name === birth)

    val a: Int = 4
    val b: Int = 5
    println("$a + $b = ${a + b}")

    println("$name 的出生日期是 $birth")

    println("" + a)

    println(name + birth)
}

fun rangeTest(){
    val mRange: IntRange = 0..10
    println(""+mRange.start+ "====" + mRange.last)

    val mopenRange: IntRange = 0 until 10
    println(""+mopenRange.start+ "====" + mopenRange.last)

    println(4 in mRange)

    println(mRange.contains(40))
}