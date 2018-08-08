## Kotlin的一些特殊运算符

#### 区间

区间表示的是一个范围，类似于数学概念上的区间，是`ClosedRange`的子类，`IntRange`最常用

* 基本的写法    
`0..100 `表示 [0,100]    
`0 until `100 表示[0,100)    
可以使用`in`操作来判断是否某个元素是否存在,也可以使用IntRange对象的`contains()`方法来判断

* 代码示例：

		val mRange: IntRange = 0..100
		val openRange: IntRange = 0 until 100
		println(50 in mRange)		//打印 true
		println(mRange.contains(500)) 		//打印false
		
		
#### 空类型

在Java中，经常会遇到NullPointerException空指针异常的情况，出现这种情况就是在调用对象的时候没有进行判空操作，但是在Kotlin中，对象为null的情况有着严格的限制，如果对象可能为空，在编码阶段就需要对其进行强制性的判空操作

`?`操作符，常用来跟在对象后面，表示该对象可能为空，在后面的编码过程中，需要对该对象进行强制的判空操作    
`!!`操作符，该操作符不推荐，表示你不关心该对象是否为空或者你可以很确定你调用的对象不可能为空，在调用这个操作符的时候，可能就会出现Java中的NullPointerException异常导致程序Crash掉    
`?:`Elvis操作符，其实可以理解为简化的判空操作。代码示例如下：    

	val name: String = getName() ?: "Fizzer"    //代码释义：声明一个String类型的变量，通过getName方法来获值，如果getName方法返回的值为null的时候，这时候，给name变量赋值Fizzer
	类似于Java片段
	String name = getName();
	if(name.isEmpty()){
		name = "Fizzer"
	}

#### 智能类型转换

在Kotlin中也有类似于Java的类型转换，使用的是`as` 关键字    
代码示例：  
   
	val sub: SubClass = parent as SubClass
	
这是Kotlin的类型转换代码示例，表示Parent类的对象转换成SubClass类，但是这种转换会出现跟Java一样的类转换异常ClassCastException

* 安全类型转换

	为了解决上述可能出现的类型转换异常的问题，Kotlin中引入的安全的类型转换机制，当出现类转换异常的时候，这时直接将sub对象赋值为null，而不是直接抛异常导致程序崩溃掉，而安全的类转换使用`as?`操作符    
	代码示例：
	
		val sub: SubClass = parent as? SubClass
		
	如果类转换失败的话，返回null，不抛异常
	
* 智能类型转换

	智能的类型转换是指，当程序通过前面的逻辑判断已经确定某个实例是某个对象，那么这个实例是不需要进行类型转换的    
	Java代码解释：    
	
		if（parent instanceof SubClass）{
			((SubClass)parent).getName();
		}
		
	以上代码是Java的写法，当判断parent是SubClass的一个实例后，在去调用SubClass类的getName方法，而在调用之前，依然对parent进行了类型的强制转换
	
	Kotlin代码示例：
	
		if(parent is SubClass){
			parent.getName();
		}

	也就是说，在Kotlin中，前面已经通过if语句判断了parent就是Subclass的一个实例，那么我在后面的调用的时候，是不需要再进行类型转换的，这就是智能类型转换
	
	###### Kotlin中使用`is`来判断是否为某个对象的实例，类似于Java的`instanceOf`关键字