package com.ninetynineproblems.lists

/*
Find out whether a list is a palindrome.

Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
*/
class P06 {
  def isPalindrome[T](x: List[T]): Boolean = {
    x.take(x.length / 2) == reverseList(x.takeRight(x.length / 2))
  }

  private def reverseList[T](x: List[T]): List[T] = {
    x match {
      case Nil => Nil
      case _ => x.last :: reverseList(x.init)
    }
  }
}
