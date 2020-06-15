package catsframework

object TestMonad extends App {


  // flatMap concept

  val first = List(2, 5)
  val second = List(4, 8)

  //using Map
  println(first.map( e1 => second.map(e2 => e1 * e2)))

  //using flatMap
  println(first.flatMap( f => second.map(s => f * s)))





}
