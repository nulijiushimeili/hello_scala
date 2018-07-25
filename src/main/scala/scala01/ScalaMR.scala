package scala01

import scala.collection.mutable

object ScalaMR {
  def main(args: Array[String]): Unit = {
    val list = "hello,word,hello,wonder" ::
      "hadoop,hive,hive,hbase" ::
      "shuffle,hadoop,wonder,hello" :: Nil
    var wordMap = mutable.Map[String, Int]()
    list.foreach(word => word.split(",").foreach { x =>
      if (wordMap.contains(x)) wordMap(x) += 1 else wordMap += (x -> 1)
    })
    wordMap.foreach(println)
  }
}
