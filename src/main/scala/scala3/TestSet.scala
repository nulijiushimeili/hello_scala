package scala3

import scala.collection.mutable

object TestSet {
  def main(args: Array[String]): Unit = {

  }

  def testSet(): Unit = {
    //不可变集合
    val set = Set(1, 2, 3, 4, 5)

    //读取数据
    //    set.foreach(println)
    //    set.map(x => x).foreach(println)

    //判断数据在集合中是否存在
    //    val b: Boolean = set(1)
    //    println(b)
  }

  def testMutableSet(): Unit = {
    //可变的set集合
    val set1 = mutable.Set[Int]()
    //添加元素
    set1 += 10
    set1 ++= Set(10, 100, 1000)
    set1.map(x => x).foreach(println)
    //delete member
    //    set1 -= 100
    //    println(set1(100))
    //
    //    增加一个元素
    set1(1) = true
    println(set1)
  }

  def testSet2(): Unit = {
    //如果我们用的是var声明的集合,就可以不导入可变集合
    var myset = mutable.Set("hadoop", "Spark")
    myset += "fsjdlk"
    println(myset)

    //如果我们用的是val声明的集合,还想改变他的 值,那就只能导入可变集合的包了
    val myMutableSet = mutable.Set("dsfd", "dsjslfka")
    myMutableSet += "sfjdlk"
  }
}
