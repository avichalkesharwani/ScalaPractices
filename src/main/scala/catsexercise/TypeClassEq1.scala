package catsexercise
import cats.Eq
import cats.syntax.eq._


object TypeClassEq1 extends App {

  final case class Cat(name: String, age: Int, color: String)

  import cats.instances.int._    // for Eq
  import cats.instances.string._ // for Eq
  implicit val catEqual: Eq[Cat] =
    Eq.instance[Cat] { (cat1, cat2) =>
      (cat1.name  === cat2.name ) &&
        (cat1.age   === cat2.age  ) &&
        (cat1.color === cat2.color)
    }

  val cat1 = Cat("Garfield",   38, "orange and black")
  // cat1: Cat = Cat(Garfield,38,orange and black)
  val cat2 = Cat("Heathcliff", 32, "orange and black")
  // cat2: Cat = Cat(Heathcliff,32,orange and black)
  println(cat1 === cat2)
  // res17: Boolean = false
  println(cat1 =!= cat2)
  // res18: Boolean = true


}
