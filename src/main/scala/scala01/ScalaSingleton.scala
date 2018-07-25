package scala01

/**
  * scala singleton
  */

class ScalaSingleton private {
  def sayHello():Unit = {
    println("hello jop")
  }
}

object ScalaSingleton {
  var instant: ScalaSingleton = null

  def apply():ScalaSingleton ={
    if (instant == null) instant = new ScalaSingleton
    instant
  }
}


object TestSingleton{
  def main(args: Array[String]): Unit = {
    val t = ScalaSingleton()
    t.sayHello()
  }
}