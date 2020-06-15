package practices

object TestOption extends App {

  //val x = toInt("1")
  //val y = toInt("foo")
    val z = divideXByY(10,0)

  //println(x)
  //println(y)
    println(z)
  /*

  toInt("123").foreach{ i =>
    println(s"Got an int: $i")
  }

  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))

    } catch {
      case e: Exception => None
    }
  }
*/

  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }

}

