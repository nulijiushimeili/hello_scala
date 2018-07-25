package scala3

trait A

trait B extends A{
  def f()


}

trait C extends A{
  def h()

  def g(): Unit ={
    println("trait C")
  }

}

trait D{
  val v1:Int
  val v2:String

  def h()
}


abstract class E extends D{
  def e(): Unit ={
    println("abstract class e . .. . ")
  }

  override def h(): Unit = {
    println("E h")
  }
}

//如果继承的特质中有同名的函数,函数就无法定位,会报异常
class TraitDemo extends E with B with C{
  override def f(): Unit = {}

  override def h(): Unit = {}

  def main(args: Array[String]): Unit = {

  }

  override val v1: Int = 20
  override val v2: String = " "
}
