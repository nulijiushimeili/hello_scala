package scala3

import scala.collection.mutable

object MapDemo {
  def main(args: Array[String]): Unit = {
    //不可见map,默认就是
    val map = Map((1,"tom"),(2,"jeck"),(3,"smeis"))
    val map1 = Map(1 -> "hello",2 -> "work")

    //根据指定的key读取数据(如果key,不存在抛出异常)
    //println(map1(2))

    //如果指定key存在的话,返回具体值,不存在就返回默认值
    println(map.getOrElse(3, "dodo"))
    println(map1.getOrElse(3, "dodo"))

    //根据key返回一个option对象,如果有对应值返回some,没有返回none
    println(map1.get(2))

    //创建可变的map
    val map2 = mutable.Map[Int,String]()
    //添加元素
    map2 += 1 -> "hello"
    map2 += ((2,"word"))

    //增加和更新操作
    map2(5)="sjkfl"
    map2.foreach(println)

    //map相当于一个二元组,
    //map的循环
    map2.map(tuple2 => tuple2._2 * tuple2._1)
//    for(ele <- map2){
//      println(s"key=${ele._1}\tvalue=${ele._2}")
//    }
//    //每个map直接当做一个二元组拿出来
//    for((key,value) <- map2){
//      println(s"key=${key}\tvalue=${value}")
//    }
    //如果我只是想拿出来key呢,如果值是想要value的话,反之
    for((key,_) <- map){
      println(s"key=$key")
    }

    var mymap = Map("sjdflk" -> 343,"fwsf" -> 456)
    //    contains() 集合中是否包含某个元素
    println(mymap.contains("sfdjlk"))


  }
}
