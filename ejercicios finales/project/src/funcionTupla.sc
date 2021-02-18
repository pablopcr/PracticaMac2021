object funcionTupla {
  
 def suma(a: Int, b:Int):Int =a+b                 //> suma: (a: Int, b: Int)Int
 def resta(a: Int, b:Int):Int =a-b                //> resta: (a: Int, b: Int)Int
  
def funcionTupla(f: (Int,Int)=>Int, n:Int,g: (Int,Int)=>Int) = {
 f(n,n) + g(n,n);
}                                                 //> funcionTupla: (f: (Int, Int) => Int, n: Int, g: (Int, Int) => Int)Int

funcionTupla(suma,3,resta)                        //> res0: Int = 6
 
  
}