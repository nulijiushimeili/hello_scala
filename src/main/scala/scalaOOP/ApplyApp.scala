package scalaOOP

object ApplyApp {
  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 10 ){
//      ApplyTest.incr()
//    }
//
//    /**
//      * 结果是10,表示object本身就是一个半身对象
//      */
//    println(ApplyTest.count)  // 10

    /**
      * 默认执行的是Ojbect里面的apply
      */
    val b = ApplyTest

    val c = new ApplyTest()
    c()   // 在这里调用 class中的 apply方法


  }
}

/**
  * 伴生类和伴生对象
  * 如果有一个class,还有一个同名的object
  * 那么就称这个object是class的伴生对象
  * class是这个object的伴生类
  */

class ApplyTest{
  println("class ApplyTest enter....")
  def apply(): Unit ={
    println("Class ApplyTest apply ...")
  }

  println("Class ApplyTest enter....")
}

/**
  * ojbect 本身就是一个单例对象
  */
object ApplyTest{
  println("Object ApplyTest enter....")
  var count = 0

  def incr(): Unit ={
    count = count + 1
  }

  /**
    * 最佳实践
    *   在 Object中的apply方法中 new 伴生类
    *   然后在最后行返回这个对象
    */
  def apply(): ApplyTest ={
    println("Object apply ....")
    new ApplyTest()
  }

  println("Object ApplyTest leave....")
}


