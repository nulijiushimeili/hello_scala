package scala3

object PatternDemo3 {
  def main(args: Array[String]): Unit = {
    def f3(any: Any): Unit = {
      any match {
        case any: Int => println(any.toInt)
        case any: String => println(any)
        case other =>println(other)
      }
    }

    f3("sdfsdfdf")

    val map: Map[Int, String] = Map(1 -> "a", 2 -> "b")
    val opt: Option[String] = map.get(1)
    val opt1: Option[String] = map.get(4)
    opt match {
      case Some(value) => println(s"value = $value")
      case None => println(s"None")
    }
    opt1 match {
      case Some(value) => println(s"value = $value")
      case None => println(s"None")
    }

  }
}
