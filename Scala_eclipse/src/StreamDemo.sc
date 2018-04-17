object StreamDemo {
  //Stream is a lazy List
  1#::2#::3#::Stream.empty                        //> res0: scala.collection.immutable.Stream[Int] = Stream(1, ?)
  val stream = (1 to 10000000).toStream           //> stream  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
  stream.head                                     //> res1: Int = 1
  //只对2求值-流式编程
  stream.tail                                     //> res2: scala.collection.immutable.Stream[Int] = Stream(2, ?)
}