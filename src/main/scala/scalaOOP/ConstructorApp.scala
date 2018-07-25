package scalaOOP

/**
  * 附属构造器必须先调用主构造器才可以使用
  */
object ConstructorApp {
  def main(args: Array[String]): Unit = {
//    val person = new Person("tom",20)
    val person = new Person("jack",25,"male")
    println(person.name + " " + person.age + " " + person.school)

  }
}

// 跟在类名后面的()代表的是主构造器
class Person(val name: String,val age: Int){
  println("Person Constructor enter...")

  val school = "jld-edu"
  var gender: String = "male"

  // 附属构造器必须要先调用主构造器
  def this(name:String,age:Int, gender:String) {
    this(name,age)    // 附属构造器必须要先调用主构造器
    this.gender = gender
  }

  println("Person constructor leave...")
}