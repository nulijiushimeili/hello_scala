package scala01

import scala.util.control.Breaks

object TestScalaBreak {
  def main(args: Array[String]): Unit = {
    //使用Breaks类终止循环
    val break = Breaks
    var a = 0
    while (true) {
      a = a + 1
      println(a)
      if (a > 5) break.break()
    }
  }
}

