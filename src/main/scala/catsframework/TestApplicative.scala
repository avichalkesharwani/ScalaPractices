package catsframework
import cats._ , cats.implicits._ , cats.instances._

object TestApplicative extends App {

/*

  it basically comes with a function called “pure” which wraps a data type(Int, string, Boolean) into a context
 (Option, List , Future ).
 */

  println(Applicative[Option].pure(1))

  println(Applicative[List].pure(4))


}
