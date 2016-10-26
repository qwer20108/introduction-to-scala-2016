import scala.annotation.tailrec

// Recursive
def fibonacci(n: Int): Int = {
  if (n == 0 || n == 1) 1
  else fibonacci(n - 1) + fibonacci(n - 2)
}

// Tail-Recursive
def fibTail(n: Int): Int = {
  @tailrec
  def acc(n: Int, previous: Int, current: Int): Int = {
    n match {
      case 0 => current
      case _ => acc(n - 1, current, previous + current)
    }
  }
  acc(n, 0, 1)
}

fibonacci(10)
fibTail(10)