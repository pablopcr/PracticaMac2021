object miFuncion2 {
  //miFuncion2 es similar a miFuncion1, con la diferencia que aplicamos todas las funciones de "a" a cada elemento de "b"
  //Utilizamos la funcion map, la cual nos permite realizar acciones con todos los elementos de una lista.
def miFuncion2(a: List[Int=>Int],b: List[Int]):List[List[Int]] ={
  if(a.isEmpty || b.isEmpty) List(List())
  else if(b.tail.isEmpty)List(a.map(x=>x(b.head)))
  else{
  	List(a.map(x=>x(b.head))) ::: miFuncion2(a,b.tail)
  }
  }                                               //> miFuncion2: (a: List[Int => Int], b: List[Int])List[List[Int]]
  
   miFuncion2(List(1+,2+,3+),List(1,2,3))         //> res0: List[List[Int]] = List(List(2, 3, 4), List(3, 4, 5), List(4, 5, 6))

}