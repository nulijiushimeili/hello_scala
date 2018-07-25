package scala4

class Constructor{
  private var id = 0
  private var name = ""
  private var age = 0

  // 创建辅助构造器的时候第一行要先调用主构造器
  def this(id:Int){    //这是第一个辅助构造器
    this()
    this.id = id
  }

  def this(id:Int,name:String,age:Int){   //这是第二个辅助构造器
    this(id)
    this.name = name
    this.age = age
  }

  def getId: Int = id
  def getName: String = name
  def getAge: Int = age

}

object MyConstruct {
  def main(args: Array[String]): Unit = {
    var cons = new Constructor
    val cons1 = new Constructor(2)
    println(cons1.getName)
    val cons2 = new Constructor(5,"xiaoming",15)
    println(cons2.getId)
    println(cons2.getName)
    println(cons2.getAge)
  }
}
