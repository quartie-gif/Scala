package Lectures.part3fp

object HOFsAndCurries extends App {
  //val superFunction: (Int, (String, (Int=>Boolean))=> Int)=>(Int =>Int) = ???
  ///higher order function (HOF)

  //map,flatMap, filter in MyList

  //function that   applies a function  n times over a value x
  //nTimes(f,n,x)
  //nTimes(f,3,x) = f(f(f(x)))

  def nTimes(f: Int => Int, n: Int, x:Int): Int =
    if(n<=0) x
    else nTimes(f, n-1, f(x))


  val plusOne = (x: Int) => x+1
  println(nTimes(plusOne, 10, 1))
  //OUTPUT: 11

  //ntb(f,n) = x => f(f(f(...(x)))
  def nTimesBetter(f: Int => Int, n: Int): Int=> Int =
    if(n<=0) (x: Int) => x
    else (x: Int) =>nTimesBetter(f, n-1)(f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))
  //OUTPUT: 11

  //curried functions
  val supperAdder: Int => (Int => Int)= (x: Int) =>(y: Int) => x+y
  val add3 = supperAdder(3) // y => 3+y
  println(add3(10))

  //functions with multiple parameter lists
  def curriedFormatter(c: String)(x:Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")


  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
  //OUTPUT:
  //  3.14
  //  3.14159265
  /*
    Notes:
      Functional programming = working with functions
       -  pass function as parameters
       -  return functions as results
       => HOF
       Currying = functions with multiple parameter lists
   */

  /*
    1. Expand MyList :
      - foreach method A => Unit
      - sort function ((A,A) => Int) => MyList
      - zipWith (list, (A, A) => B) => MyList[B]
      - fold(start)(function) => a value

    2. to Curry (f: (Int,  Int) => Int) => (Int => Int => Int)
    from Curry(f: (Int => Int => Int)) => (Int, Int) => Int

    3. compose (f,g) => x => f(g(x))
        andThen (f,g) => x => g(f(x))

   */
  def toCurry(f: (Int,  Int) => Int): (Int => Int => Int) = {
    x => y => f(x,y)
  }
  def fromCurry(f: (Int => Int => Int)): (Int, Int) => Int ={
    (x,y) => f(x)(y)
  }
  def compose(f: Int => Int, g: Int => Int) : Int => Int = {
    x => f(g(x))
  }
  def andThen(f: Int => Int, g: Int => Int) : Int => Int = {
    x => g(f(x))
  }
  def superAdder2: (Int => Int => Int) = toCurry(_+_)
  def add4 = superAdder2(4)
  println(add4(16))
}
