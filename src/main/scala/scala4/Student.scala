package scala4

class Student{
  private var _name :String=_
  private var _age:Int=_

//  def apply(name:String,age:Int): Unit ={
//    this._name = name
//    this._age = age
//  }

  // 注意点: apply方法必须有(),否则无法当做构造器执行
  def apply(){}

  // get方法
  def name: String = _name
  def age : Int = _age

  // set方法
  def setName (name :String): Unit ={this._name = name}
  def setAge (age: Int ) : Unit = this._age = age

  override def toString: String = "name:" + _name + "\tage:" + _age

}

object Student{
  // 注意点: apply方法必须要有(), 否则无法当做构造器来执行
  def apply(): Student = new Student()
}

/**
  * 伴生对象的练习
  *
  * 伴生对象不用new,就可以直接使用
  * 注意点:apply方法必须要有(),否则无法被当做构造器执行
  */
object test01{


  def main(args: Array[String]): Unit = {
    val stu = Student()
    stu.setName("xiaommign")
    stu.setAge(15)
    println(stu)

  }
}