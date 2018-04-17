object func_example{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
  
		def hello(name:String):String = {
		  
			s"Hello,${name}"
		  
		};System.out.println("""hello: (name: String)String""");$skip(28); val res$0 = 
		  
		hello("ChenWeiPeng");System.out.println("""res0: String = """ + $show(res$0));$skip(36); 
		  
		def add(x:Int,y:Int) = x + y;System.out.println("""add: (x: Int, y: Int)Int""");$skip(73); val res$1 = 
		  
		//if表达式
		//if(logical_exp) valA else valB
  
		if(true) 1 else 2;System.out.println("""res1: Int = """ + $show(res$1));$skip(26); val res$2 = 
		  
		if(false) 3 else 4;System.out.println("""res2: Int = """ + $show(res$2));$skip(17); 
		  
		val a = 1;System.out.println("""a  : Int = """ + $show(a ));$skip(18); val res$3 = 
		  
		if(a==1) a;System.out.println("""res3: AnyVal = """ + $show(res$3));$skip(26); val res$4 = 
		  
		if(a!=1) "not one";System.out.println("""res4: Any = """ + $show(res$4));$skip(33); val res$5 = 
		  
		if(a!=1) "not one" else a;System.out.println("""res5: Any = """ + $show(res$5));$skip(44); 
		
		
		val l = List("alice","bob","cathy");System.out.println("""l  : List[String] = """ + $show(l ));$skip(54); 
  
		for(
		  
			s<-l  //遍历List集合
		  
		)println(s);$skip(66); 
		  
		for{
		  
			s<-l
		  
		if(s.length>3)
		  
		}println(s);$skip(107); 
		  
		val result_for = for{
		  
			s<-l
		  
			s1 = s.toUpperCase()
		  
		if(s1!="")
		  
		}yield(s1);System.out.println("""result_for  : List[String] = """ + $show(result_for ));$skip(202); val res$6 = 
		  
		//result_for:List[String] = List(ALICE,BOB,CATHY)
		
		try{
  
		Integer.parseInt("dog")
		  
		}catch{
		  
		case _=>0
		//下划线是通配符
		  
		}finally{
		  
		println("always be printed")
		  
		};System.out.println("""res6: Int = """ + $show(res$6));$skip(140); 
    /*exp match{//主要用在pattern match中
		    case p1 => val1
		    case p2 => val2
		    ...
		    case _ => valn
		}*/
		
		var code:Int = 2;System.out.println("""code  : Int = """ + $show(code ));$skip(87); val res$7 = 
		code match{
		    case 1 => "one"
		    case 2 => "two"
		    case _ => "others"
		};System.out.println("""res7: String = """ + $show(res$7));$skip(64); 
		//"_"通配所有对象，相当于java里的default
		
		def foo_by_value(x:Int) = x;System.out.println("""foo_by_value: (x: Int)Int""")}
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
