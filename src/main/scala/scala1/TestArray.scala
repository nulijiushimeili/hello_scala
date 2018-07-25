package scala1

import scala.collection.mutable.ArrayBuffer

object TestArray {
  def testArray(): Unit ={
    val arr1 = new Array[String](2)
    arr1(0) = "spark"
    arr1(1) = "scala"
    arr1.foreach(println)

    val arr2 = Array(1,3,5,6,7)
    arr2.foreach(println)

    val arr3 = arr2.filter(_ > 5)
    arr3.foreach(println)

  }
  def testMutableArray(): Unit ={
    //定义变长的数组
    var arr4 = ArrayBuffer(2,3,4,5,5)
    arr4 += 8
    arr4.foreach(println)
    arr4.clear()
    println(arr4.size)
    arr4.insertAll(0,Array(1,2,3))
    arr4.foreach(println)
  }

  def main(args: Array[String]): Unit = {
    //testArray()
    testMutableArray()
  }
}
