package scala1

/**
  * 伴生对象
  * 与类名想通,并且使用object修饰的对象是伴生对象
  * 类和其伴生对象可以相互访问对方的私有属性和方法
  */

//create dog class
class Dog{
  private var name:String = "wangCai"
  def say(): Unit ={
    println(this.name + ":" + Dog.constant)
  }
}
object Dog{
  private val constant = "wang wang wang"
  def main(dfs:Array[String]): Unit ={
    val dog = new Dog()
    dog.say()
    println(dog.name)
    dog.name = "daHuang"
    println(dog.name)
  }
}



object TestObjectAndClass {

}
