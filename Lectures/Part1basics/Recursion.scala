package Lectures.Part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def Factiorial(n: Int): Int={
    if(n<=1) 1
    else n * Factiorial(n-1)
  }

  def anotherFactorial(n: Int): BigInt ={
    def FactorialHelper(x: Int, accumulator: Int): BigInt = {
      if(x<=1) accumulator
      else FactorialHelper(x-1, x* accumulator)
    }
    FactorialHelper(n,1)
  }

  //WHEN YOU NEED LOOPS USE TAIL RECURSION


  //1.Concatenate a string n times
  @tailrec
  def ConcatenateTailRec(aString: String, n: Int, accumulator: String):String = {
    if(n<=0){
      accumulator
    }
    else ConcatenateTailRec(aString, n-1 , aString + accumulator)
  }
  println(ConcatenateTailRec("Maciek",3,""))

  def  IsPrime(n: Int): Boolean={
    @tailrec
    def IsPrimeUntil(t: Int, acc: Boolean): Boolean={
      if(!acc) return false
      if(t<=1) true
      else  IsPrimeUntil(t-1, n%t!=0 && acc)
    }
    IsPrimeUntil (n/2,true)
  }
  println(IsPrime(42))
  println(IsPrime(13))

  def Fibo(n: Int): Int = {
    def FiboTailRec(i: Int, acc1: Int, acc2: Int): Int = {
      if(i>=n) return acc1
      else FiboTailRec(i+1, acc1+acc2, acc1)


    }
    if(n<=2) 1
    else FiboTailRec(2,1,1)

  }

  println(Fibo(5))


}
