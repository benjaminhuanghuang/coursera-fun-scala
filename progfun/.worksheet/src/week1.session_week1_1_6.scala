package week1
// Block and lexical scope
object session_week1_1_6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(401); 

  def sqrt(x: Double) = {
  
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

     def isGoodEnough(guess: Double): Boolean =
    	Math.abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(10); val res$0 = 
  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(13); val res$1 = 
  sqrt(1e-6);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(1e60);System.out.println("""res2: Double = """ + $show(res$2))}
}
