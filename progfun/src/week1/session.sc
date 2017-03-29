package week1

object session {
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double
	
	// is not prcise for small number and lead non-termination for very large numbers
  def isGoodEnough(guess: Double, x: Double): Boolean =
    Math.abs(guess * guess - x) < 0.001           //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double): Double =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(1e-6)                                      //> res1: Double = 0.031260655525445276
  //sqrt(1e60)
  //Exercise: design isGoodEnough can work with very small and huge number like 1e-6 and 1e60
	def isGoodEnough_2(guess: Double, x: Double): Boolean =
    Math.abs(guess * guess - x) /x < 0.001        //> isGoodEnough_2: (guess: Double, x: Double)Boolean
}