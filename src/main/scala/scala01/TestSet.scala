package scala01

import scala.collection.mutable

object TestSet {
  def main(args: Array[String]): Unit = {
    //不可变集合
    val set = Set(1,2,3,4,5)

    //读取数据
    //    set.foreach(println)
    //    set.map(x => x).foreach(println)

    //判断数据在集合中是否存在
    //    val b: Boolean = set(1)
    //    println(b)

    //可变的set集合
    val set1 = mutable.Set[Int]()
    //添加元素
    set1 += 10
    set1 ++= Set(10,100,1000)
    set1.map(x => x).foreach(println)
    //    //delete member
    //    set1 -= 100
    //    println(set1(100))
    //
    //    增加一个元素
    set1(1)=true
    println(set1)
  }
}
