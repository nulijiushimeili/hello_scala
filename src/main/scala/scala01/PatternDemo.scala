package scala01

object PatternDemo {

  def main(args: Array[String]): Unit = {
    //scala中的switch case
    //scala 中的模式匹配,从上往下执行,最多只能一个
    def f1(count: Int): Unit = {
      count match {
        case 1 => {
          println(11)
        }
        case 2 => {
          println(22)
        }
        case 3 => {
          println(33)
        }
        //count 匹配任意值,并且将count的值赋值给e,e在处理部分可能会用到
        case e => {
          println(s"other $e")
        }
        case _ => {
          //_也可以匹配任意字符,但是不能取到匹配失败的值的,如果用不到那个值,那么这样匹配最好不过了
        }
      }
    }

    f1(1)
    f1(2)
    f1(3)
    f1(4)
  }
}
