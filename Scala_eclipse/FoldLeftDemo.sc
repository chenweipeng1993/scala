object FoldLeftDemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val a: List[Int] = List( 1,2 , 3, 4)            //> a  : List[Int] = List(1, 2, 3, 4)
  //foldLeft(Z:U)(op:(U,T)=>U)
  //_ = x=>x
  a.foldLeft(0)(_+_)                              //> res0: Int = 10
  a.foldLeft(1)(_*_)                              //> res1: Int = 24
}