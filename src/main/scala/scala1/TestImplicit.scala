package scala1

import scala.io.Source

/**
  * 隐式转换和隐式参数
  * 作用:能够丰富现有类库的功能,对类的方法进行增强
  * 隐式转换函数,以implicit关键字修饰,并带有单个参数的函数
  */
class RichFile(val filePath:String){
  def read():String  ={
    //从路径中读取文件并转换为字符串
    Source.fromFile(filePath).mkString
  }
}

object RichFile{
  def main(args: Array[String]): Unit = {
    //这是显式调用
//    val file = "D:\\mycode1\\program\\spark\\sparksql\\src\\file\\people.txt"
//    val content = new RichFile(file).read()
//    println(content)

    //使用隐式转换
    import MyPredef.fileToRichFile
    val file = "D:\\mycode1\\program\\spark\\sparksql\\src\\file\\people.txt"
    val content = file.read()
    println(content)
  }
}

object TestImplicit {

}
