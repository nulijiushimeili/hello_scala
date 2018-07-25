package scala4

object TestIterable {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
//    grouped方法返回迭代器
    val git = list grouped 3
    println(git.next())
    println(git.next)

    //siliding 方法返回迭代器
    val sit = list sliding 3
    println(sit.next())
    println(sit.next())
    println(sit.next())

  }
}
