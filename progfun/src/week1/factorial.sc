package week1
// Week1 Lecture 1.7
// Design a tail recursive version of factorial
object factorial {
  def factorial(n: Int) = {
  
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
      
    loop(1, n)
  }                                               //> factorial: (n: Int)Int

  factorial(4)                                    //> res0: Int = 24
}