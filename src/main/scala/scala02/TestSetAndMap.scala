package scala02

import scala.collection.mutable

object TestSetAndMap {
  def main(args: Array[String]): Unit = {
//    testSet()
//    testMutableSet()
//    testMap()
  testTuple()

  }

  def testTuple(): Unit ={
    val a = (12,3,4,5,6)
    println(a._1)
    for(i <- 0 until a.productArity){
      println(a.productElement(i))
    }
  }


  def testMutableMap(): Unit ={
    val c = mutable.HashMap[String,Int]()
    c("xiaomli")=20
    c += ("xiaoming"->15)
    c += ("xioafad"->15,"sfd"->23)

  }

  def showMapContain(): Unit ={
    val map = Map("java"->12,"python"->19)
    for((k,v) <- map){
      println(k + "----" + v)
    }
    for(k <- map.keySet)println(k)
    for(v <- map.values)println(v)
    for ((k,_) <- map)println(k +"----"+ map.getOrElse(k,null))
  }

  def testMap(): Unit ={
    val a = Map("hello"->"java")
    val b = Map("java"->12,"python"->19)
    println(a.get("cc"))
    println(b.getOrElse("cc",-1))
    println(b.getOrElse("java","ccc"))

  }


  def testSet(): Unit ={
    val s = Set(3,4,5,6,6)
    println(s.head)
    println(s.tail)
    println(s.contains(4))
    println(s(4))
    for(i <- s) println(i)
  }


  def testMutableSet(): Unit ={
    val ms = mutable.Set[Int]()
    ms += 1
    ms ++= Set(6,7)
    println(ms.head)
    println(ms.tail)

  }


}
