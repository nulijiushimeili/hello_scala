package scala2

import java.io.FileOutputStream
import java.net.URL

object TestNet {

  def testURL(): Unit ={

    val url = new URL("http://flume.apache.org/FlumeUserGuide.html")
    val file = url.getFile
    println(file)
    val content = url.getContent
    println(content)
    val host = url.getHost
    println(host)
    val port = url.getPort
    println(port)
    val protocol = url.getProtocol
    println(protocol)
    val query = url.getQuery
    println(query)
  }

  //两个最重要的方法openConnectiong(),openStream()
  def testContent(): Unit ={
    val url = new URL("http://flume.apache.org/FlumeUserGuide.html")
    val conn = url.openConnection()
    val is = conn.getInputStream
    val os = new FileOutputStream("D:\\tmp\\flume.html")
    val buffer = new Array[Byte](1024)
    var flag = 0
    while(-1 != flag){
      flag = is.read(buffer, 0, buffer.length)
      os.write(buffer, 0, flag)
    }
    println("Download file success!")
    os.close()
    is.close()

  }

  def main(args: Array[String]): Unit = {
    testContent()

  }
}
