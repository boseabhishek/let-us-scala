

//create a def which takes any
// generic object and return list of that object
def abc[T](x: T): List[T] = List(x)

case class Employee(name: String, age: Int)
case class Student(name: String, age: Int)

val e = Employee("Abhi", 22)

val s = Student("Abhi", 22)


// T = Employee here
val list1 = abc(e)


// T = Student here
val list2 = abc(s)