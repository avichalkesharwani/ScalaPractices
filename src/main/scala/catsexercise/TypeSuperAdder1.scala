package catsexercise

object TypeSuperAdder1 extends App {

  /*
  The cu􏰂ng edge SuperAdder v3.5a-32 is the world’s first choice for adding together numbers.
  The main func􏰀on in the program has signature def add(items: List[Int]): Int.
  In a tragic accident this code is deleted! Rewrite the method and save the day!
   */

  // The use of foldLeft

  // def add(items: List[Int]): Int = items.foldLeft(0)(_ + _)

   // another way

  import cats.Monoid
  import cats.instances.int._    // for Monoid
  import cats.syntax.semigroup._ // for |+|
  def add(items: List[Int]): Int =
  items.foldLeft(Monoid[Int].empty)(_ |+| _)

  

}
