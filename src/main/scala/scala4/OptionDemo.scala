package scala4

object OptionDemo {

  def f1( a:(String)=>Unit) :Unit={
    a("小明")
  }

  def main(args: Array[String]): Unit = {
    val myMap = Map("hive" -> 1,"hbase" -> 5)
    println(myMap.get("hadoop"))
    println(myMap.getOrElse("storm", "没找到"))

    def a(): String => Unit = (name:String) => print(name)
    //val ff = {println("fdf")}
  //帮我写个匿名函数吧

    val fff = (name:String) => name
     name:String => name
    println(fff("aaaaa"))
  }

}



