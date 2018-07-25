package scala3

object FuncDemo1 {
  def main(args: Array[String]): Unit = {
    def max(x: Int, y: Int): Int = {
      if (x > y) x else y
    }

    println(max(3, 4))

    def a(): Unit = {
      println("hello")
    }

    a()

    def b(): Unit = {
      println("word")
    }

    b()

  }

}
