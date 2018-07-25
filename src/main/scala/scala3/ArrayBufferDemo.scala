package scala3

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    //create ArrayBuffer, just one kind of method to create ArrayBuffer
    val buf1 = ArrayBuffer[Int]()
    // add a element at array last;
    buf1.append(1)
    buf1 += 9
    // add a element to ArrayBuffer and you can difine its index
    buf1.insert(0, 5)
    //add many elements to ArrayBuffer
    buf1 ++= Array(1, 2, 3, 6, 8)
    //delete a element
    buf1 -= 9
    //delete many elements ,if the element not in buf1 ,it not to be error
    //if many same element ,you can just delete one of them ,
    buf1 --= Array(4, 6)
    //delete a element when its index is you want,
    buf1.remove(0)
    //update
    buf1(0) *= 4
    //query all
    buf1.foreach(println)


  }
}
