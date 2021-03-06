package catsexercise

object TypeSuperAdder1 extends App {

  /*
  The cu􏰂ng edge SuperAdder v3.5a-32 is the world’s first choice for adding together numbers.
  The main func􏰀on in the program has signature def add(items: List[Int]): Int.
  In a tragic accident this code is deleted! Rewrite the method and save the day!
   */

  // The use of foldLeft

  // def add(items: List[Int]): Int = items.foldLeft(0)(_ + _)

  // another way ...

  import cats.Monoid
  import cats.instances.int._    // for Monoid
  import cats.syntax.semigroup._ // for |+|

  /*
  def add(items: List[Int]): Int =
  items.foldLeft(Monoid[Int].empty)(_ |+| _)
  */

  /*
  Well done! SuperAdder’s market share con􏰀nues to grow, and now there is demand for addi􏰀onal func􏰀onality.
  People now want to add List[Option[Int]]. Change add so this is possible. The SuperAdder code base is of the highest
  quality, so make sure there is no code duplica􏰀on!
  */

  def add[A](items: List[A])(implicit monoid: Monoid[A]): A =
    items.foldLeft(monoid.empty)(_ |+| _)
  import cats.instances.int._ // for Monoid

  println(add(List(1, 2, 3)))
  // res9: Int = 6
  import cats.instances.option._ // for Monoid
  println(add(List(Some(1), None, Some(2), None, Some(3))))


  /*
  SuperAdder is entering the POS (point-of-sale, not the other POS) market.
  Now we want to add up Orders:
  case class Order(totalCost: Double, quantity: Double)
  We need to release this code really soon, so we can’t make any modifica􏰀ons to add. Make it so!
  */

  /*
  implicit val monoid: Monoid[Order] = new Monoid[Order] {
    def combine(o1: Order, o2: Order) =
      Order(
        o1.totalCost + o2.totalCost,
        o1.quantity + o2.quantity
      )
    def empty = Order(0, 0)
  }

  */



}
