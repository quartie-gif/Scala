package Lectures.part3fp

import scala.util.Random

object sequences extends App{
  //Seq
  val aSequence = Seq(7,2,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence.apply(2))
  println(aSequence ++ Seq(6,5,7))
  println(aSequence.sorted)

  //Ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)

  //lists
  val aList  = List(1,2,5,4)
  val preprended = 42 :: aList
  val preprended2 = 42 +: aList :+ 92
  println(preprended2)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString("-"))

  //arrays
  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[String](3)

  println(threeElements)
  threeElements.foreach(println)

  //mutation
  numbers(2) = 0 //numbers.update(2,0) syntax sugar
  println(numbers.mkString(" "))

  //arrays and seq
  val numberSeq: Seq[Int] = numbers //implicit conversion
  println(numberSeq)

  //vectors
  val vector: Vector [Int] = Vector(1,2,3)

  //vector vs list


  val maxRuns = 1000
  val maxCapacity = 1000000
  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times  = for{
      it <- 1 to maxRuns
    }yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity),r.nextInt())
      System.nanoTime() - currentTime
    }
    times.sum * 1.0/ maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  // + keeps refernce to tails
  // - updating element in the middle takes long time
  println(getWriteTime(numbersList))
  // depth of the tree is small
  // needs to replace an entire 32 - element chunk
  println(getWriteTime(numbersVector))


}
