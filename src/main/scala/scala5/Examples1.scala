package scala5

/**
  *
  */

object Examples1 {

  def testList1(): Unit ={
    //create list
    val list = 1 :: 2 :: 3 :: Nil
    // elements in list *2 ,and return a new list
    val list1 = list.map(x => x*2)
    val list2 = for(i <- list)yield i*2
    val list3 = list.map(_ * 2)
    list.foreach(println)
    list1.foreach(println)
    list2.foreach(println)

  }

  def testFilter(): Unit ={
    val list = 1 :: 2 :: 3 :: Nil
    //even in new list from list 取出list中的所有偶数
    //filter()的参数是Boolean类型的
    val list1 = list.filter(_%2 == 0)
    list1.foreach(println)
  }

  def testSort(): Unit ={
    val list = List(1,2,3,4,5)
    //集合的排序
    val list1 = list.sorted
    list1.foreach(println)
    //集合翻转
    val list2 = list1.reverse
    list2.foreach(println)
  }

  //分组
  def testGroup(): Unit ={
    val list = List(1,2,3,4,5,6,7,8,9)
    //将list每三个分成一组,生成一个迭代器
    val iterator = list.grouped(3)
    //iterator.foreach(println)
    val iterator1 = iterator.toBuffer
    //将多个数组压平,合并成一个数组
    val list2 = iterator.flatten
    //iterator1.foreach(println)
    list2.foreach(println)
  }

  def testFlatten(): Unit ={
    val lines = List("hello word java scala","java python","scala hello")
    val list1 = lines.map(_.split(" "))
    //list1.foreach(println)
    val list2 = list1.flatten
    //list2.foreach(println)
    println(list2)

    /** 上面计算的结果是合并成了一个新数组
      * List(hello, word, java, scala, java, python, scala, hello)
      */


  }



  def main(fds:Array[String]): Unit ={
    //testList1
    //
    // testFilter()
    //testSort()
    //testGroup()
    testFlatten()


  }

}
