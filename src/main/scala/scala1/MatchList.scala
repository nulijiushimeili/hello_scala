package scala1

/**
  * 模式匹配,(数组匹配)
  */

object MatchList {

  //模式匹配数组
  def matchArray(): Unit ={
    val arr = Array(3,4,5,6)
    arr match {
      case Array(4,3,5,6) => println("Match Array")
      case Array(_,_,5,6) => println("Match arr")
      case _ => println("Match Nothing")
    }
  }

  //匹配元祖
  def matchTuple(): Unit ={
    val tup = (1,2)
    tup match {
      case Tuple2(_,_) => println("Match Tuple2")
      case _ => println("Match Nothing")
    }
  }

  //匹配集合
  def matchList(): Unit ={
    val list = List(3,4)
    list match {
      case List(_,4) => println("Match list")
      case _ => println("Match nothing")
    }
  }

  def main(df:Array[String]): Unit ={
    matchArray()
    matchTuple()
    matchList()
  }


}
