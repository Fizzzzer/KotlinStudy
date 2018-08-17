package Chapter3

/**
 * Created by Doraemon on 2018/8/17.
 * Kotlin的运算符测试代码
 */

fun main(args: Array<String>) {

    var a = Man("Fizzer")
    var b = Man("Fizzer")

    println(a + b)  //答应Man类需要重写toString方法

    println(a on b)
}


class Man(var name: String){

    operator fun plus(mMan: Man): Man{
        return Man(mMan.name + name)
    }

    override fun toString(): String {
        return name
    }


    infix fun on(tmpName:Man): Boolean{

        return name == tmpName.name
    }
}
