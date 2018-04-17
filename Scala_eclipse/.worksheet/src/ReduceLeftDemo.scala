object ReduceLeftDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
  println("Welcome to the Scala worksheet");$skip(39); 
  val a: List[Int] = List( 1,2 , 3, 4);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(55); val res$0 = 
  //reduceLeft(op:(T,T)=>T)
  a.reduceLeft((x,y)=>x+y);System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
  a.reduceLeft( _ + _ );System.out.println("""res1: Int = """ + $show(res$1))}
  
}
