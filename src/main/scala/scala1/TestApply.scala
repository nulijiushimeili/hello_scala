package scala1

/**
  * apply通常称作是注入方法,在伴生对象里做一些初始化操作
  * apply方法的参数列表不需要和构造器的参数列表统一
  * unply通常被称作是提取方法,使用unapply方法提取固定数量的对象
  * unapply会返回一个Option类型的序列
  * apply和unapply方法会被隐式的调用
  */

class ApplyDemo(val name:String, val age:Int, val faceValue:Int){

}
object ApplyDemo{
  def apply(name:String, age:Int, gender:Int, faceValue:Int):ApplyDemo={
    new ApplyDemo(name,age,faceValue)
  }

  def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] ={
    if(applyDemo == null)None else Some(applyDemo.name,applyDemo.age,applyDemo.faceValue)
  }
}

object TestApply {
  def main(df:Array[String]): Unit ={
    val applyDemo = ApplyDemo("xiaoming",16,1,60)
    applyDemo match {
      case ApplyDemo("xiaoming",age,faceValue) => println(s"xioaming de age is $age")
      case _ => println("nothing to match")
    }
  }
}
