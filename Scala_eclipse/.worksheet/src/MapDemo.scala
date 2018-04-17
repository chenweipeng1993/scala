object MapDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
	val a: List[Int] = List( 1,2 , 3, 4);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(28); 
	val c = "x"::"y"::"z"::Nil;System.out.println("""c  : List[String] = """ + $show(c ));$skip(28); val res$0 = 
  c.map(x => x.toUpperCase);System.out.println("""res0: List[String] = """ + $show(res$0));$skip(22); val res$1 = 
	c.map(_.toUpperCase);System.out.println("""res1: List[String] = """ + $show(res$1));$skip(20); val res$2 = 
	a.filter(_%2 == 1);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(32); val res$3 = 
	a.filter(_%2 == 1).map(_ + 10);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(29); 
	val q = List(a,List(4,5,6));System.out.println("""q  : <error> = """ + $show(q ));$skip(28); val res$4 = 
	q.map(x=>x.filter(_%2==0));System.out.println("""res4: <error> = """ + $show(res$4));$skip(25); val res$5 = 
	q.map(_.filter(_%2==0));System.out.println("""res5: <error> = """ + $show(res$5));$skip(29); val res$6 = 
	q.flatMap(_.filter(_%2==0));System.out.println("""res6: <error> = """ + $show(res$6))}
	
}
