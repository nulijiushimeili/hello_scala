package scala01

import java.io._
import java.util.Scanner

import scala.io.{Source, StdIn}

/**
  * scala 的 io 操作
  */
object ScalaIo {
  def read(): Unit = {
    try {
      val file = new FileReader("D:\\my")
      file.close()
    } catch {
      case ex: FileNotFoundException => println("No file to read ..." + ex)
      case ex: IOException => println("Read file occurred exception ... Please try again!" + ex)
      case _: Exception => println("Occurred unknown exception !")
    }
  }

  def writeToFile(): Unit = {
    val writer = new PrintWriter("scalaIO.txt")
    writer.write("Welcome to wirte a file use scala.")
    writer.close()
  }

  def readFile(): Unit = {
    Source.fromFile("scalaIO.txt").foreach(print)
  }

  def readConsole(): Unit = {
    println("Hi,can you teach me to speak?")
    val br = new BufferedReader(new InputStreamReader(System.in))
    println(br.readLine() + ",Is right?")
    println("And else?")
    val rc = StdIn.readLine()
    println(rc + "Thanks!")
    br.close()
  }

  def readConsoleInJava(): Unit = {
    println("Please input some String ...")
    val sc = new Scanner(System.in)
    val str = sc.nextLine()
    println(str)
    sc.close()
  }

  def main(args: Array[String]): Unit = {
    //writeToFile()
    //readFile()
    //readConsole()
    readConsoleInJava()
    //
  }
}
