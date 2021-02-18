object SecondElem {

	
	def secondElem(a: List[Any])={
		if(a.size<=1) Nil
		else a.tail.head
	}                                         //> secondElem: (a: List[Any])Any
	
	secondElem(List(1,2,3))                   //> res0: Any = 2
	secondElem(List(1))                       //> res1: Any = List()
	secondElem(List())                        //> res2: Any = List()

}