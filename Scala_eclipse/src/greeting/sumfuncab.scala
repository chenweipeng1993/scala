package greeting

class sumfuncab {
    def sum(f:Int => Int)(a:Int)(b:Int) = {
      @annotation.tailrec
      def loop(n:Int,acc:Int):Int = {
        if(n > b){
          println(s"n=${n},ac=${acc}")
          acc
        }else{
          println(s"n=${n},ac=${acc}")
          loop(n+1,acc+f(n))
        }
      }
      loop(a,0)
    }
    
    sum(x => x)(1)(5)
}