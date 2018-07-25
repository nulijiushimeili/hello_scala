package scala01

/**
  * 一个简单的scala类继承和实现
  */
object ClassDemo {
  def main(args: Array[String]): Unit = {
    val butterfly = new Butterfly()
    butterfly.climb()
    butterfly.fight()
  }
}

/**
  * trait  特质
  */
trait Fly{
  //声明一个没有值的字段
  val distance :Int
  //声明一个没有实现的方法
  def fight()
  //一个实现了的方法
  def fly(): Unit ={
    println("I can fly ...")
  }
}

/**
  * abstract 抽象类
  */
abstract class Animal{
  //声明一个没有值的字段
  val name :String
  //声明一个没有实现的方法
  def run()
  //一个实现了的方法
  def climb(): Unit ={
    println("I can climb ...")
  }
}

class Butterfly extends Animal with Fly{
  override val name: String = "butterfly"

  override def run(): Unit = {println("I can not run .")}

  override val distance: Int = 100

  override def fight(): Unit = {println("I nover fight with someone.")}
}