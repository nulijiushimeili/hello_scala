package scala01

/**
  * 高阶函数
  */
object HighOrderFunctionDemo {
  def main(args: Array[String]): Unit = {
    //高阶函数
    def sayHello(word: String, say: (String) => Unit) {
      println(word)
    }

    def sayHi(name:String = "Lixiaolu"): Unit = {
      println(name)
    }

    sayHello("Hello! ", sayHi)

    //高阶函数一般与匿名函数一起使用
    sayHello("Tom", (name: String) => println(s"Hi! $name"))

    //高阶函数的自动类型推断,
    //可以将参数的类型省略
    sayHello("gosiling", (name) => println(s"Hello,$name"))

    //如果只有一个参数,参数的小括号可以干掉,但是不能产生歧义
    sayHello("jackson", name => println(s"how do you do ,$name}"))

    // _ 作为高阶函数中的参数占位,
    sayHello("tomson", println(_))
  }
}
