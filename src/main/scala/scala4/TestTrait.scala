package scala4

trait CarId {
  var id:Int
  def curId:Int
}
class BYDcar extends CarId{
  var id: Int = 10000

  override def curId: Int ={
    id += 1
    id
  }
}

object ts34{
  def main(args: Array[String]): Unit = {
    val byd = new BYDcar()
    println(byd.curId)
  }
}