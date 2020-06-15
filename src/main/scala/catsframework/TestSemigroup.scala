package catsframework
import cats._ , cats.instances._ , cats.implicits._

object TestSemigroup extends App {


  /*

  Associativity is the only principle(law) that the semigroup type class follows.
- (a x b) x c == a x (b x c) == (b x c) x a

   */

  println (2.combine(3))
  println(List(1,3,5).combine(List(1,25,6)))
  println(Option(4).combine(Option(6)))

}
