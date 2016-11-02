//val x = new Rational(1, 2)
//x.numer
//x.denom
//
//val y = new Rational(2, 3)
//x.add(y)

val x = new Rational(1, 3)
val y = new Rational(5, 7)
val z = new Rational(3, 2)
x.sub(y).sub(z)
y.add(y)
x.less(y)
x.max(y)
new Rational(2)

x.add(y).mul(z)

class Rational (x: Int, y: Int){
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this.less(that)) that else this

  def neg: Rational = new Rational(-numer, denom)

  // dry principle
  def sub(that: Rational) = add(that.neg)
  //    new Rational(
  //      numer * that.denom - that.numer * denom,
  //      denom * that.denom
  //    )

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def mul(that: Rational) =
    new Rational(
      numer * that.numer,
      numer * that.denom
    )

  override def toString = numer + "/" + denom
}

