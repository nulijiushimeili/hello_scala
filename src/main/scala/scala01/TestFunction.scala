package scala01

object TestFunction {
  def main(args: Array[String]): Unit = {
    println(addInt(4, 5))
    println(addInt2(4, 5))
    println(addInt3(3,4))
    println(addInt4(4,5))
  }

  def addInt(a: Int, b: Int): Int = {
    val total = a + b
    total
  }

  def addInt2(a: Int, b: Int): Int = {
    a + b
  }

  def addInt3(a: Int, b: Int) = a + b

  val addInt4 = (a: Int, b: Int) => a + b
}
