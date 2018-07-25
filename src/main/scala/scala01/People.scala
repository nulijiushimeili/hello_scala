package scala01

// 默认的类是public级别的
class People {
  var age = 18      // 字段必须初始化
  def Age = age  // 这是一个方法,没有参数,()可以省略
  def increment(){this.age+=1}
}


// private的使用
class Student{
  val age = 20    // 编译器会自动为私有的属性添加get/set方法
  private[this] val gender = "male"  // private[this] , 表示只有该类的this可以使用
  private var name = "clow"

  // 也可以自己指定get/set方法
  def getName=this.name
  def setName(value:String){this.name=value}
}


// 构造器的使用
class Teacher{
  var age : Int =_

  var name : String = _

  def this (age:Int,name:String){
    this()  // 必须要调用一次主构造器
    this.age = age
    this.name = name
  }
}