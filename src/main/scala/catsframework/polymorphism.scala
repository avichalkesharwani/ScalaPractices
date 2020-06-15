package catsframework

object polymorphism extends App {


  //Parametric Polymorphism

  def head[A](xs: List[A]): A = xs(0)
  println(head(1 :: 2 :: Nil))

  case class Car(make: String)
  head(Car("Civic") :: Car("CR-V") :: Nil)

  // Subtype polymorphism
  //Problem: Depending on the type A, we need to provide different definition for what it means to add them
  // def plus[A](a1: A, a2: A): A = ???

  //One way is subtyping, A <: PlusIntf[A]


  trait PlusIntf[A] {
    def plus(a2: A): A
  }

  def plusBySubtype[A <: PlusIntf[A]](a1: A, a2: A): A = a1.plus(a2)

 //plusBySubtype(5,6)   cant work with Int and String

  //Ad-hoc Polymorphism

  /*
  we can provide separate function definitions for different types of A
  we can provide function definitions to types (like Int) without access to its source code
  the function definitions can be enabled or disabled in different scopes

   */
  trait CanPlus[A] {
    def plus(a1: A, a2: A): A
  }

  def plus[A: CanPlus](a1: A, a2: A): A = implicitly[CanPlus[A]].plus(a1, a2)

}
