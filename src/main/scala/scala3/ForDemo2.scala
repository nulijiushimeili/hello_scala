package scala3

object ForDemo2 {
  def main(args: Array[String]): Unit = {
//    //多重for循环
//    for(i <- 1 to 9){
//      for(j <- 1 to i){
//        print(s"${j} * ${i} = ${i*j} \t")
//      }
//      println()
//    }

//    for( i <- 1 to 9 ; j <- 1 to i){
//      print(s"${j} * ${i} = ${i*j} \t" )
//      if(i == j) println()
//    }

    for{ i <- 1 to 9
         j <- 1 to i}{
      print(s"$j * $i = ${i*j} \t" )
      if(i == j) println()
    }
  }
}
