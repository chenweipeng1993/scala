object TupleDemo {
  //元组
  (1,2)                                           //> res0: (Int, Int) = (1,2)
  1->2                                            //> res1: (Int, Int) = (1,2)
  (1,"Alice","Math",95.5)                         //> res2: (Int, String, String, Double) = (1,Alice,Math,95.5)
  val t=(1,"Alice","Math",95.5)                   //> t  : (Int, String, String, Double) = (1,Alice,Math,95.5)
  t._1                                            //> res3: Int = 1
  t._2                                            //> res4: String = Alice
  def sumSq(in:List[Int]):(Int,Int,Int)= {
  	in.foldLeft((0,0,0))((t,v)=>(t._1+1,t._2 + v,t._3 + v*v))
  }                                               //> sumSq: (in: List[Int])(Int, Int, Int)
  
}