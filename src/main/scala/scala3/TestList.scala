package scala3

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object TestList {
  def main(args: Array[String]): Unit = {
    //list.length not can be change
    val list:List[Int] = List(2,3,6,9)
    println(list.sorted)
    val list2: List[Int] = 3 :: 5 :: 6 :: 7 :: Nil
    val list3: List[Any] = List(1,2,3) ::: List(7,8,9) ::: List(100)
    //show first member
    println(list3.take(2))
    val list4:List[Int] = list2.map(v => v * 10)
    val list5 = list4.flatMap(v => (0 to v).toList)

    //changed list.length
    val buf1 = ListBuffer[Int]()
    buf1 += 1
    buf1 ++= List(4,5,5,6,8)
    buf1.update(2,0)
    //remove 5 members from index of 3 ,
    buf1.remove(3,5)
    buf1.foreach(print)
  }

  def testList(): Unit ={
    val list1 = "fjdslk" :: "sdfjlk" :: Nil
    val list2 = List("fjslkd",234)
    val list3 = "sdjflks" :: "dsfjlk" :: list1
    println(list3)

  }

}
