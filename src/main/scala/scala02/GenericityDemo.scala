package scala02

class Person{}
class Teacher extends Person{}

/**
  * scala 泛型
  */
object GenericityDemo {
  def main(args: Array[String]): Unit = {

  }

  /**
    * 协变
    * 子类转成父类,向上转型
    */
  def f1 (): Unit ={
    class Queue[+T]
    val queue1 : Queue[Person] = new Queue[Person]()
    val queue2 : Queue[Teacher] = new Queue[Teacher]()
    val q1:Queue[Person] = queue2
  }

  /**
    * 逆变
    * 父类转成子类向下转型
    */
  def f2(): Unit ={
    class Queue[-T]
    val queue1 : Queue[Person] = new Queue[Person]()
    val queue2 : Queue[Teacher] = new Queue[Teacher]()
    val q2: Queue[Teacher] = queue1

  }
}
