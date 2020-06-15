
import scala.io.StdIn.readLine

object ReadingInputs extends App {


  val a =(1, 2,"Avi","Ravi")
  println (a._4)
  print("Enter your first name: ")
  val firstName = readLine()
  print("Enter your last name: ")
  val lastName = readLine()
  println(s"Your name is $firstName $lastName")

}
