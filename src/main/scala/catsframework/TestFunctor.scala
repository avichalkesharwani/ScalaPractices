package catsframework
//import cats._
//import cats.instances.all._

import scala.language.higherKinds
import cats.Functor
import cats.instances.list._   // for Functor
import cats.instances.option._ // for Functor
// dependency for cats._ and cats.instances.all._
// So Functor is the type class, multiple things defined in Cat to use it

/*  Part 1
  val len: String => Int = _.length

  // println(List("scala", "cats")(len))  // how to make it work using Functor
  println(len("ABC"))

  // we can use List, option and future in a similar way
*/


/* Part 2
object Functor extends App {

  val len: String => Int = _.length
  Functor[List].map(List("scala", "cats")) (len)

}

//what is happening here:
  //unwrap(fetch) the value from the context
  //apply the function onto the value
  //re-wrap the resultant into context

*/

/* Part 3
Using Either as a Functor
The standard Either type in Scala does not have a “map” function, however, the cats library defines a Functor instance for it.

Others : fproduct, lift, compose


 */
object TestFunctor extends App
{


  val list1 = List(1, 2, 3)
  // list1: List[Int] = List(1, 2, 3)
  val list2 = Functor[List].map(list1)(_ * 2)
  // list2: List[Int] = List(2, 4, 6)

  val list3 = list1.map(_*2)
  println(list3)

  val option1 = Option(123)
  // option1: Option[Int] = Some(123)
  val option2 = Functor[Option].map(option1)(_.toString) // option2: Option[String] = Some(123)



}
