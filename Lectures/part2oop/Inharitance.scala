package Lectures.part2oop

object Inharitance extends App{

  sealed class Animal{
    val creatureType = "Wild"
    final def eat() = println("OMOMOM")
  }


  class Cat extends Animal{
    def crunch()={
      eat
      println("crunch crunch")
    }
  }

  val cat  = new Cat
  cat.crunch

  //constructors

  class Person(name: String, age: Int){
    def this (name: String) = this(name,0)
  }
  class Adult (name: String, age :Int , idCard: String) extends Person(name)

  //overriding
  class Dog(name:String = "") extends Animal {
    /*override def  eat() = {
      super.eat
      println("Crunch Crunch")
    }*/

    override val creatureType: String = "Domestic"
  }

  val dog  = new Dog
  dog.eat
  println(dog.creatureType)

  //type substitution
  val unknownAnimal: Animal = new Dog("K9")

  //overRIDING vs overLOADING



  //super

  //preventing overrides
  //1 - use final on member
  //2 - use final on the entire class
  //3 - seal the class = extend classes int THIS FILE

}
