package scala3

object ForDemo {
  def main(args: Array[String]): Unit = {
    val arr = 0 to 10

    //最基本的for循环
    for(i <- arr){
      print(i + " ")
    }
    println()

    //for循环的守护模式
    println("for循环的break")
    for(i <- arr if i < 5){
      print(i + " ")
    }
    println()

    //for循环中的continue
    println("for循环的continue")
    for(i <- arr if i != 5){
      print(i + " ")
    }

  }
}
