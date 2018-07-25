package scala3

object ForDemo3 {
  def main(args: Array[String]): Unit = {
    var names = Array("hello  ", "row "," dfd",    "        ","fslk")
    names.foreach(println)
//    for(name <- names if name.trim.nonEmpty){
//      print(name.trim + "\t")
//    }
//    println()

    for{name <- names
      tempName=name.trim
      if tempName nonEmpty
    }{
      print(tempName + " ")
    }


//    //使用yield创建一个新的集合
//    var nlist = for(i <- 0 to 10) yield{
//      print(i + " ")
//      i * 2
//    }
//    println()
//    for(i <- nlist){
//      print(i + " ")
//    }
  }
}
