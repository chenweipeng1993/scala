object sumfuncab {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(332); 
	//综合性例子
    def sum(f:Int => Int)(a:Int)(b:Int) = {
      @annotation.tailrec
      def loop(n:Int,acc:Int):Int = {
        if(n > b){
          println(s"n=${n},acc=${acc}")
          acc
        }else{
          println(s"n=${n},acc=${acc}")
          loop(n+1,acc+f(n))
        }
      }
      loop(a,0)
    };System.out.println("""sum: (f: Int => Int)(a: Int)(b: Int)Int""");$skip(27); val res$0 = 
    
    sum(x => x)(1)(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); val res$1 = 
    sum(x => 1)(1)(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(26); val res$2 = 
    sum(x => x * x)(1)(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(30); val res$3 = 
    sum(x => x * x * x)(1)(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(49); 
    //定义通配符
    var sumSquare = sum(x => x * x)_;System.out.println("""sumSquare  : Int => (Int => Int) = """ + $show(sumSquare ));$skip(20); val res$4 = 
    sumSquare(1)(5);System.out.println("""res4: Int = """ + $show(res$4))}
}
