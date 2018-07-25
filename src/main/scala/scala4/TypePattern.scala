package scala4

object TypePattern {
  def main(args: Array[String]): Unit = {
    for(ele <- List(1,"fsjkld",23453.4,(1,4))){
      val str = ele match {
        case a : Int => a + " is a int"
        case b : Double => b + " is a double "
        case c : String => c + " is a String"
        case d : Boolean => d + " is a boolean"
        case e : Any => e + " is a object"
      }
      println(str)
    }

  }

  def patternNum(): Unit ={
    val colorNum = 5
    val colorStr = colorNum match {
      case 1 => "red"
      case 2 => "yellow"
      case 3 => "green"
      case _ => "none"
    }
    println(colorStr)
  }
}
