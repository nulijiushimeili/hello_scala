package scala1

object TestScala {
  def main(fd: Array[String]): Unit = {
    //在scala中if语句计算出来的结果可以赋值给一个变量,在java中是不可以的
    val testif = if (5 > 0) 1 else 0
    println(testif)
    println("--------------------------")

    //while
    var i = 0
    while (i < 10) {
      print(i)
      i += 1
    }
    println()
    println("--------------------------")
    //test do while
    var j = 10
    do {
      print(j)
      j -= 1
    } while (j > 0)
    println()
    println("-----------------------------")

    //for & for by
    for (i <- 1 to 5) print(i)
    println()
    for (j <- 1 to 5 by 2) print(j)
    println()

    //
    for (i <- 1 to 5 if i != 3) print(i)


  }
}
