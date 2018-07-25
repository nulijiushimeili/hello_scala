package scala1

object TestMutableArray {
  def main(jlk: Array[String]): Unit = {

    testYield()

  }

  //定义一个int类型的变长数组
  def testIntArray(): Unit = {
    import scala.collection.mutable.ArrayBuffer

    val arr2 = ArrayBuffer[Int]()
    arr2 += 1
    arr2 += 4
    arr2.foreach(println)
    println("----------------------------------")
    //将元祖添加到可变数组中
    arr2 += (1, 2, 3)
    arr2.foreach(println)
    //把另一个数组添加到可变数组中(追加的数组可以是变长数组,也可以是定长数组)
    println("----------------------------------")
    val arr1 = Array(5, 5, 5, 5)
    arr2 ++= arr1
    arr2.foreach(println)

  }

  //
  def testIntArray2(): Unit = {
    import scala.collection.mutable.ArrayBuffer
    val arr2 = ArrayBuffer[Int]()
    val arr1 = Array(2, 2, 2)
    //追加元祖到变长数组中
    arr2 += (3, 3, 3)
    arr2.foreach(println)
    println("-----------------------------")
    //在数组下标为1的位置插入元素
    arr2.insert(1, 5, 5, 5)
    arr2.foreach(println)
    println("------------------------------")
    //从指定的位置remove two elements
    arr2.remove(2, 2)
    arr2.foreach(println)


  }

  //yield 关键字,将集合中的每一个元素取出来,进行操作,完了把操作完成的新集合返回出去
  def testYield(): Unit = {
    import scala.collection.mutable.ArrayBuffer
    val arr1 = ArrayBuffer(1, 2, 3, 4, 5)
    val arr2 = for (i <- arr1) yield i * 10
    arr2.foreach(println)
    println(arr2.sum)
    println(arr2.max)
    println(arr2.min)

  }

}
