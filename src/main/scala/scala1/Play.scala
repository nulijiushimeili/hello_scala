package scala1

class Eq(val v1:Int, val v2:Int){
  def eq():Boolean={if(v1==v2) true else false}
}
object Eq{
  def main(args: Array[String]): Unit = {

    import MyPredef2.notEquals
    val res = notEquals(2,5).eq()
    println(res)
  }
}


object Play {

}
