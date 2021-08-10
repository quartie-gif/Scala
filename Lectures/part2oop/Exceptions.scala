package Lectures.part2oop

object Exceptions extends App{
  val x: String  = null

  //println(x.length)
  // this will crash with a NPE
      //throwing and catching exceptions
//      val aWeirdValue:String = throw new NullPointerException

      //throwable classes extends the Throwable class
      //Exception and Error are the major Throwable subtypes

  //2. how to catch exceptions

  def getInt(withExceptions: Boolean): Int ={
    if (withExceptions) throw new RuntimeException("No Int for you !")
    else 42
  }
  val potentialFail = try {
     //code that may fail
    getInt(true)
  } catch {
    case e: RuntimeException => println("Caught a Runtime exception ")
  } finally {
    //code that will get executed no matter what
    //finally block is optional
    //does not influence the return type of expression
    //use finally only for side effects
    println("finally")
  }


  //3. how to define your own exceptions
//  class MyException extends Exception
//  val exception = new MyException

//  throw exception

  /*
  1. Crash your program with OutOfMemoryError
  2. Crash wit SOError
  3. Pocket Calculator
    - add(x,y)
    - multiple(x,y)
    - subtract(x,y)
    - divide(x,y)

    Throw
      - OverFlowException if add(x,y) exceeds Int.MAX_VALUE
      - UnderflowException if subtract(x,y) exceeds Int.MIN_VALUE
      - MathCalculatorException for division by 0
   */

  // 1. Crash your program with OutOfMemoryError (OOM)
//  val array = Array.ofDim(Int.MaxValue)
//
//  //SO
//  //2. Crash wit SOError
//  def inifinite: Int =1 +inifinite
//  val noLimit = inifinite

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationExcetpion extends RuntimeException("Division by 0")

  object PocketCalculator{
    def add(x: Int, y : Int ): Int ={
      val result = x+y
      if (x>0 && y>0 && result<0) throw new OverflowException
      else if(x<0 && y<0 && result>0)  throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int): Int ={
      val result =  x-y
      if(x>0 && y<0   && result <0) throw new OverflowException
      else if(x<0 && y>0 && result >0) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int ) ={
      val result = x*y
      if (x>0 && y>0 && result<0) throw new OverflowException
      else if(x<0 && y<0 && result<0)  throw new OverflowException
      else if(x>0 && y<0 && result>0)  throw new UnderflowException
      else if(x<0 && y>0 && result<0)  throw new UnderflowException
      else result
    }


    def divide(x: Int, y: Int ) = {
      if(y == 0) throw  new MathCalculationExcetpion
      else x/y
    }

  }
  println(PocketCalculator.divide(2,0))



}
