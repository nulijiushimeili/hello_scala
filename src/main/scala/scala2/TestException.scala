package scala2

import java.io.{FileNotFoundException, FileReader, IOException}

object TestException {
  def main(args: Array[String]): Unit = {
    catchEx()
  }

  /**
    * scala exception
    */
  def catchEx(): Unit ={
    try{
      val file = new FileReader("")
    }catch{
      case ex:FileNotFoundException =>println("File is not found")
      case ex:IOException => println("Input or output exception")
    }finally {
      println("The system is exiting now...")
    }

  }
}
