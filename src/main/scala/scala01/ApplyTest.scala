package scala01

/**
  * 伴生对象
  */
class ApplyTest {
  val name = "clow"

  def apply() = {
    println("class ApplyTest--apply()...")
  }
}

// object 下的成员默认都是静态的
object ApplyTest {
  def apply() = {
    println("object ApplyTest--apply()...")
    new ApplyTest()
  }
}

object TestAbove {
  def main(args: Array[String]): Unit = {
    // 类名() -> 调用了object下的apply方法
    var a1 = ApplyTest()
    println(a1.name)
    // 对象名() -> 调用了class的apply方法
    a1()
  }

}
