package scala2

import scala.collection.mutable.ArrayBuffer

/**
  * 模式匹配
  */
object TestMatch02 {
  def main(args: Array[String]): Unit = {
//    matchInt()
//    matchWithCondition()
//    useMatchedData()
    matchCaseClass()
  }

  def matchInt(): Unit ={
    for(i <- 1 to 10){
      i match{
        case 1 => println("one")
        case 2 => println("two")
        case 5 => println("five")
        case _ => println("xxxx")
      }
    }
  }

  /**
    * 注意点: 使用case匹配的时候必须要有 case _ =>
    * 否则会抛匹配异常
    */
  def matchWithCondition(): Unit ={
    for(i<- 1 to 100){
      i  match {
        //增加守卫条件
        case _ if i % 4 == 0 => println(i+":能被4整除")
        case _ if i % 3 == 0 => println(i+":能被3整除")
        case _ =>
      }
    }
  }

  def useMatchedData(): Unit ={
    val list = new ArrayBuffer[Int]()
    for(i <- 1 to 100){
      i match{
        case _ if i % 10 == 0 => list.append(i)
        case _ =>
      }
    }
    for(i <- list){
      println(i)
    }
  }

  /**
    * 使用case class 进行模式匹配
    *
    */
  def matchCaseClass(): Unit ={
    val p = Person(1,"Tom")
    p match{
      case Person(1,"Tom") => println("Hi,I am Tom!")
      case _ =>
    }
  }

}

case class Person(id:Int,name:String)