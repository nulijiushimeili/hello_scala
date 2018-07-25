package scala3

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    testArrayDim()

  }

  def testArray(): Unit ={
    //create Array
    val arr1 = Array(1,2,4,5,6)
    //the second method for create Array
    val arr2 = Array[Int](5)
    //index use() in scala is different JAVA []
    println(arr1(0))           //get the first element
    //show all elements
    for(ele <- arr1){
      println(ele)
    }
  }

  def testArrayDim(): Unit ={
    //定义多维数组
    val arrs = Array.ofDim[Int](2,3,4)
    val arrs1: Array[Array[Array[Int]]] = Array.ofDim[Int](2,3,4)
    println(arrs.length)
  }
}
