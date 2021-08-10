package Lectures.Part1basics

object StringOps extends App{
  val str: String = "Hello I'm learning SCALA"

  println(str.charAt(2))
  println(str.substring(6,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString:+'z')
  println(str.reverse)
  println(str.take(2))

  //Scala - specific: String interpolators

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and i am $age years old"
  val anothergreeting = s"Hello, my name is $name and i am $age years old. I will be turning ${age +1 } years old"
  println(anothergreeting)

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute "

  //raw - interpolator
  println(raw"This is a \n newline ")



}
