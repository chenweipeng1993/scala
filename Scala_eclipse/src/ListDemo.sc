object ListDemo {
  val a: List[Int] = List( 1,2 , 3, 4)            //> a  : List[Int] = List(1, 2, 3, 4)
  val b = 0::a                                    //> b  : List[Int] = List(0, 1, 2, 3, 4)
  val c = "x"::"y"::"z"::Nil                      //> c  : List[String] = List(x, y, z)
	//"z"::Nil
	//"y"::res0
	//"x"::res1
	val d = a:::c                             //> d  : List[Any] = List(1, 2, 3, 4, x, y, z)
	a.head                                    //> res0: Int = 1
	d.head                                    //> res1: Any = 1
	c.head                                    //> res2: String = x
	//返回除了第一个元素之外的元素列表
	a.tail                                    //> res3: List[Int] = List(2, 3, 4)
	c.tail                                    //> res4: List[String] = List(y, z)
	a.isEmpty                                 //> res5: Boolean = false
	Nil.isEmpty                               //> res6: Boolean = true
	def walkthru(l:List[Int]):String = {
    if(l.isEmpty) ""
    else l.head.toString + " " + walkthru(l.tail)
    }                                             //> walkthru: (l: List[Int])String
	walkthru(a)                               //> res7: String = "1 2 3 4 "
	//filter会遍历列表，然后通过匿名函数筛选
	a.filter(x => x%2==1)                     //> res8: List[Int] = List(1, 3)
	"99 Red Balloons".toList                  //> res9: List[Char] = List(9, 9,  , R, e, d,  , B, a, l, l, o, o, n, s)
	"99 Red Balloons".toList.filter(x => Character.isDigit(x))
                                                  //> res10: List[Char] = List(9, 9)
	"99 Red Balloons".toList.takeWhile(x => x!='B')
                                                  //> res11: List[Char] = List(9, 9,  , R, e, d,  )

}