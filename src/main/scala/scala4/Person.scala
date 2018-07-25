package scala4

//单例对象
object Person {
  private var lastId = 0

  def newPersonId(): Int = {
    lastId += 1
    lastId
  }
}
object test{
  def main(args: Array[String]): Unit = {
    println(Person.newPersonId())
  }
}