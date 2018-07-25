package scala1

import scala.util.Random

/**
  * 模式匹配(类型匹配)
  */

object MatchType {
  def main(df:Array[String]): Unit ={
    val matchTest = new MatchTest
    val list = List(matchTest,"hello",123,3.14,true)
    val element = list(Random.nextInt(list.size))
    println(list.size)
    println(element)
    element match {
      case str:String => println("Match String")
      case num:Int => println("Match Int")
      case dob:Double => println("Match Double")
      case matchType:MatchTest => println("Match MatchTest")
      case _ :Any => println("Nothing matched")
    }

  }
}
class MatchTest{}