object StreamDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); val res$0 = 
  //Stream is a lazy List
  1#::2#::3#::Stream.empty;System.out.println("""res0: scala.collection.immutable.Stream[Int] = """ + $show(res$0));$skip(40); 
  val stream = (1 to 10000000).toStream;System.out.println("""stream  : scala.collection.immutable.Stream[Int] = """ + $show(stream ));$skip(14); val res$1 = 
  stream.head;System.out.println("""res1: Int = """ + $show(res$1));$skip(29); val res$2 = 
  //只对2求值-流式编程
  stream.tail;System.out.println("""res2: scala.collection.immutable.Stream[Int] = """ + $show(res$2))}
}
