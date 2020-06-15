package catsexercise
import cats._
import cats.data._
import cats.implicits._

object TestMonad1 extends App {

  type Birds = Int
  /* Step 1:
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

   */

  case class Pole(left: Birds, right: Birds) {
  def landLeft(n: Birds): Option[Pole] =
    if (math.abs((left + n) - right) < 4) copy(left = left + n).some
    else none[Pole]
  def landRight(n: Birds): Option[Pole] =
    if (math.abs(left - (right + n)) < 4) copy(right = right + n).some
    else none[Pole]
  def banana: Option[Pole] = none[Pole]
}

  val lbl = Monad[Option].pure(Pole(0, 0)) >>= {_.landLeft(1)} >>=
    {_.banana} >>= {_.landRight(1)}

  println(lbl);

  
}
