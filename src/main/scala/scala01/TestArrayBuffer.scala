package scala01

import scala.collection.mutable.ArrayBuffer

object TestArrayBuffer {
  def main(args:Array[String]): Unit ={
    //创建可变数组对象,注意使用泛型限定类型
    val abuff = new ArrayBuffer[Int]()
    //向可变数组中添加元素
    abuff.append(2)
    abuff += 4
    //向数组中添加另一个数组
    abuff ++= 5 to 10
    //向数组中插入元素/或数组
    abuff.insert(0,66)
    abuff.insertAll(0,Array(1,2))
    //删除指定元素,或删除数组集合
    abuff -= 9
    abuff --= 8 to 10
    abuff.remove(1)
    abuff.remove(5,2)
    //修改数组中的元素(将第一个元素改成55)
    abuff.update(0,55)

    abuff.foreach(println)

  }
}
