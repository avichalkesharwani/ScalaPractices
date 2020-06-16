package catsframework

object TypeLAzy extends App {

  lazy val z = {
    println("Computing Z")
    math.random
  }
  // z: Double = <lazy>
  println(z) // first access
  // Computing Z
  // res4: Double = 0.45707125364871903
  println(z) // second access
  // res5: Double = 0.45707125364871903


  def y = {
    println("Computing Y")
    math.random
  }
  // y: Double
  println(y) // first access
  // Computing Y
  // res2: Double = 0.5548281126990907
  println(y) // second access
  // Computing Y
  // res3: Double = 0.7681777032036599
}
