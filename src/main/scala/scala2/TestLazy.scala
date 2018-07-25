package scala2

object TestLazy {
  def main(args: Array[String]): Unit = {
    lazy val call = init()
    println("被lazy修饰的变量要等到被调用的时候才会开始执行")
    println(call)
  }

  def init(){
    println("init()被调用了")
  }

}
