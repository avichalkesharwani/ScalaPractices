package catsframework

import cats.Eval

object TypeDiffEvalNowAlways extends App {

  val x = Eval.now {
    println("Computing X")
    math.random
  }
  // Computing X
  // x: cats.Eval[Double] = Now(0.5415551857150346)
  println(x.value) // first access
  // res9: Double = 0.5415551857150346
  println(x.value) // second access
  // res10:

  // Now will  return same value while always will return new value on each call

  val y = Eval.always {
    println("Computing Y")
    math.random
  }
  // y: cats.Eval[Double] = cats.Always@3289cc05
  println(y.value) // first access
  // Computing Y
  // res11: Double = 0.06355685569536818
  println(y.value) // second access
  // Computing Y
  // res12: Double = 0.27425753581857903
}
