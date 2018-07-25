package scala2

/**
  * 直接将属性方法构造器里面
  *
  * @param num1  数值1
  * @param num2  数值2
  */
class Counter(val num1: Int, val num2: Int) {
  def count(): Unit = {
    println(num1 + num2)
    println(str)
  }
  val str: String = Counter.show()

}

object Counter {
  def show(): String={
    println("看看class能不能调用object中的方法")
    "show()被调用了"
  }

  def main(args: Array[String]): Unit = {
    val counter = new Counter(12, 25)
    counter.count()

  }
}