package scala1

import scala.collection.mutable

object TestMap {
  // tow methods for create map
  def createMap(): Unit = {
    val map2 = Map("java" -> 1, "scala" -> 2, "python" -> 3)
    map2.foreach(println)
    println("-----------------------")
    val map1 = Map(("c", 4), ("c++", 5), ("c#", 6))
    map1.foreach(println)
  }

  def testGetOrElse(): Unit = {
    val map3 = Map("java" -> 1, "scala" -> 2, "python" -> 3)
    //直接这样获取的话会报错
    //map3("go")
    //通常情况下我们会用getOrElse这个方法来获取
    val value = map3.getOrElse("ruby", -1) //当需要获取的key值不存在的时候,可以返回我们指定的值
    println(value)

  }

  def testMap(): Unit = {
    val map1 = new mutable.HashMap[String, Int]()
    //put element to Map
    map1 += (("java", 1))
    map1.foreach(println)
    map1.put("python", 2)
    map1.foreach(println)
    //remove element,just point key for the method
    map1.remove("java")
    map1 -= "python"
    map1.foreach(println)
  }


  def main(jkl: Array[String]): Unit = {
    //createMap
    testGetOrElse()

  }

}
