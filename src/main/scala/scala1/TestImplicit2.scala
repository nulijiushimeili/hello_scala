package scala1

import MyPredef2.readFile2
import MyPredef2.add2

import scala.io.Source

class TestImplicit2(val filePath:String){
  def readFile2():String={
    Source.fromFile(filePath).mkString
  }
}


class TestImplicit4(val num2:Int){
  def add2(num1:Int):Int={
    num1 + num2
  }
}

/**
  * 测试隐式转换
  */
object TestImplicit2 {
  def main(args: Array[String]): Unit = {
    println("D:\\tmp\\word.txt".readFile2())
    println(4.add2(6))
  }
}
