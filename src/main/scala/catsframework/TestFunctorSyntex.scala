package catsframework

import cats.Functor
import scala.language.higherKinds

object TestFunctorSyntex extends App {

  import cats.instances.function._ // for Functor
  import cats.syntax.functor._     // for map
  import cats.instances.option._ // for Functor
  import cats.instances.list._   // for Functor


  val func1 = (a: Int) => a + 1
  val func2 = (a: Int) => a * 2
  val func3 = (a: Int) => a + "!"
  val func4 = func1.map(func2).map(func3)

  val x = 1+2+"Bye!"

  println(x)
  println(func4(123))

  def doMath[F[_]](start: F[Int])
                  (implicit functor: Functor[F]): F[Int] =
    start.map(n => n + 1 * 2)

  doMath(Option(20))
  // res3: Option[Int] = Some(22)
  doMath(List(1, 2, 3))
  // res4: List[Int] = List(3, 4, 5)
  // Can you imagine the benefit of this in  data science projects?

}
