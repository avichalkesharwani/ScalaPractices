package catsframework

import cats.Eval

object TypeEvalMonad extends App {

  val greeting = Eval.
    always { println("Step 1"); "Hello" }.
    map { str => println("Step 2"); s"$str world" }
  // greeting: cats.Eval[String] = cats.Eval$$anon$8@79ddd73b
  println(greeting.value)


  val ans = for {
    a <- Eval.now { println("Calculating A"); 40 }
    b <- Eval.always { println("Calculating B"); 2 }
  } yield {
    println("Adding A and B")
    a + b
  }
  // Calculating A
  // ans: cats.Eval[Int] = cats.Eval$$anon$8@12da1eee
  println(ans.value) // first access
  // Calculating B
  // Adding A and B
  // res16: Int = 42
  println(ans.value) // second access
  // Calculating B
  // Adding A and B
  // res17: Int = 42
  val saying = Eval.
    always { println("Step 1"); "The cat" }.
    map { str => println("Step 2"); s"$str sat on" }.
    memoize.
    map { str => println("Step 3"); s"$str the mat" }
  // saying: cats.Eval[String] = cats.Eval$$anon$8@159a20cc
  println(saying.value)// first access
  // Step 1
  // Step 2
  // Step 3
  // res18: String = The cat sat on the mat
  println(saying.value) // second access
  // Step 3

}
