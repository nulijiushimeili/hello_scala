package scala3

object TestList2 {
  def main(args: Array[String]): Unit = {


    val list2: List[Int] = 12 :: 5 :: 6 :: 7 :: Nil
    //filter,对于每个给定的函数进行给定的函数f的调用操作.return true save the element,elst remove
    list2.filter(_ % 2 == 0).foreach(println)
    list2.filter(_ % 2 != 0).foreach(println)

    val l1 = list2.map(v => {
      v + 1000
    })
    println(l1)

    val l2 = list2.flatMap(v => (0 to v).toString)
    l2.foreach(print)

    //reduce 对全部的数据进行迭代操作,进行合并,从左往右
    var s = list2.reduce(_ + _)
    println(s)

    //reduceLeft和reduce的功能一样,从左往右开始计算
    list2.reduceLeft((a, b) => {
      println(s"a=${a} \t b=$b")
      a - b
    })

    //fold ,和reduce一样,但是fold可以给定一个初始值,这个初始值可以不是集合中的元素
    println(list2.fold(1000)(_ + _))

    //foldLeft, 和fold一样
    list2.foldLeft("")((a, b) => {
      println(s"a=$a\tb=$b")
      a + b + ";"
    })

    //排序,要求数据时可以进行排序操作的
    list2.sorted

    //按照字典方法排序
    println(list2.sortBy(i => i.toString))

    val list: List[Any] = List(1, 2) ::: List("fdjslk", 345) ::: List(4582)
    //字段方法排序
    println(list.sortBy(i => i.toString))


  }
}
