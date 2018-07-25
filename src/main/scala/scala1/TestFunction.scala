package scala1

/**
  * 高阶函数
  */

object TestFunction {
  def main(args:Array[String]): Unit ={
    def func:Int => Int = x => x * x
    println(func(4))
    val arr = Array(1,2,3,4,5,6)
    val arr2 = arr.map(func)
    arr2.foreach(println)
  }
}
