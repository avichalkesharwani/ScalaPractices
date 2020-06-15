package catsexercise
import cats._
import cats.data._
import cats.implicits._

object TestMonad1 extends App {

  type Birds = Int
  case class Pole(left: Birds, right: Birds) {
    def landLeft(n: Birds): Pole = copy(left = left + n)
    def landRight(n: Birds): Pole = copy(right = right + n)
  }
  println(Pole(0, 0).landLeft(2))
  println(Pole(1, 2).landRight(1))
  println(Pole(1, 2).landRight(-1))

  //anotherway
  println(Pole(0, 0).landLeft(1).landRight(1).landLeft(2))
  println(Pole(0, 0).landLeft(1).landRight(4).landLeft(-1).landRight(-2))


}
