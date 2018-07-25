package scala3

object IteratorDemo {
  def main(args: Array[String]): Unit = {
    val iter = Iterator("hso","dsf","sdfg")
    while(iter.hasNext){
      println(iter.next())
    }
    for(it <- iter)println(it)
  }
}
