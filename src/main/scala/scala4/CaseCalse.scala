package scala4

case class CaseClase (id:Int,name:String)

object ts789{
  def main(args: Array[String]): Unit = {
    val stu1 = CaseClase(1,"xiaoming")
    val stu2 = CaseClase(2,"xiaofang")
    val stu3 = CaseClase(3,"xiaoqinag")
    val list = stu1 :: stu2 :: stu3 :: Nil
    for( stu <- list){
      stu.id match {
        case 1 => println(stu1.name)
        case 2 => println(stu2.name)
        case 4 => println(stu3.name)
        case _ => println("同学,你哪冒出来的?")
      }
    }

  }
}


