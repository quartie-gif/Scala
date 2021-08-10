package Lectures.part2oop

object OOBasics extends App{
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
  person.greet()

  val author = new Writer("Maciek", "Piwek",2000)
  val novel = new Novel("Dupa123", 2013, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))

}
//constructor
class Person (name: String, val age:Int = 0){
  //body
  val x=2



  def greet(name: String): Unit={
    println(s"${this.name} says: Hi, $name")
  }
  def greet(): Unit={
    println(s"Hi, I am $name")
  }

  //multiple constructors
  def this(name: String) = this(name, 0)
  def this () = this("John Doe")
}

//class parameters are not fields

/*
 Novel and a Writer
 */
class Writer(firstName: String, surname: String,val year: Int ){
  def fullName: String = firstName + " " + surname
}
class Novel(name:String , year:Int,author: Writer){
  def authorAge = year- author.year
  def isWrittenBy(author:Writer) = author == this.author
  def copy(newYear: Int) : Novel = new Novel(name,newYear,author)
}
class Counter(val count: Int){
  def inc(n:Int) = new Counter(count + n) //immutability
  def dec(n:Int) = new Counter(count - n)
}


//adding val  is converting parameter of class to field