import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

val f1 = Future { 10/0 }
val f2 = Future { 10/10 }
val f3 = Future { Future { 11 } }

val f11 = f1.onComplete{
  case Success(value) => println(s"Got the callback, meaning = $value")
  case Failure(e) => println(e.toString)
}

val f13 = f1.flatMap(a=> a*2)
/*
When in doubt, follow the types:
onComplete returns Unit, it allows you to do something with the Future result, but it won't return a value
flatMap allow you do something with the list and return a new Future

*/
val f12 = f2.isCompleted
