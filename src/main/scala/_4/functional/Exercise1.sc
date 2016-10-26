def summation(fun: Int => Int, start: Int, end: Int): Int =
    if (start > end) 0
    else fun(start) + summation(fun, start+1, end)

def number(n: Int): Int = n
def cube(n: Int): Int = n * n * n
// factorial number: 5 * 4 * 3 * 2 * 1
def factorial(n: Int): Int = if (n == 1) 1 else n * factorial(n - 1)
def factorialTail(n: Int,result: Int): Int = {
  if (n == 1)
    result
  else
    factorialTail(n - 1, n * result)
}
factorialTail(5,1)


def sumNumber(start: Int, end: Int): Int = summation(n => n, start, end)
def sumCubes(start: Int, end: Int): Int = summation(cube, start, end)
def sumFactorials(start: Int, end: Int): Int = summation(factorial, start, end)

sumNumber(1,5)
sumCubes(1,5)

sumFactorials(1,5)




def fibonacciTail(n: Int, current: Int, next: Int):Int = {
  if (n == 0)
    return current
  else
    fibonacciTail( n - 1, next, current + next)
}

fibonacciTail(5,0,1)


// example in Functional Programming Principles in Scala course
def summationNotTail(fun: Int => Int, start: Int, end: Int): Int =
  if (start > end) 0 else fun(start) + summationNotTail(fun, start + 1, end)

summationNotTail((x :Int) => x, 1, 10 )

def summationTail(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a , 0)
}

summationTail((x :Int) => x)(1, 10)

def summationTail2(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a , 0)
}

summationTail2((x :Int) => x, 1, 10)