package scala4

class TestApplyClass {
  def apply(param:String): String ={
    println("lsfjsdklf"+param)
    "hello word"
  }

}

object ts{
  def main(args: Array[String]): Unit = {
    val testApplyClass = new TestApplyClass
    println(testApplyClass.apply("haha"))
  }
}
