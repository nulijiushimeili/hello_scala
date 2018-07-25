package scala01

import scala.util.Random

/**
  * 模式匹配
  */
object MatchDemo {
  def main(args: Array[String]): Unit = {
    val list = List("Yangzi","Wangdachui","Wangbaoqiang","Lixiaolu")
    val name = list(Random.nextInt(list.size))
    println(name)
    name match{
      case "Yangzi"=>println("杨紫")
      case "Wangdachui"=>println("王大锤")
      case "Lixialu"=>println("李小璐")
      case _=>println("没有匹配到...")
    }
  }
}
