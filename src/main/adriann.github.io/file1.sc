//Write a function that returns the largest element in a list.

val l = List.range(1, 11)
val l1 = List(67, 87, 34, 22, 99, 123, 65, 11)

def findHighest(l1: List[Int]) = l1.sorted.last

findHighest(l1)


// Write function that reverses a list, preferably in place.

l1.reverse

//Write a function that checks whether an element occurs in a list.

l1.contains(123)

//Write a function that returns the elements on odd positions in a list.

l1.filter(x => l1.indexOf(x)%2==0)

//Write a function that computes the running total of a list.

l1.foldLeft(0)((acc, l) => acc+l)

//Write a function that tests whether a string is a palindrome.

val s = "civic"

s.reverse == s

//Write a function on_all that applies a function to every element of a list. Use it to print the first twenty perfect squares (a natural number n is a perfect square if it can be written as n=m*m for some other natural number m. 1,4,9,16,25 are the first 5).

l.map(a=>a*a)

//Write a function that concatenates two lists. [a,b,c], [1,2,3] → [a,b,c,1,2,3]

l:::l1

