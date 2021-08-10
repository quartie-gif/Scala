package Lectures.part2oop

object Generics extends App{

  class MyList[+A] {
    //use the type A
    //[B >: A] - B is super type of A
    def add[B >: A](element: B): MyList[B] = ???
    /*
     A = Cat
     B = Dog = Animal
    */
  }
    class MyMap[Key,Value]


    val listOfIntegers = new MyList[Int]
    val listOfStrings = new MyList[String]

    // generic methods
    object MyList{
      def empty[A]: MyList[A] = ???
    }

    val emptyListOfIntegers = MyList.empty[Int]

    //variance problem
    class Animal
    class Dog extends Animal
    class Cat extends Animal

    //1. YES ,  List[Cat] extends List[Animal] = COVARIANCE
    class CovariantList[+A]
    val animal: Animal = new Cat
    val animalList: CovariantList[Animal] = new CovariantList[Dog]
    //animalList.add(new Dog)??? HARD QUESTION => we return a list of Animals

    //2. No = INVARIANCE

    class InvariantList[A]

    val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

    //3. HELL NO - CONTRAVARIANCE
    class Trainer[-A]
    val trainer: Trainer[Cat] = new Trainer[Animal]

    //bounded types
    //A <: Animal - class A only accepts

    class Cage[A <: Animal](animal: A)
    val cage = new Cage(new Dog)

    //cannot write sth like that
    /*
    * class Car
    * val newCage = new Cage(new Car)
    *
    * */





}
