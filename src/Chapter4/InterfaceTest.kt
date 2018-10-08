package Chapter4

/**
 * Created by Doraemon on 2018/9/5.
 *
 */

interface Animal {
    fun speak()
}

class Dog : Animal {
    override fun speak() {
        println("汪。。汪汪。。")
    }
}

class Cat : Animal {
    override fun speak() {
        println("喵。。喵🐱")
    }
}

class Man : Animal {
    override fun speak() {
        println("你好")
    }

    fun supAnimal(animal: Animal) {
        animal.speak()
    }
}

fun main(args: Array<String>) {
    Man().supAnimal(Cat())
    Man().supAnimal(Dog())
}