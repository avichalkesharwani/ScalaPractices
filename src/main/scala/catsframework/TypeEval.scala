package catsframework
import cats.Eval

object TypeEval extends App {


  val now = Eval.now(math.random + 1000)
  println(now)
  // now: cats.Eval[Double] = Now(1000.337992547842)
  val later = Eval.later(math.random + 2000)
  println(later)
  // later: cats.Eval[Double] = cats.Later@37f34fd2
  val always = Eval.always(math.random + 3000)
  println(always)
  // always: cats.Eval[Double] = cats.Always@486516b

  println(now.value)
  // res6: Double = 1000.337992547842
  println(later.value)
  // res7: Double = 2000.863079768816
  println(always.value)
  // res8: Double = 3000.710688646907

}
