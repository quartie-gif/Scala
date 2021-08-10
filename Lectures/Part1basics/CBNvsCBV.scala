package Lectures.Part1basics

object CBNvsCBV extends App {


    def calledbyvalue(x: Long) : Unit ={
      println("by value : "+ x)
      println("by value : "+ x)
    }
    def calledbyname(x: => Long) : Unit={
      println("by name : "+ x)
      println("by name : "+ x)
    }
    calledbyvalue(System.nanoTime())
    calledbyname(System.nanoTime())

    def infinite() : Int  = 1 + infinite()

    def printFirst(x: Int, y: => Int) = println(x)

    printFirst(34, infinite())

}
