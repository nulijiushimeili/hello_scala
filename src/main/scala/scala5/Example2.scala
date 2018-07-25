package scala5

object Example2 {

  //并行计算
  def parCalc(): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //这个是普通的求和
    val res1 = arr.sum
    //这个是并行计算求和
    //和线程有关,会每个线程计算一部分
    val res2 = arr.par.sum
    println(res1)
    println(res2)
  }

  //按照特定的顺序进行聚合
  def testReduce(): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //reduce是通过普通的for循环将,数组中的每一个元素累加
    //在reduce内部实际上调用的是reduceLeft()这个方法
    val res = arr.reduce(_ + _)
    val res2 = arr.reduceLeft(_ + _)
    println(res)
    println(res2)
    //怎么看出来是不是并行执行的(每次执行完的结果都是不一样的)
    val res3 = arr.par.reduce(_ - _)
    println(res3)
  }

  //将数组中的元素折叠,也就是实现累加,可以给定初始值,在计算的时候先加上初始值
  def testFold(): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    //将数组折叠,(也就是进行累加计算),可以给定一个初始值,计算的时候先把初始值加到结果里面去
    val res = arr.fold(10)(_ + _)
    println(res)
    //因为fold是有顺序的开始计算,所以开启多线程计算后会出现不同的结果,(这个方法不是线程安全的)
    val res2 = arr.par.fold(10)(_ + _)
    println(res2)
    //使用下面的方法进行计算是线程安全的
    val res3 = arr.par.foldLeft(0)(_ + _)
    val res4 = arr.par.foldRight(0)(_ + _)
    println(res3)
    println(res4)
  }

  //聚合(计算list中多个list中的数值的和)
  def testSumForMultiList(): Unit = {
    val list = List(List(1, 3, 4), List(4, 5, 6), List(7, 8, 5, 5))
    //可以通过flatten这个方法将多个数组拍扁,然后再进行计算
    val list2 = list.flatten
    val res1 = list2.reduce(_ + _)
    println(list2)
    //经过flatten方法计算后的结果如下
    //    List(1, 3, 4, 4, 5, 6, 7, 8, 5, 5)
    //    48
    println(res1)
    //除了上面的方法我们还可以通过另一个方法进行聚合计算
    //aggregate这个方法也有一个初始值,计算的时候需要两个参数,第一个参数是将每一个list取出来sum(),
    // 然后再把每一个值进行聚合操作
    val res = list.aggregate(0)(_ + _.sum, _ + _)

    println(res)

  }

  //并集,交集,差集
  def testCollection(): Unit = {
    val list1 = List(12, 3, 5, 6, 7)
    val list2 = List(34, 56, 6, 7, 8)
    //并集
    val res = list1 union list2
    println(res)
    //List(12, 3, 5, 5, 6, 7, 34, 56, 6, 7, 8, 6)  //结果是有重复的
    //交集
    val res2 = list1 intersect list2
    println(res2)
    //差集()
    val res3 = list1 diff list2
    println(res3) //List(12, 3, 5)

  }

  def main(df: Array[String]): Unit = {
    parCalc
    //    testReduce()
    //    testFold()
    //    testSumForMultiList()
    //    testCollection()

  }


}
