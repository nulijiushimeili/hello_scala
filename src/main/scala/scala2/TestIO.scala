package scala2

import java.io.FileWriter

import scala.io.Source

object TestIO {
  //read file
  def readFile: String ={
    //逐行读取文件的内容
    val file = Source.fromFile("D:\\mycode1\\program\\spark\\sparksql\\src\\file\\person.json").mkString
    println(file)
    file
  }
  def writeToFile(): Unit ={
    //$1:fileName,$2==true-> append content to File
    val fw = new FileWriter("D:\\mycode1\\program\\spark\\sparksql\\src\\file\\people.json")
    fw.write(readFile)

  }
  //write file

  def main(args: Array[String]): Unit = {
    writeToFile()
  }
}
