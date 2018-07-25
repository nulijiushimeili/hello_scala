package scala1

object TestCollection {
  def main(fds:Array[String]): Unit ={
    //定义一个int类型的数组
    val arr1 = new Array[Int](8)
    arr1.foreach(print)
    println()
    println("--------------------------")

    //定义一个String类型的数组
    val arr2 = new Array[String](8)
    arr2.foreach(print)
    println()
    //转换成数组的缓冲
    println(arr2.toBuffer)
    println("--------------------------")

    //
    val arr3 = Array("scala","java","python")
    arr3.foreach(println)




  }
}
