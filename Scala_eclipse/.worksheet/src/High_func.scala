object High_func {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(302); 
	/*
	Scala语言支持
	1、把函数作为实参传递给另一个函数
	2、把函数作为返回值
	3、把函数赋值给变量
	4、把函数存储在数据结构里
	在Scala中，函数就像普通变量一样，可以应用到不同的地方，同样也具有函数的类型
	
	
	在Scala中，函数类型的格式为A=>B,表示一个接受类型A的参数，并返回类型B的函数
	例子：Int=>String是把整型映射为字符串的函数类型
	*/
	/*
	高阶函数
	用函数作为形参或返回值的函数，称为高阶函数
	*/
  def operate(f:(Int,Int)=>Int)={
    f(4,4)
	};System.out.println("""operate: (f: (Int, Int) => Int)Int""");$skip(21); val res$0 = 
	operate((x,y) => x);System.out.println("""res0: Int = """ + $show(res$0));$skip(52); 
	def grreting() = (name:String)=>{"hello"+" "+name};System.out.println("""grreting: ()String => String""");$skip(21); val res$1 = 
	grreting()("yiku ");System.out.println("""res1: String = """ + $show(res$1));$skip(237); 
	/*
	匿名函数
	匿名函数（Anonymous Function）,就是函数常量，也称为函数文字量（Function Literal）
	在Scala里，匿名函数的定义格式为
	   （形参列表）=>{函数体}
	*/
	//例子1: (x: Int) => x*x
  
	//例子2: (x: Int,y: Int) => x+y
	  
	//例子3:
	  
	var add = (x: Int,y: Int)=> x+y;System.out.println("""add  : (Int, Int) => Int = """ + $show(add ));$skip(26); val res$2 =  //add是一个具有函数类型的变量
	  
	add(1,2);System.out.println("""res2: Int = """ + $show(res$2));$skip(56);  //返回值：Int=3
	  
	def greeting() = (name:String) => {s"Hello $name"};System.out.println("""greeting: ()String => String""");$skip(25); val res$3 = 
	  
	greeting()("World");System.out.println("""res3: String = """ + $show(res$3));$skip(82); 
	  
	def greeting2(age: Int) = (name:String) => {s"Hello $name,your age is $age"};System.out.println("""greeting2: (age: Int)String => String""");$skip(29); val res$4 = 
	  
	greeting2(23)("Flygar");System.out.println("""res4: String = """ + $show(res$4));$skip(120); 
	
	/*
	Scala柯里化（Curried Function）
	把具有多个参数的函数转换为一条函数链，每个节点上是单一参数
	例如：以下两个add函数定义是等价的
	*/
	def add1(x:Int,y:Int) = x + y;System.out.println("""add1: (x: Int, y: Int)Int""");$skip(32); 
	def add2(x:Int)(y:Int) = x + y;System.out.println("""add2: (x: Int)(y: Int)Int""");$skip(65); 
	//Scala里柯里化的语法
	  
	//例子：
	def curriedAdd(a:Int)(b:Int) = a + b;System.out.println("""curriedAdd: (a: Int)(b: Int)Int""");$skip(18); val res$5 = 
	curriedAdd(2)(2);System.out.println("""res5: Int = """ + $show(res$5));$skip(34); 
	//4
	val addOne = curriedAdd(1)_;System.out.println("""addOne  : Int => Int = """ + $show(addOne ));$skip(34); val res$6 = 
	//Int=>Int 此功能实现了加一操作
	addOne(2);System.out.println("""res6: Int = """ + $show(res$6));$skip(161); 
	//3
	//在函数式编程中，可以运用柯里化特性来构造新的函数，而不需要重新定义新函数。
	
	/*递归函数
	递归函数在函数式编程中是实现循环的一种技术
	例子：计算n!
	*/
	def factorial(n:Int):Int =
    if(n<=0) 1
    else n*factorial(n-1);System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$7 = 
  factorial(3);System.out.println("""res7: Int = """ + $show(res$7));$skip(210); 
  /*
  	尾递归函数
    尾递归函数中所有的递归形式的调用都出现在函数的末尾。
    当编译器检测到一个函数调用是尾递归的时候，它就覆盖当前的活动记录而不是在栈中去创建一个新的。
  */
  //@annotation.tailrec ？？？
	def factorial2(n:Int,m:Int):Int =
	    if(n<=0) m
	    else factorial2(n-1,m*n);System.out.println("""factorial2: (n: Int, m: Int)Int""");$skip(21); val res$8 = 
	  
	factorial2(3,1);System.out.println("""res8: Int = """ + $show(res$8))}
	
}
