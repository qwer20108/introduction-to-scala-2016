// Curry
def summation(fun: Int => Int)(start: Int, end: Int): Int ={
  if (start > end)
    0
  else
    fun(start) + summation(fun)(start + 1, end)
}
def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  sumF
}

def sumNumber = ???
def sumCubes = ???
def sumFactorials = ???

def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
//{
//  if (a >b) 1
//  else f(a) * product(f)(a + 1, b)
//}
product(x => x * x)(3, 5)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int) (a: Int, b: Int): Int ={
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
}

( 3 * 3 ) * mapReduce(x => x * x, (x, y) => x * y , 1)(4, 5)
( 3 * 3 ) * (4 * 4) * mapReduce(x => x * x, (x, y) => x * y , 1)(5, 5)
( 3 * 3 ) * (4 * 4) * ( 5 * 5) * mapReduce(x => x * x, (x, y) => x * y , 1)(6, 5)
3 * 3 * 4 * 4 * 5 * 5 * 1 

def fact(n: Int) = product(x => x)(1, n)
fact(5)


def filter(xs: List[Int], p: Int => Boolean): List[Int] =
  if (xs.isEmpty) xs
  else if (p(xs.head)) xs.head :: filter(xs.tail, p)
  else filter(xs.tail, p)
def modN(n: Int)(x: Int) = (x % n) == 0
val nums = List(1, 2, 3, 4, 5, 6, 7, 8)

filter(nums, modN(2))

filter(nums, modN(3))
