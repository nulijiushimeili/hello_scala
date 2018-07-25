package scala1

/**
  * 构造函数
  */
//在类名后面加上小(),就代表是这个类的构造函数
//构造函数的参数可以使用val,var,修饰,也可以不修饰,如果不使用修饰符,默认是使用的是val修饰(最好还是写上修饰符)
//这个是主构造器
class StructDemo(val name:String, var age:Int, var faceValue:Int=90){
  var gender:String = _
  //踩过的坑:带有返回值的函数一定要注意返回值类型,编译器经常会直接设置返回值类型是unit,导致函数无法正常接收返回值
  def getFaceValue: Int ={
    faceValue
  }

  //创建辅助构造器(辅助构造器的参数不用val,var修饰)
  def this(name:String, age:Int, faceValue:Int,gender:String){
    //辅助构造器必须先调用主构造器
    this(name,age,faceValue)

  }

}

object StructDemo{
  def main(df:Array[String]): Unit ={
    //通过主构造器实例化对象
    val person = new StructDemo("xiaoming",25,99)
    println(person.name)
    println(person.age)
    //构造器中的参数不使用val,var修饰的,实例化以后 直接 访问不到,
//    println(person.faceValue)
    println(person.getFaceValue)


    //通过辅助构造器实例化对象
    val person2 = new StructDemo("xiaohua",16,96,"male")
    println(person2.age)
    //赋值构造器没有getFacevalue这个属性会报错
    println(person2.getFaceValue)


  }
}




object TestStruct {

}
