package scala01

object MutableParams {
  def main(args: Array[String]): Unit = {
//    println(sum(4,5,5,6))
//    println(getString("hello","java","scala"))
//    testFor()
//    testFunc()
    println(testFunc2())
  }


  // 不定参数
  def sum(num:Int*): Int ={
    var res = 0
    for(i <- num)res+=i
    res
  }

  // 不定参数
  def getString(strs:String*):String={
    var newStr = ""
    for(str <- strs)newStr = newStr.concat(str)
    newStr
  }


  def getMax(a:Int,b:Int):Int={
    if (a > b) a else b
  }

  // for test
  def testFor(): Unit ={
    for (i <- 1 to 10)println(i)
    for (i <- 1.to(10))println(i)
  }

  // test function
  def testFunc(): Unit ={
    val courses = Array(1,2,3,4,5)
    courses.foreach(course => println(course))
  }

  // test 命名函数
  def testFunc2(): Int ={
    var res= 0
    var (num1,num2)=(100,0)
    while(num1>num2){
      res+=num2
      num2+=1
    }
    res
  }

}
