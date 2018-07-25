package scala4

object GetOddAndGetEven {
  def main(args: Array[String]): Unit = {
    for(i <- 0 to 9)if (i%2==0)println(s"$i is a even")else println(s"$i is a odd")

    for(j <- 0 until 10){
      j match {
        case _ if j % 2 == 1 => println(j + " is a odd")
        case _ => println(j + " is a even")
      }
    }

  }
}
