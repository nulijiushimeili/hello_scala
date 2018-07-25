package scala1

/**
  * 偏函数匹配(主要用作输入模式匹配)
  */

object MatchFunction {

  //偏函数匹配
  //PartialFunction[传入的参数类型,返回值类型]
  def mf: PartialFunction[Int, String] = {
    case 1 =>
      "one"
    case 2 =>
      "two"
    case 3 =>
      "three"
  }

  def main(args: Array[String]): Unit = {
    println(mf(3))
  }
}
