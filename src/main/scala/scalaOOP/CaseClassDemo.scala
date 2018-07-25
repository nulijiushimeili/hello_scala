package scalaOOP

/**
  * case calss
  */
class CaseClassDemo {
  def main(args: Array[String]): Unit = {
    println(Dog("wangcai").name)
  }
}

/**
  * case class 不用new 可以直接使用
  * @param name
  */
case class Dog(name:String)