package Lectures.part3fp

object AnonymousFunctions extends App{
  //anonymous function (LAMBDA)
  /*  val doubler = (x: Int) => x*2 ===
      val doubler = new MyFunction[Int, Int] {
        override def apply(element: Int): Int = element*2
      }
  */
  val doubler: Int => Int = x => x*2

  //multiple parameters
  val adder: (Int, Int)=>Int = (a,b) => a+b

  //no params
  val justDoSomething: () => Int = () => 3


  println(justDoSomething) //function itself
  println(justDoSomething()) //call
  /*
    OUTPUT :
             Lectures.part3fp.AnonymousFunctions$$$Lambda$18/0x00000008000c6040@491cc5c9
             3
   */

  //curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }


  // MOAR syntactic  sugar
  val niceIncrementer: Int => Int = _ +1 // equivalent to x  => x+1


  val niceAdder: (Int, Int) => Int =  _ + _ // equivalent to (a,b)  => a+b

  /*
    1. MyList: replace all functions x-calls with lambdas
    2. Rewrite the "special" adders a anonymous function
   */

  val superAdd = (x: Int) => (y: Int) =>  x+y
  println(superAdd(3)(7))

}
