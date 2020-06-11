package practices

case class TestCaseClass(name: String, age: Int)
// USed as data transfer object


object TestCaseClassDriver {
  def main(args: Array[String]) {
    // apply methods generated
    val p1 = TestCaseClass("Avichal", 40)
    val p2 = new TestCaseClass("Ravi", 32)
    // equals method generated
    println(p1 == p2)
    // copy method generated
    val p3 = p1.copy(name = "Ganesh")
    println(p3.toString())

    // Writing switch case inside the println
    println {
      p2.name match {
        case "Avichal" => "Match found..."
        case _ => "No suitable match found..."
      }

    }
  }
}
