package scala1

import java.sql.DriverManager

object TestJDBC {
  def main(args: Array[String]): Unit = {
    Class.forName("com.mysql.jdbc.Driver")
    try{
      val conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschool?user=root&password=123456")
      val sql = "select * from class"
      val ps = conn.prepareStatement(sql)
      val res = ps.executeQuery()
      while(res.next()){
        println(res.getString(2))
      }
    }catch{
      case x:Exception => println(x.getMessage)
    }
  }
}
