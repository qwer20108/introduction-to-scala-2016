def summation(fun: Int => Int, start: Int, end: Int): Int = {
  start match {
    case _ if start > end => 0
    case _ => fun(start) + summation(fun, start + 1, end)
  }
}

def number(x: Int): Int = x
def cube(x: Int): Int = x * x * x
// 5 * 4 * 3 * 2 * 1
def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)

def sumNumber(start: Int, end: Int): Int = summation(number, start, end)
def sumCubes(start: Int, end: Int): Int = summation(cube, start, end)
def sumFactorials(start: Int, end: Int): Int = summation(factorial, start, end)

sumNumber(1, 3)
sumCubes(1, 3)
sumFactorials(1, 3)

