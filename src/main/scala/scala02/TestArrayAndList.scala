package scala02

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object TestArrayAndList {
  def main(args: Array[String]): Unit = {
//    testArray02
//    testList()
//    testArrayBuffer()
println(sum(4,5,6,7))

  }

  def testArrayBuffer(): Unit ={
    val c = ArrayBuffer[Int]()
    c += 1
    c += 2
    c += (4,5,6)
    c ++= Array(7,8,9)
    for(i <- c)println(i)

    // 将可变的数组转换成不可变的数组
    c.toArray
    for(i <- c.reverse)println(i)
  }


  def testArray(): Unit ={
    val arr = Array(1,2,3,4,5)
    println(arr.length)
    println(arr(1))
    println(arr.max)
    println(arr.mkString)
    println(arr.mkString("<",",",">"))
  }

  def testArray02():Unit={
    val arr = new Array[String](5)
    arr.foreach(println)
    arr(2) = "hello"
    arr.foreach(println)
  }

  def testList():Unit={
    val l1 = List(1,2,3,7,4,5,6)
    println(l1(2))

    for(i <- l1) println(i)

    val l4 = l1.tail
    println(l4)
    println(l4.head)
  }

  def testListBuffer():Unit={
    var l2 = new ListBuffer[Int]
    l2 += 2
    l2 += (3,4,5)
    for(i <- l2)println(i)
    println(l2.head)
    l2 -= 3
    l2 --= List(4,5)
    for(i <- l2)println(i)

  }

  def sum (nums:Int*): Int ={
    if(nums.isEmpty){
      0
    }else{
      nums.head + sum(nums.tail:_*)
    }

  }


}
