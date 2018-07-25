package scala3

import scala.util.control.Breaks

object BreakDemo {
  def main(args: Array[String]): Unit = {
    val arr = (0 to 10).toArray
    var i =  0
    var loop = Breaks
    loop.breakable{
      while(i < arr.length){
        println("执行了" + (i + 1) + "次")
        if(i>4){
          loop.break()
        }
        i+=1
      }
    }


  }
}
