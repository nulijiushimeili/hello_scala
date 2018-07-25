package scala3

//创建文件
import java.io.PrintWriter

import scala.io.Source
object IoTest {
  def main(args: Array[String]): Unit = {
    read()
  }

  def out(): Unit ={
    val outFile = {
      new PrintWriter("D:\\tmp\\1.txt")
    }
  }

  //读取文件中的内容
  def read(): Unit ={
    val readFile = Source.fromFile("D:\\tmp\\abc.txt")
    val contexts = readFile.getLines()   //返回的结果是个迭代器
    for(con <- contexts) println(con)
  }

}
