val list = List.range(1, 10)


val mapList = list.map(x => x * 2)

val list1 = List.range(41, 50)

val x1 = list map { x =>
  x % 2 match {
    case 0 => list map (_ * 3)
    case 1 => list map (_ * 4)
  }
}
x1.size

val x4 = x1.flatten
val x2 = list flatMap { x =>
  x % 2 match {
    case 0 => list1 map (x => x * 3)
    case 1 => list1 map (x => x * 4)
  }
}
val x3 = list map { x =>
  x % 2 match {
    case 0 => list1 map (x => x * 3)
    case 1 => list1 map (x => x * 4)
  }
}

//
//     you can see unlike Java,
//     map function takes another function x => x*2
//     In Java, you can take an arg not function and
//    then the method body acts on the arg

list
// see it's immutable, though declared a var

// --------  foreach -----------

list foreach (x => x * 2)

//it doesn’t return anything, it’s said that it’s used for its
//"side effects"

//foreach is a higher order function
// takes any function
// which takes an element but return unit

// Then, how to use foreach???

list foreach (x => println(x * 2))
//Can be used for printing



