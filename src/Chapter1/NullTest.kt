package Chapter1

/**
 * Created by Doraemon on 2018/8/8.
 *
 */
fun main(args: Array<String>) {

    val name: String = getName() ?: "Fizzer"
    println(name)

    val age: String? = "19"
    println(age!!.length)

    SmartCastTest()
}

fun getName(): String? {

    return null
}

/**
 * 智能类型转换测试代码
 */
fun SmartCastTest() {

    val parent: ParentClass = SubClass()
    if(parent is SubClass){
        parent.show()
    }
}