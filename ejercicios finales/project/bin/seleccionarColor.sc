object seleccionarColor {
  
  //Vamos a utilizar la funcion match para hacer una funcion capaz de saber que color es pasando el codigo RGB
  def seleccionarColor(x:String):String={
  	x match{
  	case "0,0,0" => "Negro"
  	case "255,0,0" => "Rojo"
  	case "0,255,0" => "Verde"
  	case "0,0,255" => "Azul"
  	case "255,255,0" => "Marron"
  	case "255,0,255" => "Violeta"
  	case "255,255,255" => "Blanco"
  	case _ => "Desconocido"
  	}
  }                                               //> seleccionarColor: (x: String)String
  
  
  seleccionarColor("255,0,0")                     //> res0: String = Rojo
}