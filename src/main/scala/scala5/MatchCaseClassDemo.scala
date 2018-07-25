package scala5

import scala.util.Random

/**
  * 匹配样例类
  */

case class HeartBeat(time:Long)
case object CheckTimeoutTask
case class SubmitTask(id:String,name:String)

object MatchCaseClassDemo {
  def main(dfs:Array[String]): Unit ={
    val arr = Array(HeartBeat(3000),CheckTimeoutTask,SubmitTask("1231","wordcount"))
    arr(Random.nextInt(arr.length)) match {
      case HeartBeat(time) => println("set heartbeat:3000")
      case CheckTimeoutTask => println("Task status is normal")
      case SubmitTask(port,task) => println("Task will running at cluster")
    }

  }
}
