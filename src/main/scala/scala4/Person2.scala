package scala4

//伴生对象,类和对象的名字必须一致
class Person2{
  private val id = Person2.newPersonId()
  private var name = ""
  def this(name:String){
    this
    this.name = name
  }
  def info(): Unit = {printf("编号%s的人是%d \n",name,id)}

}

//只要定义在object里面的方法是静态的,可以直接在外面调用
object Person2 {
  private var lastId = 0
  private def newPersonId(): Int ={
    lastId += 1
    lastId
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Person2("xiaoming")
    val p2 = new Person2("xiaohua")
    p1.info()
    p2.info()
  }
}
