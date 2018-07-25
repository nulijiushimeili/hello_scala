package scala4

//伴生对象不用new,就可以直接使用
//注意点:apply方法必须要有(),否则无法被当做构造器执行

class TestApply1 {
  def apply():Unit={ println("调用了testapply1 class")}
  def show():Unit = println("调用了show")
}
object TestApply1{
  def apply(): TestApply1 = {
    println("调用了testapply1 object")
    new TestApply1
  }
}

object Test50{
  def main(args: Array[String]): Unit = {
    val ta1 = TestApply1()    //调用伴生对象
    ta1.show()               //调用伴生类的方法
    ta1()                     //调用伴生类的构造
  }
}
