object RangeDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(32); val res$0 = 
  //闭区间>= and <=
  1 to 10 by 2;System.out.println("""res0: scala.collection.immutable.Range = """ + $show(res$0));$skip(19); val res$1 = 
  (1 to 10).toList;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(30); val res$2 = 
  //上开区间>= and <
  1 until 10;System.out.println("""res2: scala.collection.immutable.Range = """ + $show(res$2))}
}
