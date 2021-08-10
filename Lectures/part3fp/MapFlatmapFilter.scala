package Lectures.part3fp

object MapFlatmapFilter extends App{

  val list = List(1,2,3)
  println(list)

  //map
  println(list.map(_+1))

  //filter
  println(list.filter(_%2==0))

  //flatmap
  val toPair = (x :Int) => List(x,x+1)
  println(list.flatMap(toPair))
  // iterating
  val numbers = List(1,2,3,4)
  val chars  = List('a', 'b', 'c', 'd')

  val toPair2 = (x :Int) => List(x,x )

  println(numbers.flatMap(n => chars.map(c =>"" + c+ n)))

  //foreach

  list.foreach(println)


  //for-comprehensions (MORE READABLE)

  val forCombinations = for {
    n <- numbers
    c <- chars
  } yield "" + c+ n


  println(forCombinations)

  for{
    n <- numbers
  } println(n)


  // syntax overload
  val temp = list.map { x=>
    x*2
  }
  println(temp)

  //EXERCISES
  /*
    1. MyList supports for comprehensions?
    2. A small collection of at most ONE element - Maybe[+T]
      -map, flatMap, filter
   */

  }
