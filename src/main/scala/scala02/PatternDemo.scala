package scala02

import scala.util.Random

object PatternDemo {
  def main(args: Array[String]): Unit = {
    //    matchType("hello")
    matchString()
    println(testJudgeGrade("A"))
    println(testJudgeGrade2("xiaoming", "E"))
    greeting(Array("zhangsan"))
    greeting(Array("zhangsan","lisi"))
    greeting(Array("zhangsan","lisi","wangwu"))
    greeting(Array("zhangsan","lisi","wangwu","laolao"))

  }

  /**
    *
    */
  def greeting(array:Array[String]): Unit ={
    array match{
      case Array("zhangsan")=>println("zhang san")
      case Array(x,u) => println("any two friends")
      case Array("zhangsan",_*)=>println("zhangsan and his friends")
      case _ => println("everybody!")
    }
  }

  /**
    * 双重判断
    *
    * @param name
    * @param grade
    * @return
    */
  def testJudgeGrade2(name: String, grade: String): String = {
    grade match {
      case "A" => "Excellent.."
      case "B" => "good"
      case "C" => "just so so "
      case _ if name.equals("xiaoming") => " you need work harder"
      case _ => " you need work harder"

    }
  }


  def testJudgeGrade(grade: String): String = {
    grade match {
      case "A" => "Excellent.."
      case "B" => "good"
      case "C" => "just so so "
      case _ => " you need work harder"

    }
  }

  def matchString(): Unit = {
    val names = Array("aos", "bdd", "www", "dfs")
    val name = names(Random.nextInt(names.length))
    name match {
      case "aos" => println("aaa")
      case "bdd" => println("bbb")
      case "www" => println("www")
      case "dfs" => println("dfs")
      case _ => println("sorry, not matched.")
    }
  }

  /**
    * match type
    *
    * @param obj  matched object
    */
  def matchType(obj: Any): Unit = {
    obj match {
      case x: Int => println("integer")
      case s: String => println("string")
      case b: Boolean => println("boolean")
      case _ => println("other type")
    }
  }

}
