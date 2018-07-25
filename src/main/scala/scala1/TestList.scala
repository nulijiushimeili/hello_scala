package scala1

object TestList {

  //create immutable List
  def testList1(): Unit ={
    //first method to create list
    val list1 = List(1, 2, 3)
    //The second mothod
    val list2 = 1 :: list1
    val list3 = 5 :: 6 :: 7 :: Nil
    val list4 = 0 +: list1
    val list5 = list1.+:(9)
    val list6 = list1.:+(4)
    //合并两个list
    val list7 = 5 :: 6 :: 7 :: Nil
    val list8 = list1 ++ list7
    val list9 = list1 ::: list7

  }

  //create mutable List
  def testMutableList(): Unit = {
    import scala.collection.mutable.ListBuffer
    val list1 = ListBuffer(1,2,3)
    list1.append(5,5,6)
    val list2 = ListBuffer(7,8,9)
    val list3 = list1 ++ list2
    list3.foreach(print)
    println()
    list1.foreach(print)
    println()
    val list4 = list1 ++= list2  //使用++=这个方法的时候,list1的值会发生改变
    list4.foreach(print)
    println()
    list1.foreach(print)
    println()




  }



  def main(df:Array[String]): Unit ={
    testMutableList()
  }
}
