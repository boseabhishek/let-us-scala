// Ref:
//https://oldfashionedsoftware.com/2009/07/10/scala-code-review-foldleft-and-foldright/
//https://oldfashionedsoftware.com/2009/07/30/lots-and-lots-of-foldleft-examples/


val l = List.range(1, 10)

//adds everytings in a List[Int]
def sum(l: List[Int]): BigInt = {
  l.foldLeft(0)((a,b) => a+b)
}

def sum2(l: List[Int]): BigInt = {
  l.fold(0)((a,b) => a+b)
}

val sum0 = sum(l)

val sum3 = sum2(l)

////////////////////////////////////
//can also use

val sum1 = l.sum

//also have product, min, max

//////////////////////////////////////////

val s = List("abc", "def", "bhu", "ffg")


def listToString(left: List[String]) : String =
  left.foldLeft(""){(acc, x) => println(s"acc-$acc and x-$x"); s"$acc $x"}.trim

val s1 = listToString(s)