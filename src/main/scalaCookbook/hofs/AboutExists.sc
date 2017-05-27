case class banana(name: String, age: Int)

case class apple(ban: banana)

case class orange(apples: List[apple])

val l = List(apple(banana("one", 1)),
  apple(banana("two", 2)),
  apple(banana("three", 3)))

val ora = orange(l)

val x = !ora.apples.exists(_.ban.age == 1)// have age=1