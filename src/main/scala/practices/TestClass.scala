package practices

class Rect(private var l: Float, private var b: Float) {
  def area(): Float = { l * b }
  def setLength(length: Float): Unit = { l = length }
  def setBreadth(breadth: Float): Unit = { b = breadth }
}

object TestRect {
  def main(args: Array[String]): Unit = {
    val r = new Rect(3.3f, 4.4f)
    println(r.area)

    r.setLength(3.09f)
    r.setBreadth(5.99f)
    println(r.area)
  }
}