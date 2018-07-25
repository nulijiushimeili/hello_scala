package scala3

object HighOlderFunctionDemo {
  def main(args: Array[String]): Unit = {
    //高阶函数
    //
    def sayHello(words:String,say:(String)=> Unit): Unit = {
      say(words)
    }

    def sayHi(name:String):Unit = {
          println(name)
    }

    sayHello("jeck",sayHi)

    //高阶函数一般与匿名函数一起使用
    sayHello("tom",(name:String)=>println(s"hi,$name"))

    //高阶函数的自动类型推断,
    //可以将参数的类型省略
    sayHello("gosiling",(name)=>println(s"Hello,$name"))

    //如果只有一个参数,参数的小括号可以干掉,但是不能产生歧义
    sayHello("jackson",name=>println(s"how do you do ,$name"))

    // _ 作为高阶函数中的参数占位,
    sayHello("tomson",println(_))
  }
}
