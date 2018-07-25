package scala1

/**
  * 声明类的时候不需要加public关键字,默认情况下就是public
  * 一个类文件可以声明多个类
  * 注意点:使用val修饰的变量,不能给懂默认值否则会编译通不过
  * val id:Int = _    xxxxxxx这样写会报错
  */

class Person{

  //使用val声明的变量相当于只有get方法没有set方法
  val id:Int = 0
  //使用var声明的变量是具有get方法和set方法的
  var name:String = _
    //使用private是本类私有变量,只有在本类和伴生对象才可以访问
  private var age:Int = _
  //使用private[this]关键字修饰的变量只可以在本类中使用,在伴生对象和其他地方是不可以访问到的
  private[this] val gender:String = "male"

}

object Person{
  def main(dfs:Array[String]): Unit ={
    val p = new Person()
    p.name = "xiaoming"
    p.age = 25
    //gender 被private[this]修饰了,所以不能再本类之外访问
//    p.gender = male
    println(p.name)
    println(p.age)

  }

}

object TestClass {

}
