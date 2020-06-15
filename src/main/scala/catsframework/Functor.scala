package catsframework
import cats._
import cats.instances.all._
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