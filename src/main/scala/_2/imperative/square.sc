def square(x: Double) = x * x
square(2)

square(5 + 4)

square(square(4))

def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
sumOfSquares(4, 5)

//def power(x: Double, y: Int): Double = {
//
//}

//substitution model. //call by value  function arg only once
sumOfSquares(3, 2+2)
sumOfSquares(3, 4)
square(3) + square(4)
3 * 3 + square(4)
9 + 4 * 4
9 + 16
25

// call by name
// a function argument is not evaluated at all
// if the corresponding parameter is not used in the evaluation of the function's body.
sumOfSquares(3, 2+2)
square(3) + square(2+2)
3 * 3 + square(2+2)
9 + square(2+2)
9 + (2+2) * (2+2)
9 + 4 * (2+2)
9 + 4 * 4


def test(x:Int, y:Int)= x * x
test(2,3)
2 * 2
4
test(3+4, 8)

test(7, 8)
7 * 7
49

(3+4) * (3+4)
7 * (3+4)
7 * 7
49

test(7, 2*4)

test(7 , 8)
7 * 7
49

7 * 7
49

test(3+4, 2*4)

test(7,2*4)
test(7,8)
7*7
49

(3+4) * (3+4)
7 * (3+4)
7*7
49

//def loop: Int = loop
//def first(x: Int, y: Int) = x
//first(1, loop)
//scala is use call by value

//def loop: Int = loop
//def constOne(x: Int, y: => Int) = 1
//constOne(1+2,loop)

//constOne(loop,1+2)

def abs(x: Double) = if (x >= 0) x else -x

val x = 2
val y = square(x)

def and(x: Boolean, y: Boolean): Boolean = {
  x & y
}

def or(x:Boolean,y: =>Boolean) = if(x) true else y

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)
def isGoodEnough(guess: Double, x:Double): Boolean =
  abs(guess * guess - x) / x < 0.001
def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2
def sqrt(x: Double) = sqrtIter(1.0, x)
sqrt(2)
sqrt(4)

sqrt(0.001)
sqrt(0.1e-20)
sqrt(1.0e20)
sqrt(1.0e50)

