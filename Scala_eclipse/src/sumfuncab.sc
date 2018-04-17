object sumfuncab {
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
    }                                             //> sum: (f: Int => Int)(a: Int)(b: Int)Int
    
    sum(x => x)(1)(5)                             //> n=1,acc=0
                                                  //| n=2,acc=1
                                                  //| n=3,acc=3
                                                  //| n=4,acc=6
                                                  //| n=5,acc=10
                                                  //| n=6,acc=15
                                                  //| res0: Int = 15
    sum(x => 1)(1)(5)                             //> n=1,acc=0
                                                  //| n=2,acc=1
                                                  //| n=3,acc=2
                                                  //| n=4,acc=3
                                                  //| n=5,acc=4
                                                  //| n=6,acc=5
                                                  //| res1: Int = 5
    sum(x => x * x)(1)(5)                         //> n=1,acc=0
                                                  //| n=2,acc=1
                                                  //| n=3,acc=5
                                                  //| n=4,acc=14
                                                  //| n=5,acc=30
                                                  //| n=6,acc=55
                                                  //| res2: Int = 55
    sum(x => x * x * x)(1)(5)                     //> n=1,acc=0
                                                  //| n=2,acc=1
                                                  //| n=3,acc=9
                                                  //| n=4,acc=36
                                                  //| n=5,acc=100
                                                  //| n=6,acc=225
                                                  //| res3: Int = 225
    //定义通配符
    var sumSquare = sum(x => x * x)_              //> sumSquare  : Int => (Int => Int) = sumfuncab$$$Lambda$14/509886383@6e8dacdf
                                                  //| 
    sumSquare(1)(5)                               //> n=1,acc=0
                                                  //| n=2,acc=1
                                                  //| n=3,acc=5
                                                  //| n=4,acc=14
                                                  //| n=5,acc=30
                                                  //| n=6,acc=55
                                                  //| res4: Int = 55
}