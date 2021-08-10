package Lectures.Part1basics

object DefaultArgs extends App{

  def trFact(n: Int, acc: Int = 1): Int = {
    if (n<= 1) acc
    else trFact(n-1, n*acc)
  }

  val fact10 = trFact(10,2)

  def savePicture(format: String="JPEG", width: Int, height: Int= 11): Unit= println("saving picture")
  savePicture(width = 1309)
  /*
  1.pass in every leading argument
  2. name the arguments
  */




}
