// only use collection's API

// find the maximum number of Seq with fun
def larges(fun: Int => Int,
           inputs: Seq[Int]): Int = {
  inputs.map(fun).max
}

// find the maximum number of index of Seq with fun
def largesIndex(fun: Int => Int,
                inputs: Seq[Int]): Int = {
  inputs.map(fun).zipWithIndex.maxBy(_._1)._2
}

larges(x => 10 * x - x * x, 1 to 10)
largesIndex(x => 10 * x - x * x, 1 to 10)