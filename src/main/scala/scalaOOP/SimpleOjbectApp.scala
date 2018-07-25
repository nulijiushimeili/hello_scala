package scalaOOP

/**
  * // private [this] 表示只能在class内部使用
  * private [scala] val gender = "male"
  */

/**
  * // 子类继承父类,子类中特有的属性需要使用var 关键字修饰,否无法设置新值
  * // 继承父类后会先调用父类的主构造器,
  */
object SimpleOjbectApp {
  def main(args: Array[String]): Unit = {
//    val p = new People()
//    p.name="jjva"
//    p.age=123
//    println(p.name + "-----" + p.age)
//    println(p.eat())
//    p.watchFootball("Barcelona")

    val stu = new Student("name",23,"java")
    println(stu.name + " " + stu.age + " " + stu.major)
    println(stu.toString)
  }
}

class People{
  // 定义属性变量
  // val 定义的属性不能在改变
  var name:String=_
  var age:Int=_

  def this(name:String,age:Int){
    this()
    println("People constructor enter...")
    this.name = name
    this.age = age
    println("People constructor leave...")
  }

  // private [this] 表示只能在class内部使用
  private [scalaOOP] val gender = "male"

  def printInfo(): Unit ={
    println("gender : " + gender)
  }


  def eat(): String ={
    name + " eat..."
  }

  def watchFootball(teamName:String): Unit ={
    println(name + " is watching match of " + teamName)
  }
}

// 子类继承父类,子类中特有的属性需要使用var 关键字修饰
// 继承父类后会先调用父类的主构造器,
class Student(name:String,age:Int,var major:String)extends People(name,age){
  println("Student constructor enter...")

  println("Student constructor leave...")

  // 重写toString方法, 必须要有override关键字
  override def toString: String = "Student: override toString method."
}
