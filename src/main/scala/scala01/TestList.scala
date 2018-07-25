package scala01

import scala.collection.mutable.ListBuffer

class TestList {
  def main(args: Array[String]): Unit = {
    //可变的列表
    val list:List[Int] = List(2,3,6,9)
    println(list.sorted)
    val list2: List[Int] = 3 :: 5 :: 6 :: 7 :: Nil
    val list3: List[Any] = List(1,2,3) ::: List(7,8,9) ::: List(100)
    //提取指定下标的元素
    println(list3.take(2))
    val list4:List[Int] = list2.map(v => v * 10)
    val list5 = list4.flatMap(v => (0 to v).toList)

    //定义可变长度的列表
    val buf1 = ListBuffer[Int]()
    buf1 += 1
    buf1 ++= List(4,5,5,6,8)
    buf1.update(2,0)
    //从下标为3的位置移除5个元素
    buf1.remove(3,5)
    buf1.foreach(print)

    /**
      * 迭代器的使用
      */
    val iter = Iterator("hso","dsf","sdfg")
    while(iter.hasNext){
      println(iter.next())
    }
    for(it <- iter)println(it)
  }
}
