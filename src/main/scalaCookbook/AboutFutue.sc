import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

val numF = Future{ 3 }

val stringF1 = numF.map { x =>
  Future(x.toString)
}
// map creates Future[Future[String]]

val stringF2 = numF.flatMap { y =>
  Future(y.toString)
}
// flatMap creates Future[String]
// it flattens the Future inside

val threeF = Future(3)
val fourF = Future(4)
val fiveF = Future(5)

val resultF = for{
  three <- threeF
  four <- fourF
  five <- fiveF
}yield{
  three * four * five
}

Await.result(resultF, 3 seconds)

//This code will yield 60.
//Under the hood, scala translates this to

val resultF1 = threeF.flatMap(three => fourF.flatMap(four => fiveF.map(five => three * four * five)))