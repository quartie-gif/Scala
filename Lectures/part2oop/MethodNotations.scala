package Lectures.part2oop

object MethodNotations extends App {
  class Person(val name: String, favouritemovie: String, age: Int =0  ) {
    def likes(movie: String):Boolean = {movie == favouritemovie}
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String ="BENG!!!!"
    def isAlive(): Boolean = true
    def apply() : String = s"Hi! My name is $name and I like $favouritemovie"
    //overloading apply method
    def apply(number : Int): String = s"$name watched $favouritemovie $number times"

    def + (person: Person ): String = s"${this.name} is hanging out with ${person.name}"
    def + (string: String) : Person = new Person(string + s"$name", favouritemovie)
    def unary_+ () : Person = new Person(name, favouritemovie, age+1)
    def learns(string: String ) : String = s"$name learns $string "
    def learns() :String = learns("Scala")


    override def toString(): String =  name+ " is " + age +" years old and her/his fav movie is "+favouritemovie
    
  }


  val mary  = new Person ("Marry", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //infix notation = operator notation


  //"operators" in Scala

  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom) //example of syntactic sugar

  class Point(var x: Int, var y: Int) {

    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
    }

    override def toString: String =
      s"($x, $y)"
  }

  val point1 = new Point(2, 3)
  point1.move(1,1)
  println(point1.x)  // 2
  println(point1)  // prints (2, 3)

  //ALL OPERATORS ARE METHODS

  //prefix notation
  val x  = -1 // equivalent with : 1.unary_-
  val y = 1.unary_-
  //unary_ prefix

  println(!mary)

  //postfix notation
   println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())// calling apply function 


  //EX1

  println(+mary)

  println((mary+"theRockstar").apply)
  println(mary learns)
  println(mary apply(2))
}
