package scala01

//这两个传进来的参数默认是val的
class Person private(name: String, age: Int = 18) {
  //  val name = "jeclk"
  //  val age = 18

  //创建辅助构造函数
  def this() {
    this("tomson", 20)
    //注意点,辅助构造函数的第一行必须调用主构造函数
  }

  def this(name: String) {
    this(name, 20)
  }

  private val v1 = "213"
  //this 表示只在当前对象里生效,
  private[this] val v2 = "rwe"

  def v3(): String = v2

  def eat = s"$name} eat . . . "

  def watch(str: String): Unit = {
    println(s"$name} watching $str}")
  }

  def eq(other: Person): Boolean = {
    val tmp = this.v1 == other.v1
    if (tmp) {
      this.v2 == v3
    }
    tmp
  }

}

object Person {

  private val v3 = "jetty"

  def apply(name: String, age: Int = 18): Person = new Person("iojklllt", 33)

  def apply(): Person = new Person("fjslkdcc", 15)


  def main(args: Array[String]): Unit = {

    val p1 = Person()
    val p2 = Person("lopbom", 24)

    p1.watch("moves")
    p2.watch("TV")


  }


}
