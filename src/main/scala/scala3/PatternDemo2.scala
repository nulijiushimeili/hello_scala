package scala3

import java.io.IOException

object PatternDemo2 {
  def main(args: Array[String]): Unit = {

    //在scala中匹配异常
    def f2(throwable: Throwable): Unit = {
      throwable match {
        case e: IOException => println("文件读写失败")
        case e: RuntimeException => println(s"运行时发生错误${e.getMessage}")
        //count 匹配任意值,并且将count的值赋值给e,e在处理部分可能会用到
        case _ => println(s"未知异常")
      }
    }

    f2(new RuntimeException(",发生未知错误"))


  }
}
