package scala3

object IfElseDemo2 {
  def main(args: Array[String]): Unit = {
    val a: String = "hello"
    if(a == null){
      println("you have not input anything .. . .")
    }else if(a eq "hello"){
      println( "Wonderful! how are you know I thinking about?")
    }

    var arr1 = 0 to 10
    println(arr1.toString())

    val arr = 0 until 10
    print(arr toString)

  }



}
