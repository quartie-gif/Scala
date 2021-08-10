package Lectures.Part1basics

object ValuesVariablesTypes extends App{
  val x: Int = 42
  println(x)
  //VALS are immutable

  //Compilier can infer types

  val aString: String = "hello"
  val anotherString:String = "Bye"

  val aBoolean:Boolean = false
  val aChar: Char = 'a'
  val anInt: Int =  x
  val aShort: Short = 1231
  val aLong: Long = 123123123123123123L
  val aFloat:Float = 2.01f
  val aDouble:Double = 3.14

  //variables
  var aVariable: Int =4
  aVariable = 5
  println(aVariable)

}
