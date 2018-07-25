package scala1

/**
  * 类名前面加private是设置包的访问权限
  * 在构造器()前面加private代表的是伴生对象的访问权限,只有伴生对象才可以访问
  */

//设置包的访问权限
private[scala1] class PrivateDemo private(val gender: Int, val faceValue: Int) {
  //变量前加private是私有字段
  private val name: String = "xiaoming"
  //对象的私有字段,只能在本类中访问
  private[this] val age: Int = 12

  //私有方法
  private def sayHello(): Unit = {
    println(s"$name's age is $age")
  }

}

object PrivateDemo {
  def main(dfs: Array[String]): Unit = {
    val person = new PrivateDemo(1, 90)
    println(person.name)
    println(person.faceValue)
    person.sayHello()

  }
}