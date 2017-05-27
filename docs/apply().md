apply()
-------

Any Scala class/object can have an apply() method. apply() is nothing just passing param(s) on an instance.

so, a(1) or, a.(1) or, a.apply(1) are the same. But, to accomodate, we need to override the apply() function.

To use the apply() method in class, we need to instantiate the class and call apply() on the instance.

To use the apply() method in object, we can call apply() directly on the object name.

N.B. Call apply on an instance of a class or on objects (apply() method must be present inside the class/object).

// ------------------------------
class Foo {}

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

// -----------------------------------
