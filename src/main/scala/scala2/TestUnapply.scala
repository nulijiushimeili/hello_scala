package scala2

object TestUnapply {
  def main(args: Array[String]): Unit = {
    val mail = apply("xiaoming","163.com")
    println(mail)
    val res = unapply(mail)
    res.foreach(println)
  }

  def apply(user: String, domain: String): String = {
    user + "@" + domain
  }

  def unapply(str: String): Option[(String, String)] = {
    val parts = str.split("@")
    if (parts.length == 2) {
      Some(parts(0), parts(1))
    } else {
      None
    }
  }
}
