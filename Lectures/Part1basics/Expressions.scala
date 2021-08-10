package Lectures.Part1basics

object Expressions extends App {
  val x =1+2; //EXPRESSION
  println(x)
  println(2+3*4)

  ///>>> right shift with zero extension

  println(x==1)

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int=42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n:Int ) : String={
    if(n==1) aString
    else aString + aRepeatedFunction(aString, n-1)

  }

  println(aRepeatedFunction("hello", 3))

  //WHEN YOU NEED LOOPS USE RECURSION
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunctions(n:Int ): Int={
    def aSmallerFunction (a: Int, b: Int): Int = a + b

    aSmallerFunction(n,n-1)
  }

  /*
    1. A greeting funciton (name, age) => "Hi, my $name and i am $age years old"
    2.Factiorial function
  */

  def aGreetingFunction(name:String, age: Int): String={
    "Hi, my name is "+ name +" and i am " + age + " years old"
  }

  println(aGreetingFunction("Maciek", 20))

  def FactorialFunction(n: Int): Int= {
    if(n==1) n
    else n*FactorialFunction(n-1)
  }

  println(FactorialFunction(5))

  def FibonnaciFunction(n: Int): Int={
    if(n==0||n==1) 1
    else FibonnaciFunction(n-1)+FibonnaciFunction(n-2)
  }

  println(FibonnaciFunction(4))

  def  IsPrime(n: Int): Boolean={
     def IsPrimeUntil(t: Int): Boolean={
       if(t<=1) true
       else  n % t !=0 && IsPrimeUntil(t-1)
     }
    IsPrimeUntil(n/2)
  }
  println(IsPrime(17))
  println(IsPrime(20))
}
