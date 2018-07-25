package scala4

class Counter {
  private var value = 0
  private var name = ""
  private var mode = 1

  def this(name:String){
    this()
    this.name = name
  }

  def this(name:String,mode:Int){
    this(name)
    this.mode = mode
  }

  def show(): Unit =print(value,name,mode)


}

//猪狗早起模式
class Counter2(id:Int,name:String,age:Int) {
  def getId: Int = id
  def getName: String = name
  def getAge: Int = age
}


object Counter{
  def main(args: Array[String]): Unit = {
    val Coun = new Counter()
    Coun show()

    val myCounter2 = new Counter2(2,"djskfl",23)
    println(myCounter2.getName)
  }
}
