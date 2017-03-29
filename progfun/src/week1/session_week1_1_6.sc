package week1
// Block and lexical scope
object session_week1_1_6 {

  def sqrt(x: Double) = {
  
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

     def isGoodEnough(guess: Double): Boolean =
    	Math.abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double
  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(1e-6)                                      //> res1: Double = 0.0010000001533016628
  sqrt(1e60)                                      //> res2: Double = 1.0000788456669446E30
}