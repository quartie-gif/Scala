package Lectures.part2oop

object AnonymousClasses extends App{

  /*
  Notes:
  We can instantiate types and override fields or methods on the spot
  Req for that are as follow
    -pass in required constructor arguments if needed
    -implement all abstract fields/methods
  Anonymous classes work for traits and classes
   */

    abstract class Animal{
      def eat : Unit
    }

  //anonymous class

  val funnyAnimal: Animal = new Animal{
    override def eat: Unit = println("hahahahaha")
  }
  /*
  equivalent with

  class AnonymousClasses$$anon$1 extends Animal{
    override def eat: Unit = println("hahahahaha")
  }
  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   */

  println(funnyAnimal.eat)

  class Person(name: String){
    def sayHi: Unit = println(s"Hi! My name is $name")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println(s"Hi! My name is Jim")
  }

}
