package catsexercise

import cats.Monad

object TestMonad2 extends App {

  import cats.instances.option._ // for Monad Monad[Option].flatMap(Option(1))(a => Option(a*2))
  // res0: Option[Int] = Some(2)
  import cats.instances.list._ // for Monad
  println(Monad[List].flatMap(List(1, 2, 3))(a => List(a, a*10)))
  // res1: List[Int] = List(1, 10, 2, 20, 3, 30)
  import cats.instances.vector._ // for Monad
  println(Monad[Vector].flatMap(Vector(1, 2, 3))(a => Vector(a, a*10)))
  // res2: Vector[Int] = Vector(1, 10, 2, 20, 3, 30)

  /*
  Implement pure, map, and flatMap for Id! What interes􏰀ng discoveries do you uncover about the implementa􏰀on?
   */


  import cats.Id
  def pure[A](value: A): Id[A] =
    value
  def map[A, B](initial: Id[A])(func: A => B): Id[B] = func(initial)

  def flatMap[A, B](initial: Id[A])(func: A => Id[B]): Id[B] = func(initial)

  flatMap(123)(_ * 2)
  print(pure(123))




}
