object Traduce {

	//Esta funcion recibe un numero, el cual traducimos utilizando la funcion "match" de Scala
	def traduce(a: Int):String ={
	a match{
	case 1=> "A"
	case 2=> "B"
	case 3=> "C"
	case whoa=>"X"
	}
	}                                         //> traduce: (a: Int)String
	
traduce(5)                                        //> res0: String = X

}