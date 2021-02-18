object tuplas {
  
  	// Se define una tupla y una posicion de esta, se mostrara la tupla sin esa posicion indicada
  
  val pos=2;                                      //> pos  : Int = 2
  
  val tupla=("pepe",62,"Almonte","Soltero")       //> tupla  : (String, Int, String, String) = (pepe,62,Almonte,Soltero)
  
  def cogeTupla= tupla                            //> cogeTupla: => (String, Int, String, String)
  
 	pos match{
  	case 1 => val(_,edad,localidad,relacion)=cogeTupla; println(edad,localidad,relacion)
  	case 2 => val(nombre,_,localidad,relacion)=cogeTupla; println(nombre,localidad,relacion)
  	case 3 => val(nombre,edad,_,relacion)=cogeTupla; println(nombre,edad,relacion)
  	case 4 => val(nombre,edad,localidad,_)=cogeTupla; println(nombre,edad,localidad)
  	case _ => "Posicion Incorrecta"
  	}                                         //> (pepe,Almonte,Soltero)
                                                  //| res0: Any = ()
  	
 
   
  
}