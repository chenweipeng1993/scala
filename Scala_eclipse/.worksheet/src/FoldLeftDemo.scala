object FoldLeftDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(39); 
  val a: List[Int] = List( 1,2 , 3, 4);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(65); val res$0 = 
  //foldLeft(Z:U)(op:(U,T)=>U)
  //_ = x=>x
  a.foldLeft(0)(_+_);System.out.println("""res0: Int = """ + $show(res$0));$skip(21); val res$1 = 
  a.foldLeft(1)(_*_);System.out.println("""res1: Int = """ + $show(res$1))}
}
