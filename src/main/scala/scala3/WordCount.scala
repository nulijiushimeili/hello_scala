package scala3

import java.io.File

import scala.io.Source

object WordCount {
  def main(args: Array[String]): Unit = {
    val dirFile = new File("D:\\mycode1\\hadoop\\note\\ha_conf_")
    val files = dirFile.listFiles()
    for (file <- files) println(file)
    val listFiles = files.toList
    var wordsMap = scala.collection.mutable.Map[String, Int]()
    listFiles.foreach(file => Source.fromFile(file).getLines().foreach(line =>
      line.split(" ").foreach(word => {
        if (wordsMap.contains(word)) wordsMap(word) += 1 else wordsMap += (word -> 1)
      })))
    println(wordsMap)
    for (kv <- wordsMap) println(s"${kv._1}:${kv._2}")

  }
}
