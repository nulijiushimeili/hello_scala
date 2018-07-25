package scala1

import scala.collection.mutable

object TestSet {

  //create Set
  def testCreateSet(): Unit ={
    //mutable Set
    val set1 = new mutable.HashSet[Int]()
    //append a element to Set
    set1 += 1
    set1.add(2)
    set1 += 3
    set1.foreach(println)
    //remove element
    set1 -= 1
    set1.remove(2)
    set1.foreach(println)

  }

  def testImmutableSet(): Unit ={
    val set1 = Set(1,2,3,4)
    val set2 = Set(4,3,5)
    //merge two Set
    val set3 = set1 ++ set2
    set3.foreach(println)
  }

  def main(df:Array[String]): Unit ={
    testImmutableSet()

//    testCreateSet()
  }
}
