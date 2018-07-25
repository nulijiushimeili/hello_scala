package scala01

/**
  * 科里化练习
  */
//这个静态类必须写在调用的函数的前面,否则会找不到这个静态类里面的变量
//也可以将这个静态类写在另一个文件里面,就不会出错了
object Context {
  implicit val a: String = "Java"
  implicit val b: String = "python"
}

object TestCurrying {
  //创建一个科里化的函数
  def say(hello: String)(implicit name: String = "scala") {
    println(hello + name)
  }

  def main(args: Array[String]): Unit = {
    //调用隐式转换
    import Context.a
    say("Hello,")
  }
}
