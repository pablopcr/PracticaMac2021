object suma_listas {

//Vamos a coger con el .head y el .tail (cabeza:resto) cada elementos de las listas, y los sumaremos entre ellos.
  def sumaLista(a: List[Int],b: List[Int]):List[Int] ={
  if(a.isEmpty || b.isEmpty) List()
  else{
  	List(a.head+b.head) ::: sumaLista(a.tail,b.tail)
  }
  }                                               //> sumaLista: (a: List[Int], b: List[Int])List[Int]
  
  sumaLista(List(1,1,1,1),List(1,2,3,4))          //> res0: List[Int] = List(2, 3, 4, 5)
  
}