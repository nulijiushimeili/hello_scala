package scala3

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object MapReduce {
  def main(args: Array[String]): Unit = {
    val list = "hello,word,hello,wonder" ::
      "hadoop,hive,hive,hbase" ::
      "shuffle,hadoop,wonder,hello" :: Nil

    //    val l1 = list.map(v => {v})
    //    l1.foreach(println)
    //    var word = ListBuffer[String]()
    //    val arr = ArrayBuffer[String]()
    //    val l2 = list flatMap( x => {
    //
    //      if(!x.toString.equals(",")){
    //        arr.append(x)
    //      }else{
    //        word += arr.toString()
    //      }
    //      word
    //    })
    //    l2.foreach(println)

    //    l2.foreach(println)
    //    //println(l2.length)


  }
}
