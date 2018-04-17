package greeting

object greeting extends App {
  println("hello world "+args(0)+"!")
  @annotation.tailrec
	def factorial2(n:Int,m:Int):Int =
	    if(n<=0) m
	    else factorial2(n-1,m*n)
	  
	factorial2(3,1)
}