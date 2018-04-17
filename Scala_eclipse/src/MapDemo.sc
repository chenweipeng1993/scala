object MapDemo {
	val a: List[Int] = List( 1,2 , 3, 4)      //> a  : List[Int] = List(1, 2, 3, 4)
	val c = "x"::"y"::"z"::Nil                //> c  : List[String] = List(x, y, z)
  c.map(x => x.toUpperCase)                       //> res0: List[String] = List(X, Y, Z)
	c.map(_.toUpperCase)                      //> res1: List[String] = List(X, Y, Z)
	a.filter(_%2 == 1)                        //> res2: List[Int] = List(1, 3)
	a.filter(_%2 == 1).map(_ + 10)            //> res3: List[Int] = List(11, 13)
	val q = List(a,List(4,5,6))               //> q  : <error> = List(List(1, 2, 3, 4), List(4, 5, 6))
	q.map(x=>x.filter(_%2==0))                //> res4: <error> = List(List(2, 4), List(4, 6))
	q.map(_.filter(_%2==0))                   //> res5: <error> = List(List(2, 4), List(4, 6))
	q.flatMap(_.filter(_%2==0))               //> res6: <error> = List(2, 4, 4, 6)
	
}