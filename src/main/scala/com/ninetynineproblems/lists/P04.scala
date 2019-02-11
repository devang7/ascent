package com.ninetynineproblems.lists

/***
Find the number of elements of a list.

Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
*/

class P04 {
  def lengthOfList[T](x: List[T]): Int = {
    x match {
      case Nil => 0
      case head :: tail => 1 + lengthOfList(tail)
    }
  }
}
