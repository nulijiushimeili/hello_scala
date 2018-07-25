package scala2

class TestStruct {
  private var num = 5
  private var name = "xiaoming"
  private var gender = "male"

  def this(name:String){         //第一个辅助构造器
    this()
    this.name = name
  }

  def this(name:String,num:Int){    //第二个辅助构造器
    this(name)
    this.num = num
  }
}

object TestStruct{
  def main(args: Array[String]): Unit = {
    val testStruct = new TestStruct("xiaohong")
    println(testStruct.num)
    val testStruct1 = new TestStruct("Tom",15)
    println(testStruct1.gender)
  }
}