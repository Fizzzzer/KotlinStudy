package Chapter3

/**
 * Created by Doraemon on 2018/9/3.
 */
fun main(args: Array<String>) {

//    TestWhen()
//    TestWhile(5)
    TestLopper()
}

fun TestIf() {
    val fizzer = 0
    val a = if (fizzer > 0) 1 else -1
    println(a)
}

fun TestWhen() {
    val b = 54
    when (b) {
        in 1..100 -> println("太小了")
        101 -> println("101大厦")
    }
}

fun TestWhile(start: Int) {

    var start = start

    while (start > 0) {
        println("start现在的值是$start")
        start--

    }

}

fun TestLopper() {
    outter@ for (a in 1..10) {
        inner@ for (b in 1..10) {
            print("$b * $a = ${a * b}  ")
            if (b > a) {

                break@outter
            }
        }
    }
}