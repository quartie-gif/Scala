package Lectures.part3fp

import scala.util.Random

object Options extends App{

  val myFristOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFristOption)

  // unsafe APIs
  def unsafeMethod(): String = null
  //val result = Some(null) //WRONG
  val result = Option(unsafeMethod()) // Some or None
  println(result)

  //chained methods
  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  // DESIGN unsafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  // functions on Options
  println(myFristOption.get) //UNSAFE - do not use this !!
  println(myFristOption.isEmpty)

  //map, flatMap, filter

  println(myFristOption.map(_*2))
  println(myFristOption.filter(x => x>10))
  println(myFristOption.flatMap( x => Option(x*10)))

  //for-comprehensions

  println("--------EXERCISES--------")

  val config: Map[String, String] = Map{
    //fetched from elsewhere
    "host" -> "176.45..36.1"
    "port" -> "80"
  }

  class Connection{

    def connect = "Connected"

    object Connection {
      val random = new Random(System.nanoTime())

      def apply(host: String, port: String): Option[Connection] = {
        if(random.nextBoolean()) Some(new Connection)
        else None
      }
    }

    //try to establish connection, if so print the connect method

    val host = config.get("host")
    val port = config.get("port")

    val connection = host.flatMap( h => port.flatMap( p => Connection.apply(h,p)))
    val connectionStatus = connection.map( c => c.connect)

    println(connectionStatus)
    connectionStatus.foreach(println)

  }


}
