
//Esta funcion va a recibir una lista y haciendo uso del .head, va a devolver el primer elemento.
object firstElement {
  def firstElement(a: List[Int]) ={
  
  	if(a.nonEmpty) a.head
  	else scala.collection.immutable.Nil

  }                                               //> firstElement: (a: List[Int])Any
  
  firstElement(List(1,2,3))                       //> res0: Any = 1
  firstElement(List())                            //> res1: Any = List()
}