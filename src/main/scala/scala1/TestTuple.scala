package scala1

object TestTuple {

  def defineTuple(): Unit = {
    //create tuple
    val t = (1, 5, "hello", ("spark", 3))
    //get element in tuple
    println(t._1)
    //The index of tuple begin from 1,
    println(t._4._1)
    //The elemene in tuple can 赋值给对应的变量
    val t1, (a, b, c, d) = (1, 5, "hello", ("spark", 3))
    println(d)

  }

  def changeTupleToMap(): Unit = {
    val arr = Array(("xianqinag", 19), ("xinghua", 15), ("xiaoming", 20))
    //直接调用toMap方法,可以将数组中的元祖转换成map映射
    val map1 = arr.toMap

    println(map1.getOrElse("xiaoming", -1))

  }

  def testZip(): Unit = {
    val arr1 = Array("xiaming", "xiaohuia", "xiaoqing")
    val arr2 = Array(12, 13, 12)
    //将两个数组对应打包成2元祖组成的数组
    val arr3 = arr1 zip arr2
    //返回的是一个数组
    println(arr3(1))
    //将数组转换成映射
    val arr4 = arr3.toMap
    //check result
    println(arr4)

  }


  def main(df: Array[String]): Unit = {
    //defineTuple
    //changeTupleToMap
    testZip()
  }
}
