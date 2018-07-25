package scala1

object ScalaWordCount {
  def main(fdsd:Array[String]): Unit ={
    //create list dataSource
    val lines = List("hello word hello java","hello java scala python","scala python")
    //split word from dataSource
    val words = lines.flatMap(_.split(" "))
    //check split result
    println(words)
    //change words to map
    val wordMap = words.map((_,1))
    //groupByKey
    val grouped = wordMap.groupBy(_._1)
    //check group result
    println(grouped)
    //reduceByKey
    val result = grouped.mapValues(_.size)
    //sorted the resutl
    val sortedResult = result.toList.sortBy(_._2)
    //check sorted result
    sortedResult.foreach(println)
    //reverse sorted result,change sort to desc
    val descSort = sortedResult.reverse
    //check desc sorted
    descSort.foreach(println)

    Console.print("test log")

  }
}
