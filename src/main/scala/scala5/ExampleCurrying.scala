package scala5

/**
  * 科里化练习
  */
//这个静态类必须写在调用的函数的前面,否则会找不到这个静态类里面的变量
//也可以将这个静态类写在另一个文件里面,就不会出错了
object Context{
  implicit val a: String = "python"
  implicit val b: String = "java"
}

object ExampleCurrying {

  //创建一个科里化的函数
  def cf(str:String)(implicit name:String="scala"): String ={
    str+name
  }

  def main(args: Array[String]): Unit = {
    //导入的这个对象的变量会被隐式调用
    import Context.a
    println(cf("Hi~"))
//    Hi~python
  }
}
