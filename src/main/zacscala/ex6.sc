//1 Create an anonymous function
(x: Int) => x*2
// takes and int, returns multiplied by 2

//2. Call the anonymous function created
//res0(2)
//res0 can't be resolved by worksheet, but resolved by REPL!!: worksheet bug

//so we rewrite the above function as

def timesTwo = (x: Int) => x*2

// Now, call it
timesTwo(2)

// 3. Write a function that takes in two Ints and returns their sum
def sum = (x1: Int, x2: Int) => x1 + x2

sum(4,5)

//4. Write a function which takes in an Int and a String and
// returns a Boolean based on whether the length of the String matches the Int value

//anonymous

(s: String, n: Int) => s.length == n

//named function

def checkLength = (s: String, n: Int) => s.length == n

checkLength("Abhishek", 9)

checkLength("Abhishek", 8)

//5. Write an ‘isEven’ function which takes in an Int and
// returns a Boolean based on whether the int was even or not.

//anonymous
(num: Int) => num % 2 == 0

//named function

def isEven = (num: Int) => num % 2 == 0

isEven(10)

isEven(7)

//6. Define a negate function which will return the opposite Boolean
// value of whatever function it was given.
//    a. Negate takes in a function of the type (Int => Boolean)
//    b. If the function returns true, negate will return false. If the function returns false, negate will return true.

