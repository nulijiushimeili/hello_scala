package scala5

object ClassDemo {
  def main(sdf: Array[String]): Unit = {
    val p = new Human
    p.fight
    p.fly()
    println(p.run())
  }
}

/**
  * trait 特质
  */
trait Flyable {

  //声明一个没有值的字段
  val instance: Int

  //声明一个没有实现的方法
  def fight()

  //声明一个实现了的方法
  def fly(): Unit = {
    println("I can fly")
  }

}

/**
  * abstract 抽象类
  */
abstract class Animal {
  //声明一个没有赋值的字段
  val name: String

  //声明一个没有实现的方法
  def run(): String

  //声明一个实现了的方法
  def climb(): Unit = {
    println("I can climb")
  }
}

class Human extends Animal with Flyable {
  override val name: String = "xiaoming"

  override def run(): String = {
    s"$name is running now"
  }

  override val instance: Int = 1000

  override def fight(): Unit = {
    println(s"$name enjoy fight")
  }
}


