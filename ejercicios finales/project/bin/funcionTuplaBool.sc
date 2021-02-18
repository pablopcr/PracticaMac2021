object funcionTuplaBool {



  def And(a: Boolean, b:Boolean):Boolean =(a && b)//> And: (a: Boolean, b: Boolean)Boolean
 	def OR(a: Boolean, b:Boolean):Boolean =(a || b)
                                                  //> OR: (a: Boolean, b: Boolean)Boolean
  
def funcionTupla(f: (Boolean,Boolean)=>Boolean, n:Boolean,g: (Boolean,Boolean)=>Boolean) = {
 f(n,n) && g(n,n);
}                                                 //> funcionTupla: (f: (Boolean, Boolean) => Boolean, n: Boolean, g: (Boolean, Bo
                                                  //| olean) => Boolean)Boolean

funcionTupla(OR,true,And)                         //> res0: Boolean = true
  
  
}