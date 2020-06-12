


/**
//Example 1: App trait has its own main method, so you don’t need to write one
object Hello2 extends App {
  println("Hello, world")
}


*/

//Example 2: App trait has its own main method, so you don’t need to write one

object HelloYou extends App {
  if (args.size == 0)
    println("Hello, you")
  else
    println("Hello, " + args(0))

  //another String feature for concatinating, for num use ${}

  println(s"1+1 = ${1+1}")
}


/**

$ scala HelloYou
Hello, you
$ scala HelloYou Al
Hello, Al

 */