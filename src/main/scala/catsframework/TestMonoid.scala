package catsframework

object TestMonoid extends App {
/*
   A binary associative operation that takes two values of type A and combines them into one.
   A value of type A that is an identity for that operation.
*/

  trait Monoid[A]{
    def combine(x: A , y: A): A
    def empty: A
  }

  //#for int addition the monoid will look this
  val intAddition = new Monoid[Int]{
    def combine(x:Int, y:Int) = x + y
    def empty = 0
  }

  // #for int multiplication we have
  val intMultiplication = new Monoid[Int]{
    def combine(x:Int, y:Int) = x*y
    def empty = 1
  }

  //#for string concatenation we have

  val stringMonoid = new Monoid[String]{
    def combine(x:String, y:String) = x + y
    def empty = ""
  }


}
