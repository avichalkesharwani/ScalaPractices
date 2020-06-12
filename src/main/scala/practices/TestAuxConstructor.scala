package practices



// the primary constructor
class Pizza (var crustSize: Int, var crustType: String){




  // one-arg auxiliary constructor
  def this(crustSize: Int) {
    this(crustSize, "THIN")
  }

  // one-arg auxiliary constructor
  def this(crustType: String) {
    this(12, crustType)
  }

  // zero-arg auxiliary constructor
  def this() {
    this(12, "THIN")
  }

  override def toString = s"A $crustSize inch pizza with a $crustType crust"

}



object TestAuxConstructor {
  val DefaultCrustSize: Int = 12
  val DefaultCrustType: String = "THIN"

  def main(args: Array[String]): Unit = {
    val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
    val p2 = new Pizza(DefaultCrustSize)
    val p3 = new Pizza(DefaultCrustType)
    val p4 = new Pizza()
    println(p1)
    println(p2)
    println(p3)
    println(p4)
  }

}