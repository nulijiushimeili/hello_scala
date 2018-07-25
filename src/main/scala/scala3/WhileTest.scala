package scala3

object WhileTest {
  def main(args: Array[String]): Unit = {

    var i = 9
    while(i >0){
      print(i)
      i -= 1
    }

    var j = 0
    do{
      j += 1
      print(j)
    }while(j<10)
  }
}
