package scala2

object TestApply {
  def apply(param1: String, param2: String):String = {
    println("Apply method called")
    param1 + ", " + param2
  }

  def main(args: Array[String]): Unit = {
//    val group: String= TestApply("张飞","刘备")
//    println(group)
  }
  println(apply("xiaoming","xiaohong"))
}
