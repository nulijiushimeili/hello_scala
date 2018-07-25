package scala01

object ScalaMethod {
  //对原来的数组/列表中的元素进行操作,得到新的数组
  def newList(): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)
    val list1 = list.map(_ * 2)
    val list2 = for (i <- list) yield i * 2
    val list3 = list.map(x => x * 2)
    println(list1)
    println(list2)
    println(list3)
  }

  //过滤数组/列表中符合条件的元素
  def testFilter(): Unit = {
    val list = 1 :: 2 :: 3 :: 4 :: Nil
    val list2 = list.filter(_ % 2 == 0)
    list2.foreach(println)
  }

  //将列表中的元素拍扁,得到新的一维数组/列表
  def testFlatten(): Unit ={
    val lines = List("hello word java scala","java python","scala hello")
    val list1: Seq[Array[String]] = lines.map(_.split(" "))
    println(list1)
    val list2 = list1.flatten
    //list2.foreach(println)
    println(list2)
  }

  //集合的排序
  def testSort(): Unit ={
    val list = List(1,2,9,34,22,35,7,5,6)
    val list1 = list.sorted
    println(list1)
    val list2 = list1.reverse
    println(list2)
  }

  //集合的分组
  def testGroup(): Unit ={
    val list = List(3,5,23,65,6,1,63,634,34)
    //将列表每3个进行一次分组,生成的是一个迭代器
    val it = list.grouped(3)
//    it.foreach(println)
    //将多个迭代器拍扁,获取一个迭代器
    val it2 = it.flatten
    it2.foreach(println)
  }

  def main(args: Array[String]): Unit = {
//    newList()
//    testFilter()
//    testFlatten()
//    testSort()
    testGroup()
  }
}
