package Lectures.part2oop



import Playground.{Cindrella =>Princess, PrinceCharming}
import java.util.Date
import java.sql.{Date=>SqlDate}


object PackagingAndImports extends App{
  //Package mambers are accessible by their simple name
  val writer = new Writer("Daniel", "RockJVM", 2018)


  //import the package

  val princess  = new Princess // Playground.Cindrella - fully qualified name


  //packages are in hierarchy
  //matching folder structure.

  //package object
  sayHello
  println(SPPED_OF_LIGHT)


  //imports
  val prince = new PrinceCharming
  val date = new Date
  //1. Use FullyQualified Names

  //val sqlDate = new java.sql.Date(2018, 5, 4)

  //2. use aliasing
  val sqlDate = new SqlDate(2018, 5, 4)


  //default imports
  //java.lang - String, Object, Exception
  //scala - Int. Nothing, Function
  //...
}
