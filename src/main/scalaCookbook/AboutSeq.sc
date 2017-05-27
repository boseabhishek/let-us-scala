case class Employee(name: String, age: Int)
case class Student(name: String, age: Int)

val ls = List(
  Some(Employee("a", 1)),
  Some(Employee("B", 2)),
  Some(Employee("C", 5)),
  Some(Employee("D", 8)),
  Some(Employee("G", 9)),
  Some(Employee("H", 6)),
  None
).flatten

val newLIst = ls map {
  x => x
}