package goTraits


trait LikeAJavaInterface {
  def iAmAbstract

  def iamAbstractToo(someParam: String): String
}

class SuperClass extends LikeAJavaInterface {
  //Note: You have to implement all the abstract methods
  //from the implementing traits else have to declare the class 'abstract'

  //warning: Do not create an instance of a class inside the body of the same class (same as Java)
  //Infinite recursion - class calls itself
 // val s1 = new SuperClass

  def iAmAbstract = println(s"Implemented iAmAbstract")

  // see: cannot change the return-type (like Java)
  //overidden
  override def iamAbstractToo(someParam: String): String = {
    s"Implemented iamAbstractToo when $someParam is passed"
  }
}

class SuperDuperClass extends SuperClass {

  val s2 = new SuperClass

  def hello = {
    SuperDuperClass.super.iAmAbstract
  }

  def objectEquality: Boolean = SuperDuperClass.super.equals(s2)

  // When a function/var from superclass is overriden in a subclass, override is mandatory
  override def iamAbstractToo(someParam: String): String = {
    s"Overriden iamAbstractToo when $someParam is passed"
  }

}


object ObjectJustToTestThemAbove extends SuperDuperClass{

  val s3 = new SuperClass
  val sd1 = new SuperDuperClass

  def main(args: Array[String]) {

    // it can access any var from anywhere
    s2.iAmAbstract
    println(s2.iamAbstractToo("Test"))

    s3.iAmAbstract
    println(s3.iamAbstractToo("Test"))

    sd1.hello
    sd1.iAmAbstract
    println(sd1.iamAbstractToo("Test"))

    println(sd1.objectEquality)

  }
}
