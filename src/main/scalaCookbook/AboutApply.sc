class Foo

// object when declared creates module
object FooMaker {
  def apply() = new Foo
}

val foo = new Foo

val fooUsingFooMaker = FooMaker()

// ------------------------------------

class Bar {
    def apply() = 0
   }

val bar = new Bar

val x = bar()

// ------------------------------------
class A {
  def apply(x: Int) = x + 1
}

val a = new A

val y = a(5)
//or,
val z = a.apply(5)