object ReduceLeftDemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val a: List[Int] = List( 1,2 , 3, 4)            //> a  : List[Int] = List(1, 2, 3, 4)
  //reduceLeft(op:(T,T)=>T)
  a.reduceLeft((x,y)=>x+y)                        //> res0: Int = 10
  a.reduceLeft( _ + _ )                           //> res1: Int = 10
  
}