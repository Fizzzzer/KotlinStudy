## Kotlin入门----什么是Kotlin

 Kotlin是一门可以运行在java虚拟机、Android、浏览器上的静态语言，与
 Java100%的兼容
 
#### Kotlin的基本数据类型
* Boolean类型
	
		val bol: Boolean = true
		val otherbol: Boolean = false

* Number类型

	Kolitn中Number类型主要分为浮点型和整形
	
	* 浮点型

			Double ： 64位
			Float ： 32位
			
	* 整型
	
			Long ： 64位
			Int ： 32位
			Short ： 16 位
			
	* 字节
	
			Byte ： 8 位

	代码声明示例：
	
		val mInt: Int = 9
		val mFloat: Float = 9.0F
		val mDouble: Double = 9.0

	###### 在Kotlin中，并没有装箱与拆箱过程，这一点跟Java不同
	
* Char类型

	表示字符类型，用`''`引用起来，例如`'a'`、`'\n'`。占两个字节     
	代码声明示例：
	
		val aChar: Char = 'a'
		val nChar: Char = '\n'
	
* 字符串类型

	字符串用`""`表示，声明示例：` val name: String = "Fizzer"`
	* 字符串的比较    
		Kotlin的字符使用`==`来进行比较，效果类似于Java中的equals方法，但是如果要比较这两个对象是否一样，则使用`===`来进行比较
		
	* 字符串模板    
		字符串模板使用`$`符号来表示，用于拼接、格式化字符串    
		代码示例：    
		
			val a: Int = 8
			val b: Int = 3
			println("$a + $b = ${a + b}")
		
			
				
	
