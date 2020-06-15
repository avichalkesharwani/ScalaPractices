package practices

trait Speaker {
  def speak(): String
}

trait TailWagger {
  def startTail(): Unit
  def stopTail(): Unit
}

trait Runner {
  def startRunning(): Unit
  def stopRunning(): Unit
}


class Dog extends Speaker with TailWagger with Runner {

  // Speaker
  def speak(): String = "Woof!"

  // TailWagger
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

  // Runner
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")

}

object TestMultiTraits extends App
{
  val g = new Dog();
  g.startRunning();
  g.startTail()
  g.speak()
  g.stopRunning()
  g.stopTail()

}
