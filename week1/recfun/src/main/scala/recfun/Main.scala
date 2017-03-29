package recfun

import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    // Exercise 1
    println(pascal(0, 2)) //1
    println(pascal(1, 2)) //2
    println(pascal(1, 3)) //3

    // Exercise 2
    println(balance("(if (zero? x) max (/ 1 x))".toList)) //true
    println(balance("())(".toList)) //false


    // Exercise 3
    println(countChange(4, List(1, 2))) //3
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance_1(chars: List[Char]): Boolean = {
    // find parentheses pairs in the string
    def recursion(chars: List[Char], countOfLeftParentheses: Int): Boolean = {
      if (chars.isEmpty) {
        countOfLeftParentheses == 0
      }
      else {
        val first_char = chars.head
        val countOfLeftParenthesesAdjusted =
          if (first_char == '(') countOfLeftParentheses + 1
          else if (first_char == ')') countOfLeftParentheses - 1
          else countOfLeftParentheses

        if (countOfLeftParenthesesAdjusted >= 0) recursion(chars.tail, countOfLeftParenthesesAdjusted) //chars.tail returns the list without the first element
        else false
      }
    }

    recursion(chars, 0)
  }

  def balance(chars: List[Char]): Boolean = {

    def balanced(chars: List[Char], countOfLeftParentheses: Int): Boolean =
      if (chars.isEmpty) countOfLeftParentheses == 0
      else if (chars.head == '(') balanced(chars.tail, countOfLeftParentheses + 1)
      else if (chars.head == ')') countOfLeftParentheses > 0 && balanced(chars.tail, countOfLeftParentheses - 1)
      else balanced(chars.tail, countOfLeftParentheses)

    balanced(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty) 0
      else if (money - coins.head == 0) 1 // money == first coin
      else if (money - coins.head < 0) 0 // money is not enough
      else countChange(money - coins.head, coins) + countChange(money, coins.tail) // use the first coin and don't user first coin
    }

    count(money, coins.sorted)
  }
}
