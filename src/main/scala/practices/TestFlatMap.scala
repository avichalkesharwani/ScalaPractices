package practices


object TestFlatMap extends App {

  val numList1 = List(1, 2)
  val numList2 = List(3, 4)

  print(numList1 flatMap { x =>
    numList2 map {
      y => x + y
    }
  } )

}



/*

// Another way to present this (instead of {} , I used . operator )

object TestFlatMap extends App {

  val numList1 = List(1, 2)
  val numList2 = List(3, 4)

  print ( numList1.flatMap(x =>
    numList2.map(
      y => x + y
    )))
}

 */


// Without Monad you can also write it as :
/*
object TestFlatMap extends App {
  var numList1 = List(1, 2)
  var numList2 = List(3, 4)

   for{ first <- numList1
       second <- numList2
      } yield (first + second )

}
*/