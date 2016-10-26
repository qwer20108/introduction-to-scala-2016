// Curry
def summation(fun: Int => Int)(start: Int, end: Int): Int = {
  if (start > end) 0
  else fun(start) + summation(fun)(start + 1, end)
}

def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)

def sumNumber = summation(x => x) _
def sumCubes: (Int, Int) => Int = summation(x => x * x * x)
def sumFactorials = summation(factorial) _

sumNumber(1, 3)
sumCubes(1, 3)
sumFactorials(1, 3)