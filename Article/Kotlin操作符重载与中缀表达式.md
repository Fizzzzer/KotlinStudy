## Kotlin的操作符重载与中缀表达式

#### Kotlin 的基本操作运算符

与Java不同的是，Kotlin是允许任意类来定义或者重载父类的运算符的，通过运算符对应的具名函数来定义。在定义运算符函数的时候，对函数的参数个数是做要求的，也就是说，对应的具名函数传几个参数，那么你重载的函数就要相应的是几个参数；但是对函数的返回类型是不做要求的，你可以返回任意你想返回的参数类型。

用于实现操作符重载的函数应该使用 `operator` 修饰符进行标记

操作符的重载文档详情可以参见官方文档 [【Kotlin操作符重载】](http://www.liying-cn.net/kotlin/docs/reference/operator-overloading.html)

下面贴出一段代码示例：

	//这里声明了一个类Man，定义了一个成员变量name，通过重载 "+" 号操作符，来实现姓名的拼接
	class Man(var name: String){

	    operator fun plus(mMan: Man): Man{
	        return Man(mMan.name + name)
	    }
	
	    override fun toString(): String {
	        return name
	    }
	}

下面是使用示例：

	var a = Man("Fizzer")
	var b = Man("Doraemon")
	
	println(a+b) 	//通过重载的“+”运算符，这里的打印结果为FizzerDoraemon
	
	
#### Kotlin的中缀表达式

使用`infix`关键字标记的函数,使用中缀标记法标记的函数在调用的时候可以省略点号和括号

中缀函数需要满足以下条件:

* 必须是成员函数或者扩展函数
* 必须只有单个参数
* 参数不能是不定量参数，而且不能有默认值

代码示例：

	infix fun on(tmpMan: Man): Boolean{
		return name == tmpName.name		//定义了一个中缀表达式on，来比较两个Man对象的name是否相等
	}

在调用的时候就不需要Man().on()这样去调用了，下面是调用示例

	var a = Man("Fizzer")
	var b = Man("Doraemon")
	println(a on b)	//这里打印 false
	
以上就是中缀表达式的用法，更多详情参见官方文档[【中缀标记法】](http://www.liying-cn.net/kotlin/docs/reference/functions.html#infix-notation)

