package scala5

import scala.util.Random

/**
  * 模式匹配(匹配字符串)
  */

object MatchDemo {
  def main(df:Array[String]): Unit ={
    val arr = Array("guanxiaotong","yangying","yangzi","zhengshuang")
    val num = Random.nextInt();println(num)  //随机返回int类型的数值,给定参数以后,会返回0-param之间的数
    var name = arr(Random.nextInt(arr.length))
    println(name)
    name match {
      case "yangzi" => println("杨紫")
      case "yangying" => println("杨颖")
      case "zhengshuang" => println("郑爽")
      case "guanxiaotong" => println("关晓彤")
      case _ => println("Nothing")
    }




  }
}
