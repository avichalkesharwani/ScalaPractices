package catsframework
import cats._
import cats.instances.all._

/*

  val len: String => Int = _.length
  // println(List("scala", "cats")(len))  // how to make it work using Functor
  println(len("ABC"))


*/


/*
// dependency for cats._ and cats.instances.all._

object Functor extends App {

  val len: String => Int = _.length

  Functor[List].map(List("scala", "cats")) (len)

}

*/