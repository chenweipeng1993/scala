object High_func {
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
	}                                         //> operate: (f: (Int, Int) => Int)Int
	operate((x,y) => x)                       //> res0: Int = 4
	def grreting() = (name:String)=>{"hello"+" "+name}
                                                  //> grreting: ()String => String
	grreting()("yiku ")                       //> res1: String = "hello yiku "
	/*
	匿名函数
	匿名函数（Anonymous Function）,就是函数常量，也称为函数文字量（Function Literal）
	在Scala里，匿名函数的定义格式为
	   （形参列表）=>{函数体}
	*/
	//例子1: (x: Int) => x*x
  
	//例子2: (x: Int,y: Int) => x+y
	  
	//例子3:
	  
	var add = (x: Int,y: Int)=> x+y //add是一个具有函数类型的变量
                                                  //> add  : (Int, Int) => Int = High_func$$$Lambda$10/1277181601@27f674d
	  
	add(1,2) //返回值：Int=3                      //> res2: Int = 3
	  
	def greeting() = (name:String) => {s"Hello $name"}
                                                  //> greeting: ()String => String
	  
	greeting()("World")                       //> res3: String = Hello World
	  
	def greeting2(age: Int) = (name:String) => {s"Hello $name,your age is $age"}
                                                  //> greeting2: (age: Int)String => String
	  
	greeting2(23)("Flygar")                   //> res4: String = Hello Flygar,your age is 23
	
	/*
	Scala柯里化（Curried Function）
	把具有多个参数的函数转换为一条函数链，每个节点上是单一参数
	例如：以下两个add函数定义是等价的
	*/
	def add1(x:Int,y:Int) = x + y             //> add1: (x: Int, y: Int)Int
	def add2(x:Int)(y:Int) = x + y            //> add2: (x: Int)(y: Int)Int
	//Scala里柯里化的语法
	  
	//例子：
	def curriedAdd(a:Int)(b:Int) = a + b      //> curriedAdd: (a: Int)(b: Int)Int
	curriedAdd(2)(2)                          //> res5: Int = 4
	//4
	val addOne = curriedAdd(1)_               //> addOne  : Int => Int = High_func$$$Lambda$14/1740000325@4411d970
	//Int=>Int 此功能实现了加一操作
	addOne(2)                                 //> res6: Int = 3
	//3
	//在函数式编程中，可以运用柯里化特性来构造新的函数，而不需要重新定义新函数。
	
	/*递归函数
	递归函数在函数式编程中是实现循环的一种技术
	例子：计算n!
	*/
	def factorial(n:Int):Int =
    if(n<=0) 1
    else n*factorial(n-1)                         //> factorial: (n: Int)Int
  factorial(3)                                    //> res7: Int = 6
  /*
  	尾递归函数
    尾递归函数中所有的递归形式的调用都出现在函数的末尾。
    当编译器检测到一个函数调用是尾递归的时候，它就覆盖当前的活动记录而不是在栈中去创建一个新的。
  */
  //@annotation.tailrec ？？？
	def factorial2(n:Int,m:Int):Int =
	    if(n<=0) m
	    else factorial2(n-1,m*n)              //> factorial2: (n: Int, m: Int)Int
	  
	factorial2(3,1)                           //> res8: Int = 6
	
}