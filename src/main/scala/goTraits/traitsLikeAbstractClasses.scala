package goTraits

trait LikeAJavaAbstractClass {
  def iAmAbstract

  def iamNotAbstract(someParam: String): String =
    s"iamNotAbstract, $someParam is passed"
}

class SuperClass1 extends LikeAJavaAbstractClass {
  //Note: You have to implement all the abstract methods
  //from the implementing traits else have to declare the class 'abstract'


  def iAmAbstract = println(s"Implemented iAmAbstract")

  // needs override for already implemented methods; not needed for abstract overriding
  override def iamNotAbstract(someParam: String): String = {
    s"Implemented iamNotAbstract, $someParam is passed"
  }
}

class SuperDuperClass1 extends SuperClass1 {

  val s2 = new SuperClass1

  def hello = {
    SuperDuperClass1.super.iAmAbstract
  }

  def objectEquality: Boolean = SuperDuperClass1.super.equals(s2)

}


object ObjectJustToTestThemAbove1 extends SuperDuperClass1{

  val s3 = new SuperClass1
  val sd1 = new SuperDuperClass1

  def main(args: Array[String]) {

    // it can access any var from anywhere
    s2.iAmAbstract
    println(s2.iamNotAbstract("Test"))

    s3.iAmAbstract
    println(s3.iamNotAbstract("Test"))

    sd1.hello
    sd1.iAmAbstract

    println(sd1.objectEquality)

  }
}
