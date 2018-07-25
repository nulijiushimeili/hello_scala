package scala3

object Function {
  def main(args: Array[String]): Unit = {
    println(max(5, 10))

  }

  //定义一个普通函数
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

  //定义一个无参函数
  def f: Int = {
    49
  }

  //定义一个匿名函数
  var max2: (Int, Int) => Int = (x: Int, y: Int) => {
    x + y
  }

  //参数可以给定默认值
  def say(a: String = "hello", b: String = "word"): Unit = {
    println(a + b)
  }

  //  say("hhaha")

  //定义一个带有可变参数列表的函数,可变参数必须放在最后
  def params(s: String*): Unit = {}

  var arr = Array("nishahio", "sdfgsdg", "dfgs")
  params(arr: _*)

  def max3(x: Int)(y: Int): Int = if (x > y) x else y

  println(max3(2)(3))

  var max4: Int => Int => Int = max3
  var max5 = max4(5)
  println(max5(10))

}
