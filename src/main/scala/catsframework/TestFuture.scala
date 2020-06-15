package catsframework
import cats.data.OptionT
import cats.implicits._

object TestFuture extends App {

/*

  val response = Future.successful(Option(10))
  response.map( fut => fut.map( int => int + 30 ))

  // Cat specific optionT
  val responseT = OptionT(response)  //wrapping your future option with optionT
  val responseAdded = responseT.map(_ + 30)
  val responseWithDefault = responseT.getOrElse(5)
  responseAdded.value


*/

/*
USe Case:

The typelevel cats library optionT data type makes it easy for one to manipulate the content of future of an option.
If you have played around with asynchronous database libraries such as slick, reativemongo(scala mongoDB driver) or
phantom(Scala Cassandra driver) its no news that the db IO response types are Future[Option[ResultSet]],
to manipulate such return types using cats is awesome.

 */

}
