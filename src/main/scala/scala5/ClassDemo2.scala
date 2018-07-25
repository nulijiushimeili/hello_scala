package scala5

object ClassDemo2 {
  def main(args: Array[String]): Unit = {
    val bird = new Bird()
    bird.fly()
    bird.run()
    bird.say()
  }
}

abstract class Fly{
  def fly()
  def say(): Unit ={
    println("ga ... ga ...")
  }
}

trait Run{
  def run()
}

class Bird extends Fly with Run{
  override def run(): Unit = {
    println("I can run ...")
  }

  override def fly(): Unit = {
    println("I can fly")
  }
}