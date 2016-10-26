val n = 6
for {
  i <- 0 to n
  j <- 0 to i} {
  print("*")
  if (i == j)
    println("")
}
