package scala01

import java.io.File

import scala.collection.mutable
import scala.io.Source

/**
  * 使用scala对目录下的所有文件进行词频统计
  */
object ScalaWordCount {
  def main(args: Array[String]): Unit = {
    //获取文件对象
    val file = new File("D:\\mycode1\\program\\spark\\spark01\\src\\main\\resources")
    //获取目录中的文件列表
    val files = file.listFiles()
    //定义一个可变的map集合,注意要导包
    var wordMap = mutable.Map[String, Int]()
    //获取目录下每个文件的每一行
    files.foreach(file => Source.fromFile(file).getLines()
      //将每一行切分成单个单词
      .foreach(_.split(" ")
        .foreach { word =>
          //如果map中包含迭代器中的单词,就给该单词所对应map的value+1
          //    contains() 集合中是否包含某个元素
          if (wordMap.contains(word))
            wordMap(word) += 1
          else
          //如果不包含这个元素,向集合中添加这个元素
            wordMap += (word -> 1)
        }))
    wordMap.foreach(println)

  }
}
