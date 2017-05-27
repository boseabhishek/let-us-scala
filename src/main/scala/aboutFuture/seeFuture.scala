package aboutFuture

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Random, Success}

/**
  * A Scala 'Future' example from the Scala Cookbook.
  * @see http://shop.oreilly.com/product/0636920026914.do
  */
object seeFuture extends App {

  // not too exciting, the result will always be 42. but more importantly, when?
  println("1 - starting calculation ...")
  val f = Future {
    sleep(Random.nextInt(500))
    42
  }

  println("2 - before onComplete")
  f.onComplete {
    case Success(value) => println(s"Got the callback, meaning = $value")
    case Failure(e) => e.printStackTrace
  }

  // do the rest of your work
  println("A ..."); sleep(100)
  println("B ..."); sleep(100)
  println("C ..."); sleep(100)
  println("D ..."); sleep(100)
  println("E ..."); sleep(100)
  println("F ..."); sleep(100)

  // keep the jvm alive (may be needed depending on how you run the example)
  //sleep(2000)

  def sleep(duration: Long) { Thread.sleep(duration) }

}

/*
++++++++++
The Answer
++++++++++

The answer is that this program can print different results each time it runs.
Because the Random.nextInt method call is used inside the Future --
and because of the way the onComplete method works -- the result is indeterminate.

When it’s run one time, the result might look like this:

1 - starting calculation ...
2 - before onComplete
A ...
Got the callback, meaning = 42
B ...
C ...
D ...
E ...
F ...
If it’s run again, the output may look like this:

1 - starting calculation ...
2 - before onComplete
A ...
B ...
C ...
Got the callback, meaning = 42
D ...
E ...
F ...
And so on.

The Future 'onComplete' method
One of the “secrets” of this example is the onComplete method.
It’s a callback method, and in this case it’s called whenever the Future completes.

I’ll add more Scala Future examples here as time goes on,
but for now I’ll just say that if you want more information, I describe this more in the Scala Cookbook:
 */