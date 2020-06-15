package catsframework


object TestMonoid extends App {
/*
   A binary associative operation that takes two values of type A and combines them into one.
   A value of type A that is an identity for that operation.

   A very simple example is foldMap. Just by plugging in different monoids into this single function, you can compute:

    the first and the last element,
    the sum or the product of elements (from this also their average etc.),
    check if all elements or any has a given property,
    compute the maximal or minimal element,
    map the elements to a collection (like lists, sets, strings, Text, ByteString or ByteString Builder) and concatenate them together - they're all monoids.
    Moreover, monoids are composable: if a and b are monoids, so is (a, b). So you can easily compute several different monoidal values in one pass (like the sum and the product when computing the average of elements etc).

    And although you can do all this without monoids, using foldr or foldl,
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

 /*

 In the standard scala collections(Sequence, Vectors, Lists , Ranges etc) there exist these methods
 fold, foldLeft, foldRight - which are used to aggregate values together to return a single value,
 these methods takes monoids as input parameters.

 */


  //Monoid[Map[String,Int]].combineAll(List(Map("a" -> 1, "b" -> 2), Map("a" -> 4)))







}
