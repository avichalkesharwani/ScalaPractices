package practices

import scala.util.{ Try, Success, Failure }


/**
  * Syntex:

      * try {
      * // your scala code here
      * }
      * catch {
      * case foo: FooException => handleFooException(foo)
      * case bar: BarException => handleBarException(bar)
      * case _: Throwable => println("Got some other kind of Throwable exception")
      * } finally {
      * // your scala code here, such as closing a database connection
      * // or file handle
      * }
  *
  */


object Exception {
  def findElementIndex(e: Int, list: List[Int]): Int = {
    val index: Int = list.indexOf(e, 0)
    if (index == -1)
      throw new Exception("Element not found.")
    index
  }
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    Try(Exception.findElementIndex(9, list)) match {
      case Success(index) => println(s"Found element at index = $index")
      case Failure(exception) => println(exception.getMessage)
    }
  }
}