package scala3

object TestTuple {
  def main(args: Array[String]): Unit = {
    //We will use the tuple2 on most time
    //define a tuple2
    val tuple2: (String, Int) = ("hello",5)
    //swap
    println(tuple2.swap)

    //tuple in tuple
    val tuple3: (String, (String, String), (String, Int)) = ("Bom",("nickname","mulujiushimeili"),("age",35))
  }
}
