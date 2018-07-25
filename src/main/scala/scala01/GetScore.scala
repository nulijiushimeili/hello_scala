package scala01

//来个算法题
//1.分数范围{-40,40}
//2.分数是5的倍数。
//3.一桌4人加起来的分数是0.
//取一组4人的分数值出来如 [30,-10,-10,-10]

class GetScore{
  var list = new java.util.ArrayList[scala.List[Int]]()
  def getRes(){
    for{a <- -40 to 40 by 5; b <- -40 to 40 by 5; c <- -40 to 40 by 5; d <- -40 to 40 by 5}if(a+b+c+d == 0){
//      println(a, b, c, d)
      val l = List(a,b,c,d)
      list.add(l)
    }
  }



}

object GetScore {
  def main(args: Array[String]): Unit = {
//    for{a <- -40 to 40 by 5; b <- -40 to 40 by 5; c <- -40 to 40 by 5; d <- -40 to 40 by 5}if(a+b+c+d == 0)println(a, b, c, d)

    val getScore = new GetScore()
    getScore.getRes()
    println(getScore.list)
    println(getScore.list.size())
  }
}

