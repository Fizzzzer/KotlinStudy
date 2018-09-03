## Kotlin的程序结构

#### 分支表达式

* if-else表达式

	if-else语句判断选择表达式，这种写法与Java的写法是一致的
	
	但是if-else表达式同时还具有返回值
	
		val a = if(a>0) 1 else -1
		val a = if(a>0) 1   //错误，赋值时，分支必须具有完备性

* when表达式

	类似于Java中的switch表达式，且是加强版的switch，支持任意类型，与switch不同的是，他是不需要写break的。
	
		val b = 54
    	when (b) {
        	in 1..100 -> println("太小了")
        	101-> println("101大厦")
    	}
	
	
* 循环语句

	* for循环

		基本写法：
			
			for(element in elements){}
			
	* while 循环语法与用法与Java类似，这里就不做说明了
	* break 终止循环
	* continue 跳出当前循环
	* 多层循环需要跳出的话，可以使用@来指定标签，然后跳出指定的标签循环,写法如下

			outter@for(...){
				while(...){
					if(...){
						break @outter
					}
				}
			}
			
* try-catch语句

	与java类似，catch用来匹配错误的类型。与Java不同的是，try-catch语句也具有返回值，跟if一样
	
		val a = 3
		val b = 0
		val result = try{
			a / b
		}catch(...){
			0
		}finally{
			println("结束")
		}
		
	代码解释，定义result的值为a / b, 如果这个运算出错，那么result的值为0