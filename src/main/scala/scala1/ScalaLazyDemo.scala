package scala1

/**
  * Scala 中用lazy加载的变量是延迟加载的变量
  * 使用lazy修饰的变量,只能是val定义的变量,否则会出现受查异常
  * 只有这个变量在调用的时才会实例化这个变量
  */

class ScalaLazyDemo {

}

object ScalaLazyDemo1{
  def init(): Int ={
    println("call init() ...")
    5
  }
  def main(fds:Array[String]): Unit ={
    lazy val property = init()   //使用lazy修饰以后,只能在变量调用后才会实例化
    println("after init . . . ")
    //println(property)
  }

}
