object ListDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  val a: List[Int] = List( 1,2 , 3, 4);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(15); 
  val b = 0::a;System.out.println("""b  : List[Int] = """ + $show(b ));$skip(29); 
  val c = "x"::"y"::"z"::Nil;System.out.println("""c  : List[String] = """ + $show(c ));$skip(53); 
	//"z"::Nil
	//"y"::res0
	//"x"::res1
	val d = a:::c;System.out.println("""d  : List[Any] = """ + $show(d ));$skip(8); val res$0 = 
	a.head;System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
	d.head;System.out.println("""res1: Any = """ + $show(res$1));$skip(8); val res$2 = 
	c.head;System.out.println("""res2: String = """ + $show(res$2));$skip(28); val res$3 = 
	//返回除了第一个元素之外的元素列表
	a.tail;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(8); val res$4 = 
	c.tail;System.out.println("""res4: List[String] = """ + $show(res$4));$skip(11); val res$5 = 
	a.isEmpty;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(13); val res$6 = 
	Nil.isEmpty;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(115); 
	def walkthru(l:List[Int]):String = {
    if(l.isEmpty) ""
    else l.head.toString + " " + walkthru(l.tail)
    };System.out.println("""walkthru: (l: List[Int])String""");$skip(13); val res$7 = 
	walkthru(a);System.out.println("""res7: String = """ + $show(res$7));$skip(49); val res$8 = 
	//filter会遍历列表，然后通过匿名函数筛选
	a.filter(x => x%2==1);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(26); val res$9 = 
	"99 Red Balloons".toList;System.out.println("""res9: List[Char] = """ + $show(res$9));$skip(60); val res$10 = 
	"99 Red Balloons".toList.filter(x => Character.isDigit(x));System.out.println("""res10: List[Char] = """ + $show(res$10));$skip(49); val res$11 = 
	"99 Red Balloons".toList.takeWhile(x => x!='B');System.out.println("""res11: List[Char] = """ + $show(res$11))}

}
