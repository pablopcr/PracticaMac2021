object miFuncion {
  
  //Esta función recibe una lista de funciones y una lista de enteros. Cada elemento de la segunda lista va a ser utilizado como parametro
  //en la funcion correspondiente de la primera lista. Finalmente devuelve una lista con los resultados.
  //Para realizar esta funcio, hemos utilizado el operador concatenación ":::" y tambien dividiremos las lista en "cabeza"(.head) "resto"(.tail)
  def miFuncion(a: List[Int=>Int],b: List[Int]):List[Int] ={
  if(a.isEmpty || b.isEmpty) List()
  else{
  	List(a.head(b.head)) ::: miFuncion(a.tail,b.tail)
  }
  }                                               //> miFuncion: (a: List[Int => Int], b: List[Int])List[Int]
  
  miFuncion(List(1+,2+,3+),List(1,2,3))           //> res0: List[Int] = List(2, 4, 6)
  
  
  
}