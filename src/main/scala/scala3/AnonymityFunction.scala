package scala3

object AnonymityFunction {
  def main(args: Array[String]): Unit = {
    //匿名函数
    //这是一个最基本的函数
    def b(x:Int,y:Int): Int ={
      if(x > y) x else y
    }

    //将b函数的函数体赋值给c,那么c就是一个复制过来的和b一模一样的函数了
    val c = b _

    println(c(1,2))

    //直接把b的函数体赋值给d,相当于d=b={},这样表单含义太模糊了,所以讲函数体转换成d=b=>{}
    val d = (x:Int,y:Int) => {
      if(x > y) x else y
    }

    println(d(6,9))

  }
}
