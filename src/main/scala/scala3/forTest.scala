package scala3

object forTest {
  def main(arg:Array[String]): Unit ={
    for(i <- 1 to 10 by 2)print(i)
    println()
    for(i <- 1 until 10 if i != 2)print(i)
    println()
    for(i <- Range(1,10) if i < 5)print(i)
    println()
    for(i <- 1 to 10 if i == 5) print(i)

    val arr = for(i <- 1 to 10 if i != 5) yield i * 2
    println(arr)
  }
}
