object funcionLet {
 
 def funcionLet(a:List[Any])={
 
 var b=a.tail
 b.tail
 
 
 }                                                //> funcionLet: (a: List[Any])List[Any]
 
 funcionLet(List(2,3,4,5,6))                      //> res0: List[Any] = List(4, 5, 6)
 
 
}