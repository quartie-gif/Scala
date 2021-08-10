package Lectures.part2oop

object Objects{

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY("static")
  object Person{
    val N_EYES = 2

    //factory method
    def from(mother: Person, father: Person): Person = new Person("Bobby")

  }

  class Person(name: String){
    //instance-level functionality
  }
  //COMPANIONS



  //Scala object = SINGELTON INSTANCE


  //Scala applications = Scala object with
  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)

  }
  //
}
