package week1

object session_week1_1_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(170); 
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(181); 
	
	// is not prcise for small number and lead non-termination for very large numbers
  def isGoodEnough(guess: Double, x: Double): Boolean =
    Math.abs(guess * guess - x) < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(79); 

  def improve(guess: Double, x: Double): Double =
    (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(42); 

  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(13); val res$1 = 
  sqrt(1e-6);System.out.println("""res1: Double = """ + $show(res$1));$skip(209); 
  //sqrt(1e60)
  //Exercise: design isGoodEnough can work with very small and huge number like 1e-6 and 1e60
	def isGoodEnough_2(guess: Double, x: Double): Boolean =
    Math.abs(guess * guess - x) /x < 0.001;System.out.println("""isGoodEnough_2: (guess: Double, x: Double)Boolean""")}
}
