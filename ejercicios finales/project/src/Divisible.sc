object pruebas {
          
          
//Para ver si un numero es divisible por otro, solo hay que mirar si su resto es "0"
  def divisible(a: Int, b: Int): Boolean= {
  	a%b==0
  }                                               //> divisible: (a: Int, b: Int)Boolean
 
 divisible(2,3)                                   //> res0: Boolean = false
 divisible(6,3)                                   //> res1: Boolean = true
  
}