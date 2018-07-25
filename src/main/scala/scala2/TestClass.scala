package scala2

import scala.util.matching.Regex

object TestClass{

  /**
    * scala  regexp
    */
  def testRegex(): Unit ={
    val patten = "Scala".r
    val s = "cool".r
    val str = "Scala is scalable and cool."
    println(patten findFirstIn str)
    println(s findFirstIn  str)
  }

  def testRegex1(): Unit ={
    val patten = new Regex("(S|s)cala")
    val str = "Scala is scalable and cool"
    println(patten findFirstIn str)
    (patten findAllIn str).foreach(println)
  }

  def main(args: Array[String]): Unit = {
    testRegex1()
  }
}