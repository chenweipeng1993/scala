object TupleDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(33); val res$0 = 
  //元组
  (1,2);System.out.println("""res0: (Int, Int) = """ + $show(res$0));$skip(7); val res$1 = 
  1->2;System.out.println("""res1: (Int, Int) = """ + $show(res$1));$skip(26); val res$2 = 
  (1,"Alice","Math",95.5);System.out.println("""res2: (Int, String, String, Double) = """ + $show(res$2));$skip(32); 
  val t=(1,"Alice","Math",95.5);System.out.println("""t  : (Int, String, String, Double) = """ + $show(t ));$skip(7); val res$3 = 
  t._1;System.out.println("""res3: Int = """ + $show(res$3));$skip(7); val res$4 = 
  t._2;System.out.println("""res4: String = """ + $show(res$4));$skip(108); 
  def sumSq(in:List[Int]):(Int,Int,Int)= {
  	in.foldLeft((0,0,0))((t,v)=>(t._1+1,t._2 + v,t._3 + v*v))
  };System.out.println("""sumSq: (in: List[Int])(Int, Int, Int)""")}
  
}
