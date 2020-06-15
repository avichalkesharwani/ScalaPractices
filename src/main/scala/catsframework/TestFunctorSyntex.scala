package catsframework

object TestFunctorSyntex extends App {

  import cats.instances.function._ // for Functor
  import cats.syntax.functor._     // for map
  val func1 = (a: Int) => a + 1
  val func2 = (a: Int) => a * 2
  val func3 = (a: Int) => a + "!"
  val func4 = func1.map(func2).map(func3)

  println(func4(123))

  // Can you imagine the benefit of this in  data science projects?

}
