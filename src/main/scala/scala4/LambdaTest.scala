package scala4

object LambdaTest {
  def main(args: Array[String]): Unit = {
    val f1 : Int => Int = (id:Int) => id * 2
    val f2 = (id:Int) => id * 2                 //可以自动推到类型,所以不用声明也是可以的
    //val f3 = id =>  * 2           //xxxxxxxxx
    println(f1(6))

    val rs = 2 :: 4 :: 5 :: Nil
    def area(r:Int): Double =Math.PI*r*r
    for(r <- rs)area(r)


    val numList = List(-4,-5,-6,-2,34,543)
    println(numList.filter(_ > 0))

  }
}
