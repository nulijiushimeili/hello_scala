package scala1

/**
  * [B<:A]			//UpperBound 上界,B的上界是A,即B的父类是A
  * [B>:A]			//LowerBound 下界,B的下界是A,即A是B的子类
  * [B<%A]			//ViewBound  表示B类型要转换成A类型,需要隐式转换
  * [B:A]			//ContextBound 需要一个隐式转换的值
  */
class ViewBoundDemo[T <% Ordered[T]] {
  def select(first:T)(second:T):T = {
    if (first > second) first else second
  }
}

object ViewBoundDemo{
  def main(args: Array[String]): Unit = {
    import MyPredef.selectGirl
    val viewBoundDemo = new ViewBoundDemo[MyGirl]
    val g1 = new MyGirl("niuniu",25,90)
    val g2 = new MyGirl("meimei",20,90)
    val res = viewBoundDemo.select(g1)(g2)
    println(res.name)
  }
}