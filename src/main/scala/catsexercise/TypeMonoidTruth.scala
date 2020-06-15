package catsexercise

import cats.Monoid

object TypeMonoidTruth extends App {

 /*
  implicit val booleanAndMonoid: Monoid[Boolean] =
    new Monoid[Boolean] {
      def combine(a: Boolean, b: Boolean) = a && b
      def empty = true
    }

  implicit val booleanOrMonoid: Monoid[Boolean] =
    new Monoid[Boolean] {
      def combine(a: Boolean, b: Boolean) = a || b
      def empty = false
    }

  implicit val booleanEitherMonoid: Monoid[Boolean] = new Monoid[Boolean] {
    def combine(a: Boolean, b: Boolean) =
      (a && !b) || (!a && b)
    def empty = false
  }

  implicit val booleanXnorMonoid: Monoid[Boolean] =
    new Monoid[Boolean] {
      def combine(a: Boolean, b: Boolean) =
        (!a || b) && (a || !b)
      def empty = true
    }

*/
  implicit def setUnionMonoid[A]: Monoid[Set[A]] =
    new Monoid[Set[A]] {
      def combine(a: Set[A], b: Set[A]) = a union b
      def empty = Set.empty[A]
    }



  val intSetMonoid = Monoid[Set[Int]]
  val strSetMonoid = Monoid[Set[String]]

  println(intSetMonoid.combine(Set(1, 2), Set(2, 3)))
  // res2: Set[Int] = Set(1, 2, 3)
  println(strSetMonoid.combine(Set("A", "B"), Set("B", "C")))
  // res3: Set[String] = Set(A, B, C)





}
