object func_example{
  
		def hello(name:String):String = {
		  
			s"Hello,${name}"
		  
		}                                 //> hello: (name: String)String
		  
		hello("ChenWeiPeng")              //> res0: String = Hello,ChenWeiPeng
		  
		def add(x:Int,y:Int) = x + y      //> add: (x: Int, y: Int)Int
		  
		//if表达式
		//if(logical_exp) valA else valB
  
		if(true) 1 else 2                 //> res1: Int = 1
		  
		if(false) 3 else 4                //> res2: Int = 4
		  
		val a = 1                         //> a  : Int = 1
		  
		if(a==1) a                        //> res3: AnyVal = 1
		  
		if(a!=1) "not one"                //> res4: Any = ()
		  
		if(a!=1) "not one" else a         //> res5: Any = 1
		
		
		val l = List("alice","bob","cathy")
                                                  //> l  : List[String] = List(alice, bob, cathy)
  
		for(
		  
			s<-l  //遍历List集合
		  
		)println(s)                       //> alice
                                                  //| bob
                                                  //| cathy
		  
		for{
		  
			s<-l
		  
		if(s.length>3)
		  
		}println(s)                       //> alice
                                                  //| cathy
		  
		val result_for = for{
		  
			s<-l
		  
			s1 = s.toUpperCase()
		  
		if(s1!="")
		  
		}yield(s1)                        //> result_for  : List[String] = List(ALICE, BOB, CATHY)
		  
		//result_for:List[String] = List(ALICE,BOB,CATHY)
		
		try{
  
		Integer.parseInt("dog")
		  
		}catch{
		  
		case _=>0
		//下划线是通配符
		  
		}finally{
		  
		println("always be printed")
		  
		}                                 //> always be printed
                                                  //| res6: Int = 0
    /*exp match{//主要用在pattern match中
		    case p1 => val1
		    case p2 => val2
		    ...
		    case _ => valn
		}*/
		
		var code:Int = 2                  //> code  : Int = 2
		code match{
		    case 1 => "one"
		    case 2 => "two"
		    case _ => "others"
		}                                 //> res7: String = two
		//"_"通配所有对象，相当于java里的default
		
		def foo_by_value(x:Int) = x       //> foo_by_value: (x: Int)Int
		//call by value
		//def fooByName(x:=>Int) = x
		//call by name
		  
		  
		//def bar1(x:Int,y:=>Int) = 1
		//bar:(x:Int,y:=>Int)Int
		  
		//def loop():Int = loop
		//loop:()Int
		  
		//bar(1,loop)
		//res0:Int = 1
		  
		//bar(loop,1)
		//因为需要先计算出loop,才能继续下一步。由于loop是死循环，所以该函数进入死循环
}