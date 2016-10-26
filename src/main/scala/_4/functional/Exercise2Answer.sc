// hint: nest function
def summation(fun: Int => Int): (Int, Int) => Int = {
  def nestFunction(a: Int, b: Int): Int = {
    if (a > b) 0
    else fun(a) + nestFunction(a + 1, b)
  }
  nestFunction
}

def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)

def sumNumber = summation(x => x)
def sumCubes = summation(x => x * x * x)
def sumFactorials = summation(factorial)

sumNumber(1, 3)
sumCubes(1, 3)
sumFactorials(1, 3)