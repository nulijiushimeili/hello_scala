package scala1

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * 单例对象
  * 在scala中没有静态方法和静态字段,但是可以使用object关键字加类名的语法结构实现同样的功能
  * 1.工具类:存放常量和工具类方法
  * 2.实现单例模式
  */
object SingletonDemo{
  def main(fd:Array[String]): Unit ={
    //SessionFactory是object类型,所以我们可以直接调用,不需要使用new关键字
    val factory = SessionFactory
    println(factory.getSessions)
    println(factory.getSessions.size)
    factory.removeSession()
    println(factory.getSessions.size)
    println(factory.getSessions.head)

  }

}
//这个相当于java中的静态类,在其他地方调用的时候可以不使用new关键字,而直接使用
object SessionFactory{
  /**
    * 相当于java中的java静态代码块
    */
  println("SessionFactory is envoked")
  var i = 5
  private val session = ArrayBuffer[Session]()

  while(i>0){
    session += new Session
    i -= 1
  }

  def getSessions: mutable.Seq[Session] = session

  def removeSession(): Unit = {
    val s = session(0)
    session.remove(0)
    println("session 被移除:" + s)
  }


}

class Session{

}



