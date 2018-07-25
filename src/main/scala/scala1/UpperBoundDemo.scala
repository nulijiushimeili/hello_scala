package scala1

/**
  * [B<:A]			//UpperBound 上界,B的上界是A,即B的父类是A
  * [B>:A]			//LowerBound 下界,B的下界是A,即A是B的子类
  * [B<%A]			//ViewBound  表示B类型要转换成A类型,需要隐式转换
  * [B:A]			//ContextBound 需要一个隐式转换的值
  */
//实现对象的比较返回对象
class UpperBoundDemo[T <: Comparable[T]] {
  def select(first:T)(second:T):T = {
    if (first.compareTo(second) > 0) first else second
  }
}
object UpperBoundDemo{
  def main(args: Array[String]): Unit = {
    val u = new UpperBoundDemo[MissRight]
    val m1 = new MissRight("niuniu",95)
    val m2 = new MissRight("meimei",99)
    val res = u.select(m1)(m2)
    println(res.name)
  }
}
//实现两个对象的特定规则的比较
class MissRight(val name:String,val faceValue:Int) extends Comparable[MissRight] {
  override def compareTo(o: MissRight): Int = {this.faceValue - o.faceValue}
}


