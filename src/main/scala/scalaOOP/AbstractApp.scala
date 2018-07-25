package scalaOOP

/**
  * 抽象类的使用
  */
object AbstractApp {
  def main(args: Array[String]): Unit = {
    val stu2 = new Student2()
    stu2.speek
    stu2.name="joke"
    stu2.age=15

  }
}

abstract class Person2{
  def speek
  var name:String
  var age:Int


}

class Student2 extends Person2{
  override def speek: Unit = {
    println("speek")
  }

  override var name: String = _
  override var age: Int = _
}