object RangeDemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //闭区间>= and <=
  1 to 10 by 2                                    //> res0: scala.collection.immutable.Range = inexact Range 1 to 10 by 2
  (1 to 10).toList                                //> res1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  //上开区间>= and <
  1 until 10                                      //> res2: scala.collection.immutable.Range = Range 1 until 10
}