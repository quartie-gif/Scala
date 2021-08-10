package Lectures.part2oop

object CaseClasses extends App{
  /*
    equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  //1.class parameteres are fields
  val jim = new Person ("Jim",32)
  println(jim.age)

  //2. sensible toString
  //println(instance) = println(instance.toString) //syntactic sugar
  println(jim.toString)


  //3. equals and hashCode implemented out of the box (OOTB)
  val jim2 = new Person ("Jim",32)
  println(jim == jim2)


  //4. Case classes have handy copy methods
  val jim3  = jim.copy(age = 45)
  println(jim3)

  //5. CCs have companion objects

  val thePerson = Person
  val mary = Person("Marry", 23) // apply method

  //6. CCs are serializable
  //Akka

  //7. CCs have extractor patterns  = CCs can be used in PATTERN MATCHING


  case object UnitedKingdom{
    def name: String = "The UK of GB and NI"

  }


}
