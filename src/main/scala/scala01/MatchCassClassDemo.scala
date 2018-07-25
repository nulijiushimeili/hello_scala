package scala01

import scala.util.Random

/**
  * 匹配样例类
  *
  * @param time
  */
case class HeartBeat(time: Long)

case object CheckTimeOutTask

case class SubmitTask(id: String, name: String)

object MatchCassClassDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(HeartBeat(3000), CheckTimeOutTask, SubmitTask("1003", "WordCount"))
    arr(Random.nextInt(arr.length)) match {
      case HeartBeat(time) => if (time > 3000) println("timeout") else println("normal")
      case CheckTimeOutTask => println("It is checking now...")
      case SubmitTask(id, name) => println("Task will running in cluster.")
      case _ => println("一切正常")
    }
  }
}
