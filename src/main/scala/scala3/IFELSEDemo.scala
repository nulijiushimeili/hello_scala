package scala3

object IFELSEDemo {
  def main(args: Array[String]): Unit = {
    testMatch()
  }

  def testIfElse(): Unit = {
    //代码块的值可以赋值给代码块
    val b = {
      println("init variable b")
      80
    }
    if (b > 100 && b < 0) {
      println("成绩输入有误,请重新输入")
    } else if (b >= 90) {
      println("你的成绩真棒")
    } else if (b >= 80) {
      println("成绩不错,再接再励")
    } else if (b >= 60) {
      println("成绩合格")
    } else {
      println("考试成绩不合格,明天请你们家长来一下学校")
    }

    println("*---------------------------------------------")
    //scala 中的三元操作符
    val c: String = if (b > 10) "true" else "false"
    println(c)
  }

  def testMatch(): Unit = {
    val a = {
      println(" init variable a")
      80
    }
    a%10 match {
      case 10 => println("wonderful!")
      case 9 => println("wonderful!")
      case 8 => println("great")
      case 7 =>println("normal")
      case 6 =>println("normal")
      case 5 => println("bad")
      case 4 => println("bad")
      case 3 => println("bad")
      case 2 => println("bad")
      case 1 => println("bad")
      case 0 => println("bad")
      case _ => println("input error")
    }

  }
}
