def f(x: Double) = 1 + x / 2

f(1)
f(2) // fix point

1
f(1)
f(f(1))
f(f(f(1)))
f(f(f(f(1))))
f(f(f(f(f(1)))))
f(f(f(f(f(f(1))))))

import math._

val tolerance = 0.0001
def isCloseEnough(x: Double, y: Double) =
  abs((x - y) / x) / x < tolerance
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    //println("guess =" + guess)
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}
fixedPoint(x => 1 + x / 2)(3)
def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0)
  //fixedPoint(y => (y + x / y) / 2 )(3.0)
sqrt(2)
sqrt(4)

