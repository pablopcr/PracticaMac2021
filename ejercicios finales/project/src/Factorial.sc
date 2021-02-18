object Factorial {
 
 
 //El factorial es la multiplicacion consecutiva de un numero y todos sus antecesores.
 //Para realizarlo, vamos a utilizar el principio de inducción matematico, cuyo caso base es n=1 es 1
 def factorial(n: Int): Int = {
   if (n > 1)
     n * factorial(n-1)
   else
     1
   }                                              //> factorial: (n: Int)Int

factorial(3)                                      //> res0: Int = 6

 
}