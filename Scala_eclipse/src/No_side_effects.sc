object No_side_effects {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var x = 1                                       //> x  : Int = 1
  	//无副作用
		def xplusY_v1(y:Int) = x + y      //> xplusY_v1: (y: Int)Int
		//有副作用，对x产生影响
		def xplusY_v2(y:Int) = {x += y;x} //> xplusY_v2: (y: Int)Int
		//常量
		//val:immutable variable
  	//变量
		//var:mutable variable
		
}