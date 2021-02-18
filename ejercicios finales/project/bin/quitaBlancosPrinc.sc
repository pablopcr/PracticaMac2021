object quitaBlancosPrinc {
  
  def quitaBlancos(a: String):String={
  	if(a.head==' ') quitaBlancos(a.tail)
  	else a
  }                                               //> quitaBlancos: (a: String)String
  
  quitaBlancos("       aaa a a")                  //> res0: String = aaa a a
  
  
}