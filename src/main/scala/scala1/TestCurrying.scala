package scala1

/**
  * 科里化(给函数传入多个参数列表)
  */
object TestCurrying {
  def main(args: Array[String]): Unit = {
    //给一个函数设置两个参数列表
    def currying(x: Int)(y: Int) = x * y

    println(currying(2)(3))

    //下面这个写法等同于上面的写法
    def currying2(x: Int) = (y: Int) => x * y

    //将两个参数列表的函数设置一个默认参数,然后只传一个参数就可以了
    def curry(x: Int) = currying(5)(x)

    println(curry(3))

    //implicit 关键字,表示隐式传入参数
    def mf(x: Int)(implicit y: Int = 10) = x * y

    println(mf(2))

    //一个小例子
    val arr = Array(("java", 2), ("scala", 3), ("scala", 3))
    val count = arr.foldLeft(0)(_ + _._2)
    println(count)

    //可以传入多个参数列表
    def testcurrying(a: Int)(b: Int)(c: Int) = a * b * c

    println(testcurrying(1)(2)(3))
  }
}
