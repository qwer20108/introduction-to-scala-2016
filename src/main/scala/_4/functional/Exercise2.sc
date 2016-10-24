// hint: nest function
def summation(fun: Int => Int): (Int, Int) => Int = {
  def summationF(a: Int, b: Int): Int =
    if (a > b) 0
    else fun(a) + summationF(a + 1, b)
  summationF
}

def sumNumber = summation(x => x)
def sumCubes = summation(x => x * x *x )
def factorial (x: Int):Int = if(x == 1) 1 else  x * factorial(x - 1)
def sumFactorials = summation(factorial)

sumNumber(1,10)
sumCubes(1,10)
sumFactorials(1,5)
factorial(5)

