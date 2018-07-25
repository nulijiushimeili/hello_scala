package scala2

object TestMatch {

  def createErrorMessage(): Unit ={
    val str:String = ""
    str match {
      case "hello" => println("Hi~")
      case "How are you" => println("I am fun, thank you!")
      case _ => println("Please say it again...")
    }
  }

  def main(args: Array[String]): Unit = {
    createErrorMessage()
  }
}
