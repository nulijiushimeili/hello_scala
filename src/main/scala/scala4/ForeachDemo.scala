package scala4

object ForeachDemo {
  def main(args: Array[String]): Unit = {
    testFilter()
    testFilter()
  }


  def testForeach(): Unit ={
    val myMap = Map("xm" -> "xiaoming","xf" -> "xiaofang")
    myMap foreach{case(k , v) => println(k + ":" + v)}
    myMap foreach{kv => println(kv._1 + ":" + kv._2)}

    //    map()方法映射
    val list = "hello " :: "word" :: Nil
    println(list map(s => s.toUpperCase))
    print(list.flatMap(ss => ss.toList))
  }

  def testFilter(): Unit ={
    //创建一个映射
    val myMap = Map("BJ" -> "biejing","SH" -> "shanghai")

    val existShanghai = myMap filter {ss => ss._2 == "shanghai"}
    println(existShanghai)
    val valueStartWith_S = myMap filter {ss => ss._2.startsWith("b")}
    println(valueStartWith_S)

  }

}
