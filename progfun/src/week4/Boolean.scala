package week4

/**
  * Created by hhuang on 3/30/17.
  */
abstract class Boolean {
  def ifThenElse[T](t: => T, e: => T): T

  def < (x: Boolean) = ifThenElse((false, x))

}