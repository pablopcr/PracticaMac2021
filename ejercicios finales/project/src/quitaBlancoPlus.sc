object quitaBlancoPlus {
  //Vamos a quitar todos los espacios en blanco de una cadena introducida
  
  def quitaBlancos(a: String):String={
  	if(a.tail.isEmpty()&&a.head==' ')""
  	else if(a.tail.isEmpty()&&a.head!=' ')a
  	else if(a.head==' ') quitaBlancos(a.tail)
  	else a.head + quitaBlancos(a.tail)
  }                                               //> quitaBlancos: (a: String)String
  
  quitaBlancos("       aaa a a ")                 //> res0: String = aaaaa
  
}