package scala4

//定义抽象类 ,要使用abstract关键字
abstract class Car{
  //定义一个抽象字段
  var carBrand:String    //声明字段的时候要一定要给出类型
  //定义给一个抽象方法
  def run()
  def info(): Unit = println("这是一个抽象类中的方法,")

}

class BMWcar extends Car{
  //重写抽象方法必须要使用override关键字,否则会报错
  override var carBrand: String = "BMW"

  override def run(): Unit = println("别摸我哦")
}

object BMWcar{
  def getInstance = new BMWcar()
  def main(args: Array[String]): Unit = {
    val bmw = BMWcar
    println(bmw.getInstance.run())
    getInstance info()
  }
}