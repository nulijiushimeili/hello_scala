package scala1

object MyPredef {
  implicit def fileToRichFile(path:String): RichFile = new RichFile(path)

  implicit def selectGirl: MyGirl => Ordered[MyGirl] with Object {
    def compare(that: MyGirl): Int
  } = (g:MyGirl) => new Ordered[MyGirl] {
    override def compare(that: MyGirl): Int = {
      if(g.faceValue == that.faceValue){
        that.age - g.age
      }else{
        g.faceValue - that.faceValue
      }
    }
  }
}

object MyPredef2{
  implicit def readFile2(path:String): TestImplicit2 = new TestImplicit2(path)

  implicit def add2(num1: Int ):TestImplicit4 = new TestImplicit4(num1)

  implicit def notEquals(v1:Int,v2:Int): Eq = new Eq(v1,v2)

}