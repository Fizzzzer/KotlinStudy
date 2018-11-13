package Chapter4

/**
 * Created by Doraemon on 2018/11/13.
 */

interface verimpl{
    fun getVersionName():String
}
object Version: verimpl{
    override fun getVersionName(): String {
        return "Fizzer"
    }

    fun getName():String{
        return "Fizzer Name"
    }
}

fun main(args: Array<String>) {
    println(Version.getVersionName())
    println(Version.getName())
}