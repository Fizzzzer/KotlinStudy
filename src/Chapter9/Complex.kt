package Chapter9

/**
 * Created by Doraemon on 2018/11/21.
 * 自定义的泛型比较类
 */
data class Complex(val a: Double, val b: Double) : Comparable<Complex> {
    override fun compareTo(other: Complex): Int {
        return (valueof() - other.valueof()).toInt()
    }

    fun valueof(): Double {
        return a * a + b * b
    }

    override fun toString(): String {
        return ("$a + ${b}i")
    }

}