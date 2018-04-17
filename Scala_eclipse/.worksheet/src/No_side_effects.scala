object No_side_effects {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(12); 
  var x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(41); 
  	//无副作用
		def xplusY_v1(y:Int) = x + y;System.out.println("""xplusY_v1: (y: Int)Int""");$skip(52); 
		//有副作用，对x产生影响
		def xplusY_v2(y:Int) = {x += y;x};System.out.println("""xplusY_v2: (y: Int)Int""")}
		//常量
		//val:immutable variable
  	//变量
		//var:mutable variable
		
}
