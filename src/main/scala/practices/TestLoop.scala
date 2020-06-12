package practices



object TestLoop extends App {

  val ratings = Map(
  "Lady in the Water"  -> 3.0,
  "Snakes on a Plane"  -> 4.0,
  "You, Me and Dupree" -> 3.5
  )

  for ((name,rating) <- ratings) println(s"Movie: $name, Rating: $rating")

  // Another way of printing it
  ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
  }


}