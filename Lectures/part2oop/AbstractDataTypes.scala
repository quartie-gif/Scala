package Lectures.part2oop

object AbstractDataTypes extends App{

  //abstract
  abstract class Animal{
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    def eat:Unit = println("Crunch Crunch")
  }

  //traits
  trait Carnivore{
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("OMOMOM")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating a ${animal.creatureType}")
  }


  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract classes
  //(abstract classes can have abstract and non abstract members so traits can)
  //1 - traits do not have constructors parameters
  //2 - multiple traits may be inherited by the same class
  //3 - traits = behaviour, abstract class - type of thing


}
