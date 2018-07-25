package scala01

object ForLoopDemo {
  def main(args: Array[String]): Unit = {
    //最原始的99乘法表
    //    for(i <- 1 to 9) {
    //      for (j <- 1 to i) {
    //        print(s"$j * $i = ${i*j} \t")
    //      }
    //      println()
    //    }
    //变形1
    //    for( i <- 1 to 9 ; j <- 1 to i){
    //      print(s"${j} * ${i} = ${i*j} \t" )
    //      if(i == j) println()
    //    }
    //变形2
    for {i <- 1 to 9
         j <- 1 to i} {
      print(s"$j * $i = ${i * j} \t")
      if (i == j) println()
    }

    //for循环的守护模式
    for (i <- 1 to 10 if i < 5) {
      print(i)
    }
    println()

    //for循环中使用continue
    for (i <- 1 to 6 if i != 3) {
      print(i)
    }

    //使用yield关键字,得到对循环中的每个元素进行操作并返回
    val arr = for(i <- 1 to 10) yield i * 2
    for(j <- arr)println(j)

  }
}
