
// Functional Programming Basics


//eligibility is a higher order function
def eligibility(name: String, ownAge: Int, standardAge: Int,
      f:(Int, Int) => Boolean): String = {

  val decision = f(ownAge, standardAge) // f takes Int returns Boolean

  s"$name is eligible for selection - $decision"

}


def determine(x: Int, y: Int): Boolean =  x > y

// Now, we would call the function

val message = eligibility("Mark", 25, 27, determine)