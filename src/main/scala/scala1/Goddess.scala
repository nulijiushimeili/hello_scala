package scala1

/**
  * 隐式转换,泛型,科里化
  */
//隐式转换对象
object ImplicitContext{
  //创建用于排序的隐式转换对象,继承排序的特质
  implicit object OrderingGirl extends Ordering[MyGirl] {
    override def compare(x: MyGirl, y: MyGirl): Int =
      if (x.faceValue > y.faceValue) 1 else -1
  }
}
//对这个对象按照一定的规则排序
class Girl(val name:String, var faceValue:Int){
  override def toString:String={
    s"name:$name\tfaceValue:$faceValue"
  }
}
//对Girl这个对象排序的对象和方法
class Goddess[T:Ordering](val v1:T)(val v2:T){
  def choose()(implicit ord:Ordering[T]): T = if (ord.gt(v1,v2)) v1 else v2
}

object Goddess {
  def main(args: Array[String]): Unit = {
    import ImplicitContext.OrderingGirl
    val g1 = new MyGirl("niuniu",25,90)
    val g2 = new MyGirl("yaoyao",29,92)
    val goddess = new Goddess[MyGirl](g1)(g2)
    val res = goddess.choose()
    println(res)
  }
}
